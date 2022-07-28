package pl.fis.lbd.apachekafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pl.fis.lbd.apachekafkaconsumer.config.KafkaTopicConfig;

@Component
public class UserListener {

    @KafkaListener(
            topics = KafkaTopicConfig.USER_TOPIC_NAME,
            groupId = "userId"
    )
    public void userListener(String data) {
        System.out.println(data);
    }
}
