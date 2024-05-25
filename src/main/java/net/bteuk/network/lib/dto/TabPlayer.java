package net.bteuk.network.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Tab Player
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TabPlayer {

    private String uuid;

    private String name;

    /** The primary group of the player. */
    private String primaryGroup;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof TabPlayer tabPlayer) {
            // Compare uuid only.
            return uuid.equals(tabPlayer.getUuid());
        }
        return false;
    }
}
