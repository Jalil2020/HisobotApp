package com.example.hisobotapp.repository;

import com.example.hisobotapp.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

//    @Query("select i from Income i where i.userId =:userId")
//    List<Income> getAllFondByUserId(@Param("user_id") Long userId);

  /*  @Query("select e from Income e where e.date =:name")
    List<Income> findByNameQuery(@Param("name") String name);

    @Query(value = "select * from In e where e.name =:name ", nativeQuery = true)
    List<Income> findByNameNativeQuery(@Param("name") String name);

    @Query("select e from Income e where UPPER(e.date) like upper(concat('%',:text,'%'))")
    List<Income> findByLike(@Param("text") String text);

    @Query(value = "select * from employee e where e.name like '%':text'%'" , nativeQuery = true)
    List<Income> findByLikeNative(@Param("text")String text);*/
}
