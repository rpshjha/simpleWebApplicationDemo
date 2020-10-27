package com.springframework.login;



public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("rupesh") && password.equals("dummy");
	}

}