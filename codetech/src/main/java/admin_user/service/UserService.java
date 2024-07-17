package admin_user.service;

import admin_user.dto.UserDto;
import admin_user.model.User;

public interface UserService {
	User save1(UserDto userDto);

	User save(UserDto userDto);
}
