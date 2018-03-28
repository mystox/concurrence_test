package tech.mystox.kafka;

import org.springframework.boot.SpringApplication;


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class,MongoAutoConfiguration.class,MongoDataAutoConfiguration.class})

public class KafkaTestApplication
{
	//测试git提交 2time
	public static void main(String[] args) {
		SpringApplication.run(KafkaTestApplication.class, args);
	}
}
