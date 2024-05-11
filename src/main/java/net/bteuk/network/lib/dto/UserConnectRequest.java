package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bteuk.network.lib.deserializer.UserConnectRequestDeserializer;
import net.bteuk.network.lib.serializer.UserConnectRequestSerializer;

import java.util.Set;

@JsonTypeName("USER_CONNECT_REQUEST")
@JsonDeserialize(using = UserConnectRequestDeserializer.class)
@JsonSerialize(using = UserConnectRequestSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserConnectRequest {

    private String uuid;

    private String name;

    private String playerSkin;

    private Set<String> channels;

}
