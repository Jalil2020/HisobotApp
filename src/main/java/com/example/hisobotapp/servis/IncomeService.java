package com.example.hisobotapp.servis;

import com.example.hisobotapp.domain.Income;
import com.example.hisobotapp.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {
    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public Income save(Income income) {
        System.out.println("income:" + income.getUserId());
        return incomeRepository.save(income);
    }

    public List<Income> getAll() {
        return incomeRepository.findAll();
    }

    public Income delete(Long id) {
        Income income = incomeRepository.getReferenceById(id);
        incomeRepository.deleteById(id);
        return income;
    }
}
