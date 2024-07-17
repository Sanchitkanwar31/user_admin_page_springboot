package admin_user.service;

import org.springframework.stereotype.Service;

import admin_user.dto.UserDto;
import admin_user.model.User;
import admin_user.repositories.UserRepository;

@Service

public class UserServiceImpl implements UserService {

	public UserRepository userRepository;
	@Override
	public User save(UserDto userDto) {
	
		User user=new User(userDto.getEmail(),userDto.getPassword(),userDto.getRole(),userDto.getFullname());
		return userRepository.save(user);
	}
	@Override
	public User save1(UserDto userDto) {
		
		throw new UnsupportedOperationException("Unimplemented method 'save1'");
	}

}
