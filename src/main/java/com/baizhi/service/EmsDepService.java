package com.baizhi.service;

import com.baizhi.entity.Department;

import java.util.List;

public interface EmsDepService {
    List<Department> findAllDep();

    Department findOneDep(Integer id);

    void depUpdate(Department dep);

    void depAdd(Department dep);
}
