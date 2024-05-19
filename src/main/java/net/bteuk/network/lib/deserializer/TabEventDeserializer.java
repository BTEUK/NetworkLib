package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.TabEvent;
import net.bteuk.network.lib.dto.TabPlayer;
import net.bteuk.network.lib.enums.TabEventType;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TabEventDeserializer extends StdDeserializer<TabEvent> {

    public TabEventDeserializer() {
        this(null);
    }

    public TabEventDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public TabEvent deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        JsonNode node = parser.getCodec().readTree(parser);
        String uuid = node.get("uuid").asText();
        TabEventType type = TabEventType.valueOf(node.get("type").asText());
        Set<TabPlayer> players = new HashSet<>();
        JsonNode playerNodes = node.get("players");
        for (JsonNode playerNode : playerNodes) {
            try (JsonParser tabPlayerParser = playerNode.traverse()) {
                players.add(tabPlayerParser.readValueAs(new TypeReference<TabPlayer>() {}));
            }
        }

        return new TabEvent(uuid, type, players);
    }
}
