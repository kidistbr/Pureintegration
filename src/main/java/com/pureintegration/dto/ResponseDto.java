package com.pureintegration.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ResponseDto {

    private Map<String, List<String>> message;
    private String status;
}
