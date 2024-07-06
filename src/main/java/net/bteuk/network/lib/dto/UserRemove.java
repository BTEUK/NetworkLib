package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Event to send when a user has been offline for at least 5 minutes, and has been removed from the proxy.
 * The servers need to know this, so they can update their internal list of users.
 */
@JsonTypeName("USER_REMOVE")
public class UserRemove extends AbstractTransferObject {

    private String uuid;

}