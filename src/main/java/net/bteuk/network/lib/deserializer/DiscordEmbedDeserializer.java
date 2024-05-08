package net.bteuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.bteuk.network.lib.dto.DiscordEmbed;
import net.bteuk.network.lib.dto.DiscordRole;
import net.bteuk.network.lib.dto.EmbedField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiscordEmbedDeserializer extends StdDeserializer<DiscordEmbed> {

    public DiscordEmbedDeserializer() {
        this(null);
    }

    public DiscordEmbedDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public DiscordEmbed deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        JsonNode node = parser.getCodec().readTree(parser);
        String title = node.get("title").asText();
        String author = node.get("author").asText();
        String icon = node.get("icon").asText();
        String description = node.get("description").asText();
        List<EmbedField> embedFields = new ArrayList<>();
        JsonNode fields = node.get("fields");
        for (JsonNode field : fields) {
            embedFields.add(new EmbedField(
                    field.get("name").asText(),
                    field.get("value").asText(),
                    field.get("inline").asBoolean()
            ));
        }
        String footer = node.get("footer").asText();
        int colour = node.get("colour").asInt();

        return new DiscordEmbed(title, author, icon, description, embedFields, footer, colour);
    }
}
