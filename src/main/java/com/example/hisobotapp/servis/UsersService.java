package com.example.hisobotapp.servis;

import com.example.hisobotapp.domain.Users;
import com.example.hisobotapp.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users save(Users fond) {
        return usersRepository.save(fond);
    }

    public List<Users> getAll() {
        return usersRepository.findAll();
    }
/*

    public List<Users> getAll(Long userId) {
        return usersRepository.findAll();
    }
*/

}
