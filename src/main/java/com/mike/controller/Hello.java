package com.mike.controller;

import com.mike.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by michaelbrennan on 9/8/15.
 */
@RestController
@RequestMapping("/")
public class Hello {


    @RequestMapping
    public ResponseEntity<ResponseModel> helloWorld(HttpServletRequest request, HttpServletResponse response){

        return new ResponseEntity<>(new ResponseModel(request), HttpStatus.OK);
    }
}
