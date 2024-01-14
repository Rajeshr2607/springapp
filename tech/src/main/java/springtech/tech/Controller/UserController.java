package springtech.tech.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import springtech.tech.UsersServices.User;
import springtech.tech.UsersServices.Userservices;
import springtech.tech.model.Fixtures;

@RestController
public class UserController {
	  
	@Autowired
	private Userservices userservice;
	

	@GetMapping("getFixture")
	public String getData() {
		
		try {
	   User u= new User();

	   String s=userservice.fetchData();
	   ObjectMapper obj=new ObjectMapper();
	   Fixtures f=  obj.readValue(s, Fixtures.class);
	   return  f.toString() ;
	   
		}catch(Exception e) {
			e.printStackTrace();
		}
	   
	   
	   return "success";
	   
		
		
	}

}
