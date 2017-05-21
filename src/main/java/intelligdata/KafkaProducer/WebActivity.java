package intelligdata.KafkaProducer;

import java.io.Serializable;

public class WebActivity implements Serializable{

	String ipAddress;
	String userID;
	String pageUrl;
	String activity;
	Long timeStamp;
	WebActivity(){
		
	}
	public WebActivity(String ipAddress, String userID, String pageUrl, String activity, Long timeStamp) {
		super();
		this.ipAddress = ipAddress;
		this.userID = userID;
		this.pageUrl = pageUrl;
		this.activity = activity;
		this.timeStamp = timeStamp;
	}
	
}
