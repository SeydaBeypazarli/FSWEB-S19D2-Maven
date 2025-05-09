package com.workintech.s18d4.dto;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public record AccountResponse(long id, String accountName, double moneyAmount, CustomerResponse customerResponse) {
}
