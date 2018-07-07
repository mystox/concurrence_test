package tech.mystox.kafka.producer;

//import kafka.producer.KeyedMessage;
//import kafka.producer.ProducerConfig;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Created by mystoxlol on 2018/3/5, 16:42.
 * company: fastech
 * update record:
 */
public class ProducerDemo
{
    private final Producer<Integer, String> producer;
    private final String topic;
    private final Properties props = new Properties();
    public ProducerDemo(String topic)
    {
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", "10.22.10.139:9092");
        producer = new KafkaProducer<Integer, String>(props);
        this.topic = topic;
    }
    public static void main(String[] args)
    {
        final Producer<Integer, String> producer;
        final String topic="test";
        final Properties props = new Properties();
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", "192.168.0.126:9092");
        producer = new KafkaProducer<Integer, String>(props);
        int messageNo = 1;
        while (true)
        {
            String messageStr = new String("Message_" + messageNo);
            System.out.println("Send:" + messageStr);
            producer.send(new ProducerRecord(topic, messageStr));
            messageNo++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
