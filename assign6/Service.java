package assign6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {

	//from property file
	@Value("${service.url}")
	private String url;
	@Value("${drivername}")
	private String drivername;
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	@Override
	public String toString() {
		return "Service [url=" + url + ", drivername=" + drivername + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
