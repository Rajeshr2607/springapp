package springtech.tech.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import springtech.tech.UsersServices.User;

@RestController
public class UserController {
	
	
	@GetMapping("getFixture")
	public String getData() {
		
	   User u= new User();
	   
	   RestClient  restClient = RestClient.builder()
             .baseUrl("https://dev-sigma2.s3.eu-west-2.amazonaws.com/sigma/json/sr_match_42134499.json?_=1705210596231")
             .build();
	    
//	    restClient.toString();
	   
	   
	   
		
		return restClient.toString();
	}

}
