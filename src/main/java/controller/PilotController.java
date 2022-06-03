package controller;


import com.restApi.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PilotController {

    @Autowired
    private PilotService pilotService;

}
