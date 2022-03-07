package com.viswa.clients.fraud;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class FraudCheckResponse {
   Boolean isFraudster;

    public FraudCheckResponse(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

    public Boolean isFraudster() {
        return isFraudster;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (FraudCheckResponse) obj;
        return Objects.equals(this.isFraudster, that.isFraudster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFraudster);
    }

    @Override
    public String toString() {
        return "FraudCheckResponse[" +
                "isFraudster=" + isFraudster + ']';
    }

}
