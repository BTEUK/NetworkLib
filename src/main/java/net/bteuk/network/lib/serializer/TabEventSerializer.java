package net.bteuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.bteuk.network.lib.dto.TabEvent;
import net.bteuk.network.lib.dto.TabPlayer;

import java.io.IOException;

public class TabEventSerializer extends StdSerializer<TabEvent> {

    public TabEventSerializer() {
        this(null);
    }

    public TabEventSerializer(Class<TabEvent> vc) {
        super(vc);
    }

    @Override
    public void serialize(TabEvent tabEvent, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {

        generator.writeStartObject();
        generator.writeString(tabEvent.getUuid());
        generator.writeString(tabEvent.getType().name());

        generator.writeArrayFieldStart("players");
        generator.writeStartArray();
        for (TabPlayer tabPlayer: tabEvent.getPlayers()) {
            generator.writeObject(tabPlayer);
        }
        generator.writeEndArray();
        generator.writeEndObject();
    }
}