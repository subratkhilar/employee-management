package com.ds.dashboard.config.repository;

import org.springframework.data.repository.CrudRepository;

import com.ds.dashboard.config.bean.TaskBean;

public interface TaskRepository extends CrudRepository<TaskBean, Long> {

}
