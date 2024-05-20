package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.UserConnectRequestDeserializer;
import net.bteuk.network.lib.serializer.UserConnectRequestSerializer;

import java.util.Set;

@JsonTypeName("USER_CONNECT_REQUEST")
@JsonDeserialize(using = UserConnectRequestDeserializer.class)
@JsonSerialize(using = UserConnectRequestSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserConnectRequest extends AbstractTransferObject {

    /** The server to which the player is connecting. */
    private String server;

    /** The uuid of the user */
    private String uuid;

    /** The name of the user */
    private String name;

    /** The player skin id */
    private String playerSkin;

    /** All the chat channels to which this user has access. */
    private Set<String> channels;

    /** The tab player instance for this user. */
    private TabPlayer tabPlayer;

    /** The primary group of the player. */
    private String primaryGroup;

}
