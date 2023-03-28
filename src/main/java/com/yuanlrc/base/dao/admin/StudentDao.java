package com.yuanlrc.base.dao.admin;

import com.yuanlrc.base.entity.admin.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

    Student findByStudentNo(String no);
    Student findByStudentName(String name);
}
