package com.example.hisobotapp.repository;

import com.example.hisobotapp.domain.FromPerson;
import com.example.hisobotapp.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FromPersonRepository extends JpaRepository<FromPerson, Long> {
/*    @Query("select f from FromPerson f where f.userId =:userId")
    List<FromPerson> getAllFondByUserId(@Param("user_id") Long userId);*/
}
