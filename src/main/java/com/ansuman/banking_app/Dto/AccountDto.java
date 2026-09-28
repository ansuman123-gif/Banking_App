package com.ansuman.banking_app.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor

public class AccountDto {
    private Long id;
    private String AccountHolderName;
    private double balance;
}
