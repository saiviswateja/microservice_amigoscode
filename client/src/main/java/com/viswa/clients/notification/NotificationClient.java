package com.viswa.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "notification")
public interface NotificationClient {
    @GetMapping(path = "api/v1/notifications/{customerId}")
    void sendNotification(@PathVariable("customerId") Integer customerId);
}
