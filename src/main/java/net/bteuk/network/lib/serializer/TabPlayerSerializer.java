package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.TabPlayer;
import net.bteuk.network.lib.dto.UserConnectRequest;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class TabPlayerSerializer extends StdSerializer<TabPlayer> {

    public TabPlayerSerializer() {
        this(null);
    }

    public TabPlayerSerializer(Class<TabPlayer> vc) {
        super(vc);
    }

    @Override
    public void serialize(TabPlayer tabPlayer, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeStringField("uuid", tabPlayer.getUuid());
        generator.writeStringField("name", GsonComponentSerializer.gson().serialize(tabPlayer.getName()));
        generator.writeStringField("prefix", GsonComponentSerializer.gson().serialize(tabPlayer.getPrefix()));
        generator.writeStringField("primaryGroup", tabPlayer.getPrimaryGroup());
        generator.writeNumberField("ping", tabPlayer.getPing());
        generator.writeEndObject();
    }
}