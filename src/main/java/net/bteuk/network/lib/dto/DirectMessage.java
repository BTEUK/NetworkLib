package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.ComponentDeserializer;
import net.bteuk.network.lib.serializer.ComponentSerializer;
import net.kyori.adventure.text.Component;

@JsonTypeName("DIRECT_MESSAGE")
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class DirectMessage extends AbstractTransferObject {

    private final String recipient;

    private final String sender;

    @JsonSerialize(using = ComponentSerializer.class)
    @JsonDeserialize(using = ComponentDeserializer.class)
    private final Component component;

    /** Whether the message should also be sent if the player is offline. */
    private boolean offline = false;

}
