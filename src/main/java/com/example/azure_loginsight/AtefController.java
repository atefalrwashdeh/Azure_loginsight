package com.example.azure_loginsight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1")
public class AtefController {
private Logger logger = LoggerFactory.getLogger(AtefController.class);
//private java.util.logging.Logger loggere = (java.util.logging.Logger) LoggerFactory.getLogger(AtefController.class);

@GetMapping("/atef")
public String hello(){
    logger.warn("Hello team");
    logger.info("Hello Atef");
    try {
        throw new Exception();
    }catch (Exception e){
        logger.error("Exception 500");
    }
    return "Helo Atef";
}

}
