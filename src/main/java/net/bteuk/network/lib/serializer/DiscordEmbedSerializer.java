package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.DiscordEmbed;
import net.bteuk.network.lib.dto.EmbedField;

import java.io.IOException;

public class DiscordEmbedSerializer extends StdSerializer<DiscordEmbed> {

    public DiscordEmbedSerializer() {
        this(null);
    }

    public DiscordEmbedSerializer(Class<DiscordEmbed> vc) {
        super(vc);
    }

    @Override
    public void serialize(DiscordEmbed discordEmbed, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeStringField("title", discordEmbed.getTitle());
        generator.writeStringField("author", discordEmbed.getAuthor());
        generator.writeStringField("icon", discordEmbed.getIcon());
        generator.writeStringField("description", discordEmbed.getDescription());

        generator.writeArrayFieldStart("fields");
        for (EmbedField field: discordEmbed.getFields()) {
            generator.writeStringField("name", field.getName());
            generator.writeStringField("value", field.getValue());
            generator.writeBooleanField("inline", field.isInline());
        }
        generator.writeEndArray();

        generator.writeStringField("footer", discordEmbed.getFooter());
        generator.writeNumberField("colour", discordEmbed.getColour());
        generator.writeEndObject();
    }
}
