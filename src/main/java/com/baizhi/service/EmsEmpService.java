package com.baizhi.service;


import com.baizhi.entity.Emp;

import java.util.List;

public interface EmsEmpService {
    List<Emp> findAllEmp(Integer id);

    Emp findOneEmp(Integer id);

    void empUpdate(Emp emp);

    void empAdd(Emp emp);

    void empDelete(Integer id);
}
