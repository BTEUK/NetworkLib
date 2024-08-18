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
        @JsonSubTypes.Type(value = UserConnectRequest.class, name = "USER_CONNECT_REQUEST"),
        @JsonSubTypes.Type(value = UserConnectReply.class, name = "USER_CONNECT_REPLY"),
        @JsonSubTypes.Type(value = UserDisconnect.class, name = "USER_DISCONNECT"),
        @JsonSubTypes.Type(value = UserRemove.class, name = "USER_REMOVE"),
        @JsonSubTypes.Type(value = UserUpdate.class, name = "USER_UPDATE"),
        @JsonSubTypes.Type(value = SwitchServerEvent.class, name = "SWITCH_SERVER_EVENT"),
        @JsonSubTypes.Type(value = AddTeamEvent.class, name = "ADD_TEAM_EVENT"),
        @JsonSubTypes.Type(value = MuteEvent.class, name = "MUTE_EVENT"),
        @JsonSubTypes.Type(value = OnlineUsersRequest.class, name = "ONLINE_USERS_REQUEST"),
        @JsonSubTypes.Type(value = OnlineUsersReply.class, name = "ONLINE_USERS_REPLY"),
        @JsonSubTypes.Type(value = OnlineUserAdd.class, name = "ONLINE_USER_ADD"),
        @JsonSubTypes.Type(value = OnlineUserRemove.class, name = "ONLINE_USER_REMOVE")
})
public abstract class AbstractTransferObject{}