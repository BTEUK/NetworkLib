package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Data transfer object for adding or removing a discord role for a specific player.
 */
@JsonTypeName("DISCORD_ROLE_UPDATE")
//@JsonDeserialize(using = me.bteuk.proxy.socket.deserializers.ChatMessageDeserializer.class)
//@JsonSerialize(using = ChatMessageSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscordRole {

    private String uuid;

    private String role;

    private boolean addRole;

}
