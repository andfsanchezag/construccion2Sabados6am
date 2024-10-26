package app.service.interfaces;

import app.dto.UserDto;

public interface AdminService {
	public void createSeller(UserDto userDto) throws Exception;

	public void createVeterinarian(UserDto userDto) throws Exception;
}
