package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.Reply;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class ReplySerializer extends StdSerializer<Reply> {

    public ReplySerializer() {
        this(null);
    }

    public ReplySerializer(Class<Reply> vc) {
        super(vc);
    }

    @Override
    public void serialize(Reply reply, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeStringField("component", GsonComponentSerializer.gson().serialize(reply.getComponent()));
        generator.writeEndObject();
    }
}
