package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.btuk.network.lib.enums.ApprovalAction;

@JsonTypeName("REGION_REQUEST_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegionRequestEvent extends AbstractTransferObject {

    private String regionName;

    private String uuid;

    private boolean staffReview;

    private ApprovalAction approvalAction;

    private String reason;

}
