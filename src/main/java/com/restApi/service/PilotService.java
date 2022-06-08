package com.restApi.service;

import com.restApi.PilotObject;
import com.restApi.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class PilotService {


    public PilotRepository pilotRepository;

    @Autowired
    public PilotService(PilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;
    }

    public List<PilotObject> getPilotObject() {
        return pilotRepository.findAll();
    }
    public void addNewPilot (PilotObject pilotObject) {
        System.out.println(pilotObject);
    }

    public Optional<PilotObject> getListOfPilotObjects(Long id) {
        return pilotRepository.findById(id);
    }


}