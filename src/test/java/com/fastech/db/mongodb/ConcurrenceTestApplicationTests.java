package com.fastech.db.mongodb;

import com.fastech.db.mongodb.entity.*;
import com.fastech.db.mongodb.repository.primary.*;
import com.fastech.db.mongodb.repository.redPreference.ReadPreferenceRepository;
import com.fastech.db.mongodb.repository.redPreference.ReadPreferenceRepositoryXuesheng;
import com.fastech.db.mongodb.repository.secondary.SecondRepositoryTemplate;
import com.fastech.db.mongodb.repository.tertiary.AlarmRepository3;
import com.fastech.db.mongodb.repository.tertiary.TertiaryRepositoryTemplate;
import com.mongodb.BasicDBObject;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConcurrenceTestApplicationTests
{

	@Autowired
	FirstRepositoryTemplate firstRepositoryTemplate;
	@Autowired
	TestColFistRepository testColFistRepository;
	@Autowired
	StudentRepository studentRepository;

	@Autowired
    PrimaryRepositoryTemplate primaryRepositoryTemplate;


	@Autowired
	ReadPreferenceRepository readPreferenceRepository;

	@Autowired
	ReadPreferenceRepositoryXuesheng readPreferenceRepositoryXuesheng;

	@Autowired
	SecondRepositoryTemplate secondRepositoryTemplate;


	@Autowired
	TertiaryRepositoryTemplate tertiaryRepositoryTemplate;

	@Autowired
	AlarmRepository3 alarmRepository3;

	@Test
	public void contextLoads()
	{


		/*Student stu = new Student();
//		学生表 stu = new 学生表();

//		stu.setId(123l);
		stu.setName("张三哈");
//		readPreferenceRepositoryXuesheng.save(stu);


//		stu.setName("z"+stu.getId());
		primaryRepositoryTemplete.save(stu, "stu");

//		studentRepository.u
		// service.update(stu);
		System.out.println("已生成ID：" + stu.getId());


//		学生表 student = readPreferenceRepositoryXuesheng.findById(2l);
//		System.out.println(student.toString());

		TestCol testCol = new TestCol();
		testCol.setId(2l);
		testCol.setName("Cap01");
		testCol.setAge(12);
//		testCol.setDate(new Date(0));
//		AlarmDB alarmDB = new AlarmDB();
//		tertiaryRepositoryTemplete.save(alarmDB);
//		testCol.setDate(new Date(111111l));

//		studentRepository.insert(stu);
//		BasicDBObject basicDBObject = new BasicDBObject();
//		basicDBObject.put("name","张三");


//		System.out.println(result);
//		tertiaryRepositoryTemplete.save(alarmDB);
//		testCol.setDate(new Date(1111));

//		tertiaryRepositoryTemplete.save(testCol);*/

	}

//	@Test
	public void testExample()
	{
		Student matcherObject = new Student();
//		matcherObject.setId(17l);
		matcherObject.setNENAME("heihei");

		ExampleMatcher matcher = ExampleMatcher.matching() //构建对象
				.withMatcher("NENAME", ExampleMatcher.GenericPropertyMatchers.exact()) //姓名采用“开始匹配”的方式查询
				.withIgnorePaths("id");  //忽略属性：是否关注。因为是基本类型，需要忽略掉
		Example<Student> example = Example.of(matcherObject, matcher);
		Student student = studentRepository.findOne(7l);
		System.out.println(student);
		Boolean result = studentRepository.exists(example);
		System.out.println(result);
		List<Student> results = studentRepository.findAll(example);
		for (Student student1 : results)
		{
			System.out.println(1);
			System.out.println(student1);
		}
	}


//	@Test
	public void testExist()
	{

		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name", "张三");
		boolean result = studentRepository.existsByCondition(basicDBObject);
		System.out.println(result);
	}

//	@Test
	public void testReadPreference() throws InterruptedException
	{
		TestCol testCol = new TestCol();
		testCol.setId(7l);
		testCol.setName("Cap01");
		testCol.setAge(12);
		for (int i = 600009; i < 1; i++)
		{

			testCol.setId((long) i);
			readPreferenceRepository.insert(testCol);
		}

		Thread.sleep(2000l);
		System.out.println("----------");
		for (int i = 0; i < 100; i++)
		{
			final int b = i;
			Runnable runnable = () ->
			{
				TestCol testCol1 = readPreferenceRepository.findById((long) 10l);
				System.out.println(testCol1.toString());
			};
			runnable.run();
		}


	}


	/**
	 * 测试dbCurse
	 */
//	@Test
	public void testAlarmDB()
	{
		BasicDBObject bdb = new BasicDBObject();
//		bdb.put("RECEIVETIME", new BasicDBObject("$gte", 1505948153000l	).append("$lte", 1506064153000l));// >=
//		bdb.put("CLEARSTATUS", 0);
//		bdb.put("PROJECTSTATUS", 0);
//		bdb.put("SCREENSTATUS", 0);
//		bdb.put("CONFIRMSTATUS", 0);
//		bdb.put("DEL_FLAG", 0);
		bdb.put("ALARMTITLE", "GTPU路径故障");


		BasicDBObject keys = new BasicDBObject();
		List<String> keyList = new ArrayList<>();
		keyList.add("ALARMID");
		keyList.add("ALARMTITLE");
		keyList.add("ALARMSEVERITY");
		keyList.add("LOCATEINFO");
		keyList.add("NENAME");
		for (String key : keyList)
		{
			keys.put(key, 1);
		}
		BasicQuery basicQuery = new BasicQuery(bdb);

		BasicDBObject query = new BasicDBObject();

//		Query query = new Query();
//		Criteria criteria = new Criteria();
//		criteria.equals()
//		query.addCriteria();

		Long startTime = System.currentTimeMillis();
//		System.out.println();
		List<Alarm> alarmDBList = tertiaryRepositoryTemplate.findByCondition(bdb, keys);
		System.out.println(alarmDBList.size());
		long endTime = System.currentTimeMillis();
		System.out.println("first time" + (endTime - startTime));
//		List<AlarmContent> alarmDBList2 =
//				alarmRepository3.findByCondition(bdb,keys);
		System.out.println("list");
		startTime = System.currentTimeMillis();
		alarmDBList =
//				alarmRepository3.findByCondition(bdb,keys);
				tertiaryRepositoryTemplate.findByCondition(bdb, keys);
		endTime = System.currentTimeMillis();
		System.out.println("seceond" + (endTime - startTime));
		System.out.println("count1");
		startTime = System.currentTimeMillis();
		long count =
				alarmRepository3.findByCondition(bdb).size();
//				tertiaryRepositoryTemplete.findCountByCondition(bdb,keys);

		System.out.println(count);
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		System.out.println("count2");
		startTime = System.currentTimeMillis();
		count =
//				alarmRepository3.findCountByCondition(bdb);
				tertiaryRepositoryTemplate.findCountByCondition(bdb, keys);

		System.out.println(count);
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

/*		try
		{
			Thread.sleep(10001l);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("10s");
		startTime = System.currentTimeMillis();
		alarmDBList =
//				alarmRepository3.findByCondition(bdb,keys);
				tertiaryRepositoryTemplete.findByCondition(bdb,keys);
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		try
		{
			Thread.sleep(40001l);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("30s");
		startTime = System.currentTimeMillis();
		alarmDBList =
//				alarmRepository3.findByCondition(bdb,keys);
				tertiaryRepositoryTemplete.findByCondition(bdb,keys);
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);









		System.out.println(alarmDBList.size());*/
	}


//	@Test
	public void testFindAndRemove()
	{

		Alarm alarm = tertiaryRepositoryTemplate.findOneCacheAndRemove();
		System.out.println(alarm.toString());
	}

	@Autowired
	PreconditionResultRepository preconditionResultRepository;
	@Test
	public void findPrecondition()
	{
		PreconditionResult preconditionResult = preconditionResultRepository.findByAlarmId("2111665603_3398992255_3839325977_1683753809");
		System.out.println(preconditionResult);
//		preconditionResultRepository.delete(preconditionResult);
	}


//	@Test
	public void findAndRemove()
	{
		PreconditionTask preconditionTask = new PreconditionTask();
		preconditionTask = firstRepositoryTemplate.findByIdAndDelete("1160833218_1262230724_3603096100_2765209210");

	}

//	@Test
	public void update()
	{

		String alarmId = "3269083239_2234910207_2538297968_1975018502";
		Map<String, Object> condition = new HashedMap();
		condition.put("ALARMTITLE", "L2d");
		condition.put("ALARMSEVERITY", 6);
		firstRepositoryTemplate.update(alarmId,condition);
	}

//	@Test
	public void group()
	{

		for (String neName:
		firstRepositoryTemplate.groupTest())
		{
			System.out.println(firstRepositoryTemplate.findByNename(neName));
		}
	}











}
