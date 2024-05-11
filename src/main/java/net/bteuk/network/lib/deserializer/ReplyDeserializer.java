package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.Reply;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class ReplyDeserializer extends StdDeserializer<Reply> {

    public ReplyDeserializer() {
        this(null);
    }

    public ReplyDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Reply deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        JsonNode node = parser.getCodec().readTree(parser);
        Component component = GsonComponentSerializer.gson().deserialize(node.get("component").asText());

        return new Reply(component);
    }
}