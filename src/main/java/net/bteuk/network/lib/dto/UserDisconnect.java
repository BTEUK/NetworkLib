package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("USER_DISCONNECT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDisconnect extends AbstractTransferObject {

    private String uuid;

    private boolean navigatorEnabled;

    private boolean teleportEnabled;

    private boolean nightvisionEnabled;

    private String chatChannel;

    private boolean tipsEnabled;

}
