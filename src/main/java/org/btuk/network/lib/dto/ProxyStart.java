package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event for proxy startup.
 */
@JsonTypeName("PROXY_START")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProxyStart extends AbstractTransferObject {
    private long timestamp;
}
