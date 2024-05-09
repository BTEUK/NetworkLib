package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Generic transfer object sent through the socket.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ChatMessage.class, name = "CHAT_MESSAGE"),
        @JsonSubTypes.Type(value = DirectMessage.class, name = "DIRECT_MESSAGE"),
        @JsonSubTypes.Type(value = DiscordDirectMessage.class, name = "DISCORD_DIRECT_MESSAGE"),
        @JsonSubTypes.Type(value = DiscordEmbed.class, name = "DISCORD_EMBED"),
        @JsonSubTypes.Type(value = DiscordLinking.class, name = "DISCORD_LINKING"),
        @JsonSubTypes.Type(value = DiscordRole.class, name = "DISCORD_ROLE")
})
public abstract class AbstractTransferObject{}