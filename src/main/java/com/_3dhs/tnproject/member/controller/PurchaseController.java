package com._3dhs.tnproject.member.controller;

import com._3dhs.tnproject.member.dto.PurchaseConfirmationRequest;
import com._3dhs.tnproject.member.dto.PurchaseConfirmationResponse;
import com._3dhs.tnproject.member.service.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/confirm")
//    public ResponseEntity<?> confirmPurchase() {
//        Map<String, Object> confirmResponse = purchaseService.confirmPurchase();
    //        return ResponseEntity.ok().body(confirmResponse);
    public ResponseEntity<?> confirmPayment(@RequestBody PurchaseConfirmationRequest request) {
        // 결제 확인 로직을 호출하고 결과를 반환합니다.
        PurchaseConfirmationResponse response = purchaseService.confirmPurchase(request);
        return ResponseEntity.ok(response);

    }
}
