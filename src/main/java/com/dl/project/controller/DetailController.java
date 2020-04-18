package com.dl.project.controller;

import com.dl.project.service.DetailService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailController {
    @Autowired
    DetailService detailService;

    @RequestMapping(value="/details",method = RequestMethod.GET)
    public ResponseEntity details(){
        return new ResponseEntity(detailService.getAllDetails(), HttpStatus.OK);
    }

}
