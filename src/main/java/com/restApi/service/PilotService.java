package com.restApi.service;

import com.restApi.PilotObject;
import com.restApi.Testowa;
import com.restApi.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {

    public PilotRepository pilotRepository;
    @Autowired
    public PilotService(PilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;
    }

    public List<PilotObject> getPilotObject(){ // TODO nazwa metody z dupy. co w przypadku jak lista będzie pusta? Powinieneś rzucić błąd.
        // jak poczytasz o DTO to to jest miejsce gdzie należy zmapować endję na DTO. W przypadku listy dokonać iteracji i mapowania.
        return pilotRepository.findAll();
    }

    // Brak metody findById, oraz savePilot()





/*    @Autowired
    @Qualifier("michal")
    private Testowa testowa;

    @Autowired
    @Qualifier("piotr")
    private Testowa testowa2;*/

/*    public String returnName(){
        testowa2.setName("Frania");
        return testowa.getName() + " " + testowa2.getName();
    }*/
}

 // zaleznosci do rest api spring
// stworzyc rest com.restApi.controller pod endpointe "/api/v1"
// dodac baze danych h2 -- zalogowac sie do niej
// utworz klase - encje (@Entity) ktora zapiszesz do bazy danych
// utworzyc metode post w kontrolerze ktora bedzie wywoylwac metedoe z serwisu i poprzez repozytorium dododa obiekt do bazy danych
// utworzyc metode typu GET aby pobrac obiekt o id 1
