package com.restApi.service;

import com.restApi.Testowa;
import com.restApi.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PilotService {

    @Autowired
    private PilotRepository pilotRepository;

    @Autowired
    @Qualifier("michal")
    private Testowa testowa;

    @Autowired
    @Qualifier("piotr")
    private Testowa testowa2;

    public String returnName(){
        testowa2.setName("Frania");
        return testowa.getName() + " " + testowa2.getName();
    }
}

 // zaleznosci do rest api spring
// stworzyc rest controller pod endpointe "/api/v1"
// dodac baze danych h2 -- zalogowac sie do niej
// utworz klase - encje (@Entity) ktora zapiszesz do bazy danych
// utworzyc metode post w kontrolerze ktora bedzie wywoylwac metedoe z serwisu i poprzez repozytorium dododa obiekt do bazy danych
// utworzyc metode typu GET aby pobrac obiekt o id 1