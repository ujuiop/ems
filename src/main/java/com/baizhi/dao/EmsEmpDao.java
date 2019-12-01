package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmsEmpDao {
    List<Emp> findAllEmp(Integer depid);

    Emp findOneEmp(Integer id);

    void empUpdate(Emp emp);

    void empAdd(Emp emp);

    void empDelete(Integer id);
}
