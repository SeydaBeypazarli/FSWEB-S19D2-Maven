package com.workintech.s18d4.dto;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public record CustomerResponse(long id, String email, double salary) {
}