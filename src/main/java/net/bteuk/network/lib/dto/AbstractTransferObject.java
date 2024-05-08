package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Generic transfer object sent through the socket.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DirectMessage.class, name = "CHAT_MESSAGE")
})
public class AbstractTransferObject {
}
