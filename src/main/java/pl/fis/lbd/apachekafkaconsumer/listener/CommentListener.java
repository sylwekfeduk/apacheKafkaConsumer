package pl.fis.lbd.apachekafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pl.fis.lbd.apachekafkaconsumer.config.KafkaTopicConfig;

@Component
public class CommentListener {

    @KafkaListener(
            topics = KafkaTopicConfig.COMMENT_TOPIC_NAME,
            groupId = "commentId"
    )
    public void commentListener(String data) {
        System.out.println(data);
    }
}
