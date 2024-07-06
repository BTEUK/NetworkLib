package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.ComponentDeserializer;
import net.bteuk.network.lib.serializer.ComponentSerializer;
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

    private boolean afk;

    private TabPlayer tabPlayer;

    private int ping = -1;
}
