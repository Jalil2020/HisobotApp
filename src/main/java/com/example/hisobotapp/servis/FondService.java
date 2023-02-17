package com.example.hisobotapp.servis;

import com.example.hisobotapp.domain.Fond;
import com.example.hisobotapp.repository.FondRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FondService {

    private final FondRepository fondRepository;

    public FondService(FondRepository fondRepository) {
        this.fondRepository = fondRepository;
    }

    public Fond save(Fond fond) {
        return fondRepository.save(fond);
    }
/*
    public List<Fond> getAll(Long userId) {
        return fondRepository.getAllFondByUserId(userId);
    }*/

}
