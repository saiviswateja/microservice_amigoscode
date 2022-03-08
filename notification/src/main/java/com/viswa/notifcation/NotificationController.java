package com.viswa.notifcation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/notifications")
@AllArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @GetMapping(path = "{customerId}")
    public void isFraudster(@PathVariable("customerId") Integer customerId) {
        notificationService.sendNotification(customerId);
        log.info("fraud check reuest for  customer {}", customerId);
    }
}
