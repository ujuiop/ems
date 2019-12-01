package com.baizhi.service;

import com.baizhi.dao.EmsEmpDao;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmsEmpServiceImpl implements EmsEmpService {
    @Autowired
    private EmsEmpDao emsEmpDao;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Emp> findAllEmp(Integer id) {
        List<Emp> allEmp = emsEmpDao.findAllEmp(id);
        return allEmp;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Emp findOneEmp(Integer id) {
        Emp oneEmp = emsEmpDao.findOneEmp(id);
        return oneEmp;
    }

    @Override
    public void empUpdate(Emp emp) {
        emsEmpDao.empUpdate(emp);
    }

    @Override
    public void empAdd(Emp emp) {
        emsEmpDao.empAdd(emp);
    }

    @Override
    public void empDelete(Integer id) {
        emsEmpDao.empDelete(id);
    }
}
