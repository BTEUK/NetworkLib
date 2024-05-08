package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.DirectMessageDeserializer;
import net.bteuk.network.lib.serializer.DirectMessageSerializer;
import net.kyori.adventure.text.Component;

@JsonTypeName("DIRECT_MESSAGE")
@JsonDeserialize(using = DirectMessageDeserializer.class)
@JsonSerialize(using = DirectMessageSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DirectMessage extends AbstractTransferObject {

    private String recipient;

    private String sender;

    private Component component;

}
