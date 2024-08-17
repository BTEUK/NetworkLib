package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("ONLINE_USERS_REQUEST")
@NoArgsConstructor
@Getter
@Setter
public class OnlineUsersRequest extends AbstractTransferObject {
}
