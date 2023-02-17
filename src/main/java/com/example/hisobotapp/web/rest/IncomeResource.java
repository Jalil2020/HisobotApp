package com.example.hisobotapp.web.rest;

import com.example.hisobotapp.domain.Income;
import com.example.hisobotapp.servis.IncomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"}, methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.GET})
public class IncomeResource {
    private final IncomeService incomeService;


    public IncomeResource(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @PostMapping("/incomes")
    public ResponseEntity create(@RequestBody Income income) {
        Income income1 = incomeService.save(income);
        System.out.println(income.getDescription());
        return ResponseEntity.ok(income1);
    }

    @GetMapping("/incomes")
    public ResponseEntity getAll() {
        List<Income> list = incomeService.getAll();
        return ResponseEntity.ok(list);
    }

    /*
        @GetMapping("/incomes/{name}")
        public ResponseEntity findByName(@PathVariable("name") String name) {
            List<Income> list = incomeService.findByName(name);
            return ResponseEntity.ok(list);
        }

        @GetMapping("/incomes/search")
        public ResponseEntity findByLike(@RequestParam("text") String text) {
            return ResponseEntity.ok(incomeService.findByLike(text));
        }
*/
    @PutMapping("/incomes")
    public ResponseEntity update(@RequestBody Income income) {
        Income income1 = incomeService.save(income);
        System.out.println(income.getFromIncome());
        return ResponseEntity.ok(income1);
    }

    @DeleteMapping("/incomes")
    public ResponseEntity delete(@RequestParam("id") Long id) {
        incomeService.delete(id);
        return ResponseEntity.ok("Qator o'chirildi");
    }


}
