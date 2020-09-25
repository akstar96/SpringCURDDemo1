package com.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Emp;

@Repository
public interface DaoI extends JpaRepository<Emp, Integer> {
public List<Emp> findByFristNameAndLastName(String fristName,String lastNAme);
}
