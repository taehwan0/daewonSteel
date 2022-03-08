package com.daewon.daewon.domain.steeldata.dto;

import lombok.Value;

import java.time.LocalDate;

@Value
public class UpdateSteelDataResponseDto {
    private long steelDataId;
    private String stationName;
    private long weight;
    private LocalDate date;
}
