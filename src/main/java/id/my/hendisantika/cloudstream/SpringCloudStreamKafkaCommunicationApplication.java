package id.my.hendisantika.cloudstream;

import id.my.hendisantika.cloudstream.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.function.Consumer;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class SpringCloudStreamKafkaCommunicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamKafkaCommunicationApplication.class, args);
    }

    @Bean
    public Consumer<Message> consumer() {
        return message -> log.info("received {}", message);
    }

}
