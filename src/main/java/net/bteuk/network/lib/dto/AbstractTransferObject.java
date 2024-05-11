package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Generic transfer object sent through the socket.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Reply.class, name = "REPLY"),
        @JsonSubTypes.Type(value = ChatMessage.class, name = "CHAT_MESSAGE"),
        @JsonSubTypes.Type(value = DirectMessage.class, name = "DIRECT_MESSAGE"),
        @JsonSubTypes.Type(value = DiscordDirectMessage.class, name = "DISCORD_DIRECT_MESSAGE"),
        @JsonSubTypes.Type(value = DiscordEmbed.class, name = "DISCORD_EMBED"),
        @JsonSubTypes.Type(value = DiscordLinking.class, name = "DISCORD_LINKING"),
        @JsonSubTypes.Type(value = DiscordRole.class, name = "DISCORD_ROLE"),
        @JsonSubTypes.Type(value = TabEvent.class, name = "TAB_EVENT"),
        @JsonSubTypes.Type(value = PlayerConnect.class, name = "PLAYER_CONNECT"),
        @JsonSubTypes.Type(value = PlayerDisconnect.class, name = "PLAYER_DISCONNECT")
})
public abstract class AbstractTransferObject{}