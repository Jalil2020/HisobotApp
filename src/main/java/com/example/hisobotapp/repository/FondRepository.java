package com.example.hisobotapp.repository;

import com.example.hisobotapp.domain.Fond;
import com.example.hisobotapp.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FondRepository extends JpaRepository<Fond, Long> {
  /*  @Query("select f from Fond f where f.userId =:userId")
    List<Fond> getAllFondByUserId(@Param("user_id") Long userId);*/
}
