package com._3dhs.tnproject.member.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class PurchaseConfirmationRequest {

    private String paymentKey;
    private String orderId;
    private int amount;
}
