package com.viswa.notifcation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {
    @Autowired
    public NotificationRepository notificationRepository;

    public void sendNotification(Integer customerId) {
        System.out.println("Notification is sent to the customer id " + customerId);
        notificationRepository.save(NotificationHistory.builder()
                .customerId(customerId)
                .createdAt(LocalDateTime.now())
                .build());
    }
}
