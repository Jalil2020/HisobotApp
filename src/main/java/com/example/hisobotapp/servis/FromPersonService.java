package com.example.hisobotapp.servis;

import com.example.hisobotapp.domain.FromPerson;
import com.example.hisobotapp.repository.FromPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FromPersonService {
    private final FromPersonRepository fromPersonRepository;


    public FromPersonService(FromPersonRepository fromPersonRepository) {
        this.fromPersonRepository = fromPersonRepository;
    }


    public FromPerson save(FromPerson fond) {
        return fromPersonRepository.save(fond);
    }
/*

    public List<FromPerson> getAll(Long userId) {
        return fromPersonRepository.getAllFondByUserId(userId);
    }
*/


}
