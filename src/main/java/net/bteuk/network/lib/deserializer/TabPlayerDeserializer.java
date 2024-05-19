package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.TabPlayer;

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

        return new TabPlayer();
    }
}
