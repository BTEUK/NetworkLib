package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.TabEventDeserializer;
import net.bteuk.network.lib.enums.TabEventType;
import net.bteuk.network.lib.serializer.TabEventSerializer;

import java.util.Set;

@JsonTypeName("TAB_EVENT")
@JsonDeserialize(using = TabEventDeserializer.class)
@JsonSerialize(using = TabEventSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TabEvent extends AbstractTransferObject {

    private String uuid;

    private TabEventType type;

    private Set<TabPlayer> players;

}
