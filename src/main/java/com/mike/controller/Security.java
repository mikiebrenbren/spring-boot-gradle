package com.mike.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by michaelbrennan on 10/3/15.
 */
@RestController
@RequestMapping("/")
public class Security {

    @RequestMapping("logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        request.logout();
    }
}
