package com.example.springboot_manytomany_ver2.exceptionhandle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomError {
    private String message;
    private Date timestamp;
    private HttpStatus status;
    private List<SubError> subError;


  /*  private void addSubError(){
        this.subError= new ArrayList<>();
    }

    private void addSubError(FieldError fieldError){
        SubError error= new SubError();
        error.setMessage(fieldError.getDefaultMessage());

    }*/



    public void addSubError(List<FieldError> errors){
        this.subError= new ArrayList<SubError>();
        for(FieldError fieldError: errors){
            SubError error= new SubError();
            error.setMessage(fieldError.getDefaultMessage());
            error.setField(fieldError.getField());
            error.setObject(fieldError.getObjectName());
            subError.add(error);
        }
    }

}
