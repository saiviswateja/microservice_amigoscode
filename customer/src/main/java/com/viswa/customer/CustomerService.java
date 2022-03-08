package com.viswa.customer;

import com.viswa.clients.fraud.FraudClient;
import com.viswa.clients.notification.NotificationClient;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;
    private final FraudClient fraudClient;
    private final NotificationClient notificationClient;

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();
        //TODO: check if email is vaid
        //TODO: check if email not taken

        customerRepository.saveAndFlush(customer);
        //The dto for this is deleted we are going to us open feign for this
//        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
//                "http://FRAUD/api/v1/fraud-check/{customerId}",
//                FraudCheckResponse.class,
//                customer.getId()
//        );

        com.viswa.clients.fraud.FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());
        if(fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }
        //TODO: send notification
        //using open feign for sending email
//        restTemplate.getForEntity("http://NOTIFICATION/api/v1/notifications/1", Void.class);

        //using feign for sending email
        notificationClient.sendNotification(customer.getId());
    }
}
