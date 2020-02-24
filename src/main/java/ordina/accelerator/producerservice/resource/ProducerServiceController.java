package ordina.accelerator.producerservice.resource;

import lombok.extern.slf4j.Slf4j;
import ordina.accelerator.producerservice.model.AcceleratorObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producerservice")
@Slf4j
public class ProducerServiceController
{

    @GetMapping(path = "/acceleratorobject", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public AcceleratorObject returnAcceleratorObject(){
        log.info("return accelerator");
        return AcceleratorObject.builder().acceleratorObject("nicevalue").build();
    }


}
