package com.retailbank.creditcardservice.gateway;

import java.util.UUID;

public class CreditCheckRequest {
    private final int citizenNumber;
    private final String uuid = UUID.randomUUID().toString();

    public CreditCheckRequest(int citizenNumber) {
        this.citizenNumber = citizenNumber;
    }

    public int getCitizenNumber() {
        return citizenNumber;
    }

    public String getUuid() {
        return uuid;
    }
}
