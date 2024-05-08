package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("DISCORD_EMBED")
//@JsonDeserialize(using = DirectMessageDeserializer.class)
//@JsonSerialize(using = DirectMessageSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscordEmbed extends AbstractTransferObject {

    private String title;

    private String author;

    private String icon;

    private String description;

    private List<EmbedField> fields;

    private String footer;

    /**
     * RGB colour as int.
     */
    private int colour;

}