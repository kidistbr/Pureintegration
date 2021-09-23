package com.pureintegration.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pureintegration.dto.ResponseDto;
import org.springframework.stereotype.Service;


import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DogServiceImpl implements DogService {

    @Override
    public ResponseDto getAll() {

        ObjectMapper objectMapper=new ObjectMapper();
        TypeReference<Map<String, List<String>>> typeReference=new TypeReference<>() {};
        InputStream inputStream= typeReference.getClass().getResourceAsStream("/static/file.json");
        Map<String, List<String>> map=new HashMap<>();
        try{
            map=objectMapper.readValue(inputStream, typeReference);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(map);
        responseDto.setStatus("success");
        return responseDto;
    }
}
