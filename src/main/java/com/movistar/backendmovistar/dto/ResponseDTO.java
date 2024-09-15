package com.movistar.backendmovistar.dto;

import com.movistar.backendmovistar.model.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private String name;
    private String mobilNumber;
    private BigDecimal balance;
    private long data;
    private Platform platform;
}
