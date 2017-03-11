package com.kr.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 3/11/17.
 */
@RestController
@RequestMapping(value="/app")
public class ApplicationController {

    @RequestMapping(value="/now", method = RequestMethod.GET)
    public ResponseEntity<Map> now(@RequestParam(value = "iam", required = false) String iam) {
        Map response = new HashMap();
        response.put("now", new Date());
        response.put("My name is", getHost());
        if (iam != null) {
            response.put("Hi", iam);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private String getHost(){
        try {
            return InetAddress.getLocalHost().getHostName();
        }catch(Exception x){
            return "Anonymous";
        }
    }

}
