package com.nazmul.microservices.currencyconversionservice.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConversionController.class);

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable Integer quantity) {
		LOGGER.info("Received Request to convert from {} {} to {}. ", quantity, from, to);
		CurrencyConversionBean response =
				restTemplate.getForObject(
						"http://currency-exchange-service/currency-exchange/from/{from}/to/{to}",
						CurrencyConversionBean.class);
		Integer convertedValue = quantity * response.getUnit();
		return new CurrencyConversionBean( from, to, 10);
	}

	@GetMapping("/number-to-word/{number}")
	public NumberToWordBean getNumberToWord(@PathVariable Integer number) {
		return new NumberToWordBean(EnglishNumberToWords.convert(number));
	}

}
