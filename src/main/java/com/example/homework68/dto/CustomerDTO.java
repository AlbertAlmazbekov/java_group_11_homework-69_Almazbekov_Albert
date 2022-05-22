package com.example.homework66.dto;

import com.example.homework66.entity.Customer;
import lombok.*;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PACKAGE)
public class CustomerDTO {
    private int id;
    private String fullname;
    private String email;

    public static CustomerDTO from(Customer user) {
        return builder()
                .id(user.getId())
                .fullname(user.getFullname())
                .email(user.getEmail())
                .build();
    }
}
