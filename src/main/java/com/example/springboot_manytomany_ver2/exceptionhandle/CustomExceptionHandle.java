package com.example.springboot_manytomany_ver2.exceptionhandle;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
@ControllerAdvice
public class CustomExceptionHandle extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        CustomError customError= new CustomError();

        customError.addSubError(ex.getFieldErrors());
        customError.setMessage("Validate request");
        customError.setTimestamp(new Date());
        customError.setStatus(status.BAD_REQUEST);

        return new ResponseEntity(customError,customError.getStatus());
    }
    @ExceptionHandler(ExceptionNotFound.class)
    public ResponseEntity<Object> notFoundHandle(ExceptionNotFound ex,WebRequest request){
        CustomError customError= new CustomError(ex.getMessage(),new Date(),HttpStatus.NOT_FOUND,
                request.getDescription(true));
        return new ResponseEntity(customError,customError.getStatus());
    }


}
