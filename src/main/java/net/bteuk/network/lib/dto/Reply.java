package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.ReplyDeserializer;
import net.bteuk.network.lib.serializer.ReplySerializer;
import net.kyori.adventure.text.Component;

/**
 * Generic reply object, contains an optional {@link net.kyori.adventure.text.Component}.
 */
@JsonTypeName("REPLY")
@JsonDeserialize(using = ReplyDeserializer.class)
@JsonSerialize(using = ReplySerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reply {

    private Component component;
}
