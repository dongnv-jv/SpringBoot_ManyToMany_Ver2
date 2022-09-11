package com.example.springboot_manytomany_ver2.exceptionhandle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubError {
    private String message;
    private String field;
    private String object;

}
