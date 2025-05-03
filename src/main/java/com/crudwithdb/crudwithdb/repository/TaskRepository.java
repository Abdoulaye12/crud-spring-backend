package com.crudwithdb.crudwithdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudwithdb.crudwithdb.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
