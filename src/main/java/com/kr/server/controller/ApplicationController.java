package com.kr.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Date;

/**
 * Created on 3/11/17.
 */
@RestController
@RequestMapping(value="/app")
public class ApplicationController {

    @RequestMapping(value="/now", method = RequestMethod.GET)
    public ResponseEntity<String> now(@RequestParam(value = "iam", required = false) String iam) {
        String resp = (iam == null ? "" : "Hi " + iam + "! ") + "It is " + (new Date()) + " now over here. Br, " + getHost();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    private String getHost(){
        try {
            return InetAddress.getLocalHost().getHostName();
        }catch(Exception x){
            return "Anonymous";
        }
    }

}
