package com.elearning.dto;


import lombok.*;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDto {
    private HttpStatus status;
    private String message;
    private Object data;
}

