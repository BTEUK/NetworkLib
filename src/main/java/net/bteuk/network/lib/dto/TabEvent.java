package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.enums.TabEventType;
import net.kyori.adventure.text.Component;

import java.util.Set;

@JsonTypeName("TAB_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TabEvent extends AbstractTransferObject {

    private String uuid;

    private TabEventType type;

    private Set<TabPlayer> players;

}
