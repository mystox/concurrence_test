package tech.mystox.kafka.topic;

//import kafka.admin.AdminClient;

import org.apache.kafka.clients.admin.AdminClient;

import java.util.Properties;

/**
 * Created by mystoxlol on 2018/3/5, 16:05.
 * company: fastech
 * update record:
 */
public class TopicDemo
{
    public static void main(String[] args)
    {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.0.126:9092");
        AdminClient adminClient = AdminClient.create(properties);
//        ArrayList<NewTopic> topics = new ArrayList<NewTopic>();
//        adminClient.create()
    }
}
