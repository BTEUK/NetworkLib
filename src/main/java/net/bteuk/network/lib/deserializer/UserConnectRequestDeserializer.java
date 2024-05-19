package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.TabPlayer;
import net.bteuk.network.lib.dto.UserConnectRequest;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UserConnectRequestDeserializer extends StdDeserializer<UserConnectRequest> {

    public UserConnectRequestDeserializer() {
        this(null);
    }

    public UserConnectRequestDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public UserConnectRequest deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        JsonNode node = parser.getCodec().readTree(parser);
        String server = node.get("server").asText();
        String uuid = node.get("uuid").asText();
        String name = node.get("name").asText();
        String playerSkin = node.get("playerSkin").asText();

        Set<String> chatChannels = new HashSet<>();
        JsonNode channels = node.get("channels");
        for (JsonNode channel : channels) {
            chatChannels.add(channel.asText());
        }

        TabPlayer tabPlayer;
        try (JsonParser tabPlayerParser = node.get("tabPlayer").traverse()) {
            tabPlayerParser.setCodec(parser.getCodec());
            tabPlayer = tabPlayerParser.readValueAs(new TypeReference<TabPlayer>() {});

        }

        return new UserConnectRequest(server, uuid, name, playerSkin, chatChannels, tabPlayer);
    }
}
