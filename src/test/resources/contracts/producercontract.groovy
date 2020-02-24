package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return accelerator object"
    request{
        method GET()
        url("/producerservice/acceleratorobject")
    }
    response {
        headers {header 'Content-Type': 'application/json;charset=UTF-8'}
        body("{\"acceleratorObject\" : \"nicevalue\"}")
        status 200
    }
}