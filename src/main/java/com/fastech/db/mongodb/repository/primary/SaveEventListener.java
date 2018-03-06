package com.fastech.db.mongodb.repository.primary;

import com.fastech.db.mongodb.entity.AutoIncKey;
import com.fastech.db.mongodb.entity.SeqInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * Created by mystoxlol on 2017/6/20, 20:03.
 * company: fastech
 * update record:
 */
@Component
public class SaveEventListener extends AbstractMongoEventListener<Object>
{

    @Autowired
    private MongoTemplate firstMongoTemplate;

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Object> event) {
        if (event != null)
        {
            Object source = event.getSource();
            if (source != null) {
                ReflectionUtils.doWithFields(source.getClass(), new ReflectionUtils.FieldCallback() {
                    public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                        ReflectionUtils.makeAccessible(field);
                        // 如果字段添加了我们自定义的AutoIncKey注解
                        if (field.isAnnotationPresent(AutoIncKey.class)) {
                            // 设置自增ID
                            field.set(source, getNextId(source.getClass().getSimpleName()));
                        }
                    }
                });
            }
        }
    }
    private Long getNextId(String colName) {
        Query query = new Query(Criteria.where("colName").is(colName));
        Update update = new Update();
        update.inc("seqId", 1);
        FindAndModifyOptions options = new FindAndModifyOptions();
        options.upsert(true);
        options.returnNew(true);
        SeqInfo seq = firstMongoTemplate.findAndModify(query, update, options, SeqInfo.class);
        return seq.getSeqId();
    }
}
