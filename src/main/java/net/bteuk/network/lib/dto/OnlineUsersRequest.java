package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("ONLINE_USERS_REQUEST")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OnlineUsersRequest extends AbstractTransferObject {
}
