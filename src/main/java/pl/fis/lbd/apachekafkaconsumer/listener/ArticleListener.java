package pl.fis.lbd.apachekafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pl.fis.lbd.apachekafkaconsumer.config.KafkaTopicConfig;

@Component
public class ArticleListener {

    @KafkaListener(
            topics = KafkaTopicConfig.ARTICLE_TOPIC_NAME,
            groupId = "articleId"
    )
    public void articleListener(String data) {
        System.out.println(data);
    }
}
