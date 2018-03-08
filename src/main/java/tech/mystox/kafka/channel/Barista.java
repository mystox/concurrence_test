package tech.mystox.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by mystoxlol on 2018/3/6, 16:40.
 * company: fastech
 * update record:Stream应用可以有任意数目的input和output通道，可通过@Input和@Output注解在接口中定义
 * @Input("myinputchannel")
 *
 */
public interface Barista
{
    @Input
    SubscribableChannel orders();

    @Output
    MessageChannel hotDrinks();

    @Output
    MessageChannel coldDrinks();

    @Input("myChannel")
    MessageChannel myChannel();
}
