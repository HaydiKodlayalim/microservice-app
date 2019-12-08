package com.haydikodlayalim.accountservice.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    private String id ;

    private String username;

    private String name;

    private String surname;

    private String email;

    private Date birthDate;
}
