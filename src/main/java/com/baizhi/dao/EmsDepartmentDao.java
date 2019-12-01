package com.baizhi.dao;

import com.baizhi.entity.Department;

import java.util.List;

public interface EmsDepartmentDao {
    List<Department> findAllDep();

    Department findOneDep(Integer id);

    void depUpdate(Department dep);

    void depAdd(Department dep);
}
