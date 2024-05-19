package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.TabPlayerDeserializer;
import net.kyori.adventure.text.Component;

/**
 * Tab Player
 */
@JsonDeserialize(using = TabPlayerDeserializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TabPlayer {

    private String uuid;

    private String name;

    private Component displayName;

    private int ping = -1;

    private String primaryRole;

}
