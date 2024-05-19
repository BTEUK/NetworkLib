package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.DirectMessage;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class DirectMessageSerializer extends StdSerializer<DirectMessage> {

    public DirectMessageSerializer() {
        this(null);
    }

    public DirectMessageSerializer(Class<DirectMessage> vc) {
        super(vc);
    }

    @Override
    public void serialize(DirectMessage chatMessage, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeStringField("recipient", chatMessage.getRecipient());
        generator.writeStringField("sender", chatMessage.getSender());
        generator.writeStringField("component", GsonComponentSerializer.gson().serialize(chatMessage.getComponent()));

    }
}
