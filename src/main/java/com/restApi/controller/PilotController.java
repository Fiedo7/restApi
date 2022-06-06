package com.restApi.controller;


import com.restApi.PilotObject;
import com.restApi.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/TBL_PHONES")
public class PilotController {

    @Autowired
    public PilotService pilotService;

    public PilotController(PilotService pilotService) {
        this.pilotService = pilotService;
    }

    @GetMapping

    public PilotObject getPilotObject() {
        return pilotService.getPilotObject();
    }
}

