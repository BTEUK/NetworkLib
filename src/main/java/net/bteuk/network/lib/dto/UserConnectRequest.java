package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@JsonTypeName("USER_CONNECT_REQUEST")
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

    /** The ping of the player */
    private int ping;

    /** All the chat channels to which this user has access. */
    private Set<String> channels;

    /** The tab player instance for this user. */
    private TabPlayer tabPlayer;

}
