package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.DirectMessage;
import net.bteuk.network.lib.dto.DiscordRole;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class DiscordRoleDeserializer extends StdDeserializer<DiscordRole> {

    public DiscordRoleDeserializer() {
        this(null);
    }

    public DiscordRoleDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public DiscordRole deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        JsonNode node = parser.getCodec().readTree(parser);
        String uuid = node.get("uuid").asText();
        String role = node.get("role").asText();
        boolean addRole = node.get("addRole").asBoolean();

        return new DiscordRole(uuid, role, addRole);
    }
}
