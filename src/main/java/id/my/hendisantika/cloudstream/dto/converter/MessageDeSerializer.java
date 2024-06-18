package id.my.hendisantika.cloudstream.dto.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.my.hendisantika.cloudstream.dto.Message;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-cloud-stream-kafka-communication
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/18/24
 * Time: 18:49
 * To change this template use File | Settings | File Templates.
 */
public class MessageDeSerializer implements Deserializer<Message> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Message deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(new String(data), Message.class);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}
