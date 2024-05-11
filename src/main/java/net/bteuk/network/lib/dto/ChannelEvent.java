package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * A channel event is sent to create/delete a chat channel.
 */
@JsonTypeName("CHANNEL_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChannelEvent {

    private String channel;

    private boolean delete;

}
