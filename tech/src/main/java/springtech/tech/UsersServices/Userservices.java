package springtech.tech.UsersServices;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class Userservices {
	
	 private RestClient Client;
	
	public Userservices() {
		Client=RestClient.builder().build();
	}
	
	public String fetchData() {
		return Client.get().uri("https://dev-sigma2.s3.eu-west-2.amazonaws.com/sigma/json/sr_match_42134499.json?_=1705210596231").retrieve().body(String.class);
	}
	
	

}
