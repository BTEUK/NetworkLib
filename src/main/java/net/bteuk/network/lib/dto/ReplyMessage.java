package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.ComponentDeserializer;
import net.bteuk.network.lib.serializer.ComponentSerializer;
import net.kyori.adventure.text.Component;

@JsonTypeName("REPLY_MESSAGE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReplyMessage extends AbstractTransferObject {

    private String channel;

    private String sender;

    private String message;

    /** Whether the message should also be sent if the player is offline. */
    private boolean offline;

}
