package net.enset.ebankingbackend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.enset.ebankingbackend.enums.AccountStatus;
import java.util.List;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private Customer customer;
    private List<AccountOperation> accountOperations;



}
