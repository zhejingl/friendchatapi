package friendchatapi;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

import com.auth0.jwt.JWT;
public class Login {
	private String SECRET = "SDGDemoLogin";
	public Login() {
		
	}
	public LoginReturn login(LoginData login) throws Exception {
		
		String token = JWT.create().withSubject(login.getUser())
				.withExpiresAt(new Date(System.currentTimeMillis()+1000000))
				.sign(Algorithm.HMAC512(SECRET.getBytes()));
		System.out.println("return token:"+  token);
		LoginReturn ret = new LoginReturn();
		ret.setToken(token);
		return ret;

	}

}
