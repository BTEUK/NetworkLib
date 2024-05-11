package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("USER_CONNECT_REQUEST")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserConnectRequest {

    private String uuid;

    private String name;

    private String player_skin;

}
