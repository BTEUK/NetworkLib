package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("PLAYER_DISCONNECT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlayerDisconnect {

    private String player;

}
