package com.Ptacises.ModelMapper.Repository;

import com.Ptacises.ModelMapper.Entity.StudentLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentLogin,Integer> {
}
