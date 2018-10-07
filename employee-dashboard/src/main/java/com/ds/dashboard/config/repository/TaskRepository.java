package com.ds.dashboard.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.dashboard.config.bean.TaskBean;

public interface TaskRepository extends JpaRepository<TaskBean, Long> {

}
