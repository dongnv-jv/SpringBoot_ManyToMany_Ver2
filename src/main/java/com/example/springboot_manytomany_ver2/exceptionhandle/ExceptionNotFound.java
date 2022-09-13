package com.example.springboot_manytomany_ver2.exceptionhandle;

public class ExceptionNotFound extends Exception{
    private static final long serialVersionUID = 1L;
   public ExceptionNotFound(String message) {
       super(message);
   }
}
