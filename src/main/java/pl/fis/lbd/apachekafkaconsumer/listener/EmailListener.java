package pl.fis.lbd.apachekafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pl.fis.lbd.apachekafkaconsumer.config.KafkaTopicConfig;

@Component
public class EmailListener {

    @KafkaListener(
            topics = KafkaTopicConfig.EMAIL_TOPIC_NAME,
            groupId = "emailId"
    )
    public void emailListener(String data) {
        System.out.println(data);
    }
}
