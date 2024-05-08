package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.serializer.ChatMessageSerializer;
import net.kyori.adventure.text.Component;

@JsonTypeName("DISCORD_DIRECT_MESSAGE")
//@JsonDeserialize(using = me.bteuk.proxy.socket.deserializers.ChatMessageDeserializer.class)
//@JsonSerialize(using = ChatMessageSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscordDirectMessage extends AbstractTransferObject {
}
