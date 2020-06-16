package com.twoerdem.prime;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class PrimeController {

	@RequestMapping(value="/prime/{myInt}", method = RequestMethod.GET)
	public Boolean isPrime(@PathVariable("myInt") Integer myInt) { //This function checks if myInt is a prime number
        if (myInt <= 1 || myInt >= 97) //The interger may not be bigger or equal to 97
            return false;
        for (Integer i = 2; i < myInt; i++) { //If the integer is divisible by any number but 1 or itself it is not considered a prime number
            if (myInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
