package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.ComponentListDeserializer;
import net.bteuk.network.lib.serializer.ComponentListSerializer;
import net.kyori.adventure.text.Component;

import java.util.List;

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

    @JsonSerialize(using = ComponentListSerializer.class)
    @JsonDeserialize(using = ComponentListDeserializer.class)
    private List<Component> messages;

    private Event joinEvent;

}
