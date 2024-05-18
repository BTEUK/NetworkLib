package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.UserConnectRequest;

import java.io.IOException;

public class UserConnectRequestSerializer extends StdSerializer<UserConnectRequest> {

    public UserConnectRequestSerializer() {
        this(null);
    }

    public UserConnectRequestSerializer(Class<UserConnectRequest> vc) {
        super(vc);
    }

    @Override
    public void serialize(UserConnectRequest userConnectRequest, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeStringField("server", userConnectRequest.getServer());
        generator.writeStringField("uuid", userConnectRequest.getUuid());
        generator.writeStringField("name", userConnectRequest.getName());
        generator.writeStringField("playerSkin", userConnectRequest.getPlayerSkin());

        generator.writeArrayFieldStart("channels");
        generator.writeStartArray();
        for (String channel: userConnectRequest.getChannels()) {
            generator.writeString(channel);
        }
        generator.writeEndArray();
    }
}