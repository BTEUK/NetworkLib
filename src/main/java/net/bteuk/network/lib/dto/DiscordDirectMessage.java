package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("DISCORD_DIRECT_MESSAGE")
//@JsonDeserialize(using = me.bteuk.proxy.socket.deserializers.ChatMessageDeserializer.class)
//@JsonSerialize(using = ChatMessageSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscordDirectMessage extends AbstractTransferObject {

    private String recipient;

    private String message;

}
