package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Channel join event, adds/removes a player from a chat channel.
 */
@JsonTypeName("CHANNEL_JOIN")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ChannelJoin {

    private String channel;

    private String uuid;

    private boolean remove;
}
