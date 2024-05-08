package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.DirectMessage;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class DirectMessageDeserializer extends StdDeserializer<DirectMessage> {

    public DirectMessageDeserializer() {
        this(null);
    }

    public DirectMessageDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public DirectMessage deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonNode node = parser.getCodec().readTree(parser);
        String recipient = node.get("recipient").asText();
        String sender = node.get("sender").asText();
        Component component = GsonComponentSerializer.gson().deserialize(node.get("component").asText());

        return new DirectMessage(recipient, sender, component);
    }
}
