package com.restApi.controller;


import com.restApi.PilotObject;
import com.restApi.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {"/api/v1/phones", "/api/phones"}) //TODO uwaga nr.1 zawsze wersja v1 oraz defaultowa. Zawsze zasób w liczbie mnogiej i malymi literami ;)
public class PilotController {

    @Autowired
    public PilotService pilotService;

    public PilotController(PilotService pilotService) {
        this.pilotService = pilotService;
    }

    @GetMapping // co to za mapping? Programista widząc Twój kontroller nie wie co tu zwracasz. Czy jest to jeden obiekt czy wiele obiektów? Żeby to sprawdzić trzeba wejść do kontroller.
    // nazwy metod muszą coś określać.
    public PilotObject getAllPilots() { // zmienione na getAllPilots
        return pilotService.getPilotObject(); // metoda w serwisie powinna mieć nazwę np. finAll(). getPilotObject jes w liczbie poj. TO SERIO WAŻNE
        
        // TODO brak metody @GetMapping dla idMode tj. getPilotById(Long id)
        // TODO brak metody @PostMapping do dodania pilota do bazy danych. Dane ładujemy poprzez PostMapping a nie danymi sql! Przy tym temacie poczytajcie na szybko o DTO (Data transfer object)
        // zamysł jest taki, że to co przekazuje użytkownik to nie ten sam obiekt który zapisujecie do bazy i tak samo w drugą stronę. Ograniczamy się tylko do pól wymaganych w odniesieniu do danego requesta. 
   
        // do poprawki również to co zwrasz w metocie którą masz. zwracasz PilotObject, jak poczytasz o DTO, zwróć proszę PilotDto a nie encję. Musisz wykonać mapowanie encji na obiekt DTO.
    }
}

