/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2019 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.terminal;

import java.util.Objects;
import com.adyen.model.nexo.SaleToPOIRequest;
import com.google.gson.annotations.SerializedName;

/**
 * Terminal API Request
 */
public class TerminalAPIRequest {
    @SerializedName("SaleToPOIRequest")
    private SaleToPOIRequest saleToPOIRequest;

    /**
     * Gets sale to POI request.
     *
     * @return the sale to POI request
     */
    public SaleToPOIRequest getSaleToPOIRequest() {
        return saleToPOIRequest;
    }

    /**
     * Sets sale to POI request.
     *
     * @param saleToPOIRequest the sale to POI request
     */
    public void setSaleToPOIRequest(SaleToPOIRequest saleToPOIRequest) {
        this.saleToPOIRequest = saleToPOIRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerminalAPIRequest that = (TerminalAPIRequest) o;
        return saleToPOIRequest.equals(that.saleToPOIRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleToPOIRequest);
    }

    @Override
    public String toString() {
        return "TerminalAPIRequest{" +
                "saleToPOIRequest=" + saleToPOIRequest +
                '}';
    }

    /**
     * Checks if SaleToAcquirerData is null
     *
     * @return true if sale to acquirer data is null
     */
    public Boolean isSaleToAcquirerDataModelSet() {
        if (this.getSaleToPOIRequest() != null
                && this.getSaleToPOIRequest().getPaymentRequest() != null
                && this.getSaleToPOIRequest().getPaymentRequest().getSaleData() != null
                && this.getSaleToPOIRequest().getPaymentRequest().getSaleData().getSaleToAcquirerData() == null) {
            return true;
        }
        return false;
    }
}
