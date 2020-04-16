package com.dl.project.old;

import java.util.UUID;

class DetailRequest {
    private String name;
    private UUID profileId;
    private UUID partyId;

    public DetailRequest(UUID profileId, UUID partyId, String name) {
        this.name = name;
        this.profileId = profileId;
        this.partyId = partyId;
    }

    public String getName() {
        return name;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public UUID getPartyId() {
        return partyId;
    }
}
