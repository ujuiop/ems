package com.baizhi.service;

import com.baizhi.dao.EmsDepartmentDao;
import com.baizhi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmsDepServiceImpl implements EmsDepService {
    @Autowired
    private EmsDepartmentDao departmentDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Department> findAllDep() {
        List<Department> allDep = departmentDao.findAllDep();
        System.out.println("1");
System.out.println("1");
System.out.println("1");
System.out.println("1");
        return allDep;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Department findOneDep(Integer id) {
        Department oneDep = departmentDao.findOneDep(id);
        return oneDep;
    }

    @Override
    public void depUpdate(Department dep) {
        departmentDao.depUpdate(dep);
    }

    @Override
    public void depAdd(Department dep) {
        departmentDao.depAdd(dep);
    }
}
