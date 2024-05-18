package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.kyori.adventure.text.Component;

@JsonTypeName("USER_CONNECT_REPLY")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserConnectReply extends AbstractTransferObject {

    private String uuid;

    private boolean navigatorEnabled;

    private boolean teleportEnabled;

    private boolean nightvisionEnabled;

    private String chatChannel;

    private boolean tipsEnabled;

}
