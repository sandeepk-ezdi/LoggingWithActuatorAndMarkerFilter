/**
 * 
 */
package com.ezdi.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EZDI\sandeep.k
 *
 */

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

   /* @ExceptionHandler(value = Exception.class)  
    public ResponseEntity<Object> handleException(Exception e) {
    	MultiValueMap<String, String> header = new HttpHeaders();
    	header.add("ErrorMsg", "Opss,Somthig Went Wrong!!");
        return new ResponseEntity<Object>(header, HttpStatus.INTERNAL_SERVER_ERROR);
    }*/
	
}
