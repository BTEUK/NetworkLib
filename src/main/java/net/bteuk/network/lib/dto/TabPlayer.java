package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.TabPlayerDeserializer;
import net.bteuk.network.lib.serializer.TabPlayerSerializer;
import net.kyori.adventure.text.Component;

/**
 * Tab Player
 */
@JsonDeserialize(using = TabPlayerDeserializer.class)
@JsonSerialize(using = TabPlayerSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TabPlayer {

    private String uuid;

    private Component name;

    private Component prefix;

    /** The primary group of the player. */
    private String primaryGroup;

    private int ping = -1;

}
