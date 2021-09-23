package com.pureintegration.service;

import com.pureintegration.dto.ResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DogServiceImplTest {

    @Autowired
    private DogService dogService;

    @Test
    void testGetAll(){
        ResponseDto responseDto=dogService.getAll();
        assertThat(responseDto).isNotNull();
    }

}