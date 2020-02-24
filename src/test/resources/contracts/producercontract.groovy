package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return accelerator object"
    request{
        method GET()
        url("/producerservice/acceleratorobject")
    }
    response {
        body("{\"acceleratorObject\" : \"nicevalue\"}")
        status 200
    }
}