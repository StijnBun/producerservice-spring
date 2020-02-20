package ordina.accelerator.producerservice.resource;

import lombok.extern.slf4j.Slf4j;
import ordina.accelerator.producerservice.model.AcceleratorObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producerservice")
@Slf4j
public class ProducerServiceController
{

    @GetMapping("/acceleratorobject")
    public AcceleratorObject returnAcceleratorObject(){
        log.info("return accelerator");
        return AcceleratorObject.builder().acceleratorObject("nicevalue").build();
    }


}
