package springtech.tech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtherData {
	
	private String event_id;
	private String sport_event_status;
	private int match_status_code ;
	private String market_count;
	private int host_producer;
	
	

}
