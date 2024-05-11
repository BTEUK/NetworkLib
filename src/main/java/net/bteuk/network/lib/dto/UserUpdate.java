package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.kyori.adventure.text.Component;

import java.util.Set;

@JsonTypeName("USER_UPDATE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserUpdate extends AbstractTransferObject {

    private String uuid;

    private Set<String> channels;

    private Component tabName;

    private int ping = -1;
}
