package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @GetMapping("gett")
    public String Send(){
        return "GEtllete";
    }

    @GetMapping("gett1")
    public String Send1(){
        return "GEtlletedasdsaaaadsa";
    }

}
