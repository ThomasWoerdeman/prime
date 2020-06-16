package com.twoerdem.prime;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class PrimeController {

	@RequestMapping(value="/prime/{myInt}", method = RequestMethod.GET)
    @ResponseBody
	public Boolean isPrime() {
        return true;
    }
}
