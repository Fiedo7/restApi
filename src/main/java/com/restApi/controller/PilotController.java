package com.restApi.controller;

import com.restApi.PilotObject;
import com.restApi.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class PilotController {

    public PilotService pilotService;
    @Autowired
    public PilotController(PilotService pilotService) {
        this.pilotService = pilotService;
    }

        public List<PilotObject> getPilotObject() {
        return pilotService.getPilotObject();
    }
        @PostMapping
        public void savePilot (@RequestBody PilotObject pilotObject) {
        pilotService.addNewPilot(pilotObject);
        }

    @GetMapping(path = "/getPilot/{id}")
    public void getPilot(@PathVariable(name = "id") Long id) {
        Optional<PilotObject> list = pilotService.getListOfPilotObjects(id);
        list.stream().forEach(pilotObject -> {
            System.out.println(pilotObject.getId());

        });
    }






}