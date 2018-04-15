package io.jay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.entity.Quote;


@RestController
public class JsonRestController {
	
	
	@RequestMapping("/getJsonQuote")
	public String sayGetJsonQuote(){
		RestTemplate restTemplate = new RestTemplate();
	
		String jsonUrl = "https://gturnquist-quoters.cfapps.io/api/random";
		
		Quote quoteObj = restTemplate.getForObject(jsonUrl, Quote.class);
		
		return quoteObj.toString();
		
		
	}


}
