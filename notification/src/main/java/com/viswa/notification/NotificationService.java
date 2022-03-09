package com.viswa.notification;

import com.viswa.clients.notification.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {
    @Autowired
    public NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest notificationRequest) {
        System.out.println("Notification is sent to the customer id " + notificationRequest.getToCustomerName());
        notificationRepository.save(NotificationHistory.builder()
                .customerId(notificationRequest.getToCustomerId())
                .createdAt(LocalDateTime.now())
                .build());
    }
}
