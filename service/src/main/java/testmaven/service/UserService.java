package testmaven.service;

import testmaven.datebase.dao.UserDao;
import testmaven.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
