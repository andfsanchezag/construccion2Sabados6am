package app.service;

import app.dto.UserDto;

public class Service {
	public void login(UserDto userDto)throws Exception {
		if(!userDto.getPassword().equals(userDto.getUserName())) {
			throw new Exception ("usuario o contraseña incorrectos");
		}
		userDto.setRole(userDto.getUserName());
	}
}
