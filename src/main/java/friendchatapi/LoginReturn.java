package friendchatapi;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
public class LoginReturn  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String token;
	private List<String> enabled = new ArrayList<String>();
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<String> getEnabled() {
		return enabled;
	}
	public void setEnabled(List<String> enabled) {
		this.enabled = enabled;
	}
	
}
