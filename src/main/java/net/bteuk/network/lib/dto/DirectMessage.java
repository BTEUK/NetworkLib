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

@JsonTypeName("DIRECT_MESSAGE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DirectMessage extends AbstractTransferObject {

    private String recipient;

    private String sender;

    @JsonSerialize(using = ComponentSerializer.class)
    @JsonDeserialize(using = ComponentDeserializer.class)
    private Component component;

}
