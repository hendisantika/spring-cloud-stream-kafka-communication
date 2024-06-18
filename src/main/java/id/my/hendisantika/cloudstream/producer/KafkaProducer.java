package id.my.hendisantika.cloudstream.producer;

import id.my.hendisantika.cloudstream.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-cloud-stream-kafka-communication
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/18/24
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private final StreamBridge streamBridge;

    @Scheduled(cron = "*/2 * * * * *")
    public void sendMessage() {
        streamBridge.send("producer-out-0", new Message(" Yuji from Stream bridge"));
    }
}
