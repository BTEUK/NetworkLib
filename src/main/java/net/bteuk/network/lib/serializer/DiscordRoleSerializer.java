package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.DirectMessage;
import net.bteuk.network.lib.dto.DiscordRole;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class DiscordRoleSerializer extends StdSerializer<DiscordRole> {

    public DiscordRoleSerializer() {
        this(null);
    }

    public DiscordRoleSerializer(Class<DiscordRole> vc) {
        super(vc);
    }

    @Override
    public void serialize(DiscordRole discordRole, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeStringField("uuid", discordRole.getUuid());
        generator.writeStringField("role", discordRole.getRole());
        generator.writeBooleanField("addRole", discordRole.isAddRole());
    }
}
