package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.TabPlayer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class TabPlayerDeserializer extends StdDeserializer<TabPlayer> {

    public TabPlayerDeserializer() {
        this(null);
    }

    public TabPlayerDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public TabPlayer deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        JsonNode node = parser.getCodec().readTree(parser);
        String uuid = node.get("uuid").asText();
        String name = node.get("name").asText();
        Component prefix = GsonComponentSerializer.gson().deserialize(node.get("prefix").asText());
        String primaryGroup = node.get("primaryGroup").asText();
        int ping = node.get("ping").asInt();

        return new TabPlayer(uuid, name, prefix, primaryGroup, ping);
    }
}
