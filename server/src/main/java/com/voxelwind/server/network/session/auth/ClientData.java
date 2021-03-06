package com.voxelwind.server.network.session.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class ClientData {
    @JsonProperty("ClientRandomId")
    private final long clientRandomId;
    @JsonProperty("ServerAddress")
    private final String serverAddress;
    @JsonProperty("SkinData")
    private final byte[] skinData; // Jackson conveniently deserializes from Base64
    @JsonProperty("SkinId")
    private final String skinId;
    /*@JsonProperty("ADRole")
    private final long adRole;
    @JsonProperty("TenantId")
    private final String tenantId;*/
}
