package com.twoerdem.prime;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class PrimeController {

	@RequestMapping(value="/prime/{myInt}", method = RequestMethod.GET)
    @ResponseBody
	public Boolean isPrime(@PathVariable("myInt") Integer myInt) {
        if (myInt <= 1 || myInt >= 97)
            return false;
        for (Integer i = 2; i < myInt; i++) {
            if (myInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
