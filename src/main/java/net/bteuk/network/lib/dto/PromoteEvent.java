package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event to promote or demote a player for a specific role.
 */
@JsonTypeName("PROMOTE_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PromoteEvent extends AbstractTransferObject {

    private String uuid;

    private String role;

    private boolean promote;
}
