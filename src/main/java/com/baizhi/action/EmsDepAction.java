package com.baizhi.action;

import com.alibaba.fastjson.JSONObject;
import com.baizhi.entity.Department;
import com.baizhi.service.EmsDepService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@Scope("prototype")
public class EmsDepAction {
    @Autowired
    private EmsDepService depService;
    private List<Department> allDep;
    private Integer id;
    private Department dep;

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Department> getAllDep() {
        return allDep;
    }

    public void setAllDep(List<Department> allDep) {
        this.allDep = allDep;
    }


    public String findAll() {
        allDep = depService.findAllDep();
        return "selectAllDep";
    }

    public String selectAll() throws IOException {
        List<Department> list1 = depService.findAllDep();
        String json = JSONObject.toJSONString(list1);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(json);
        return null;
    }

    public String findOne() {
        dep = depService.findOneDep(id);
        return "selectOneDep";
    }

    public String update() {
        depService.depUpdate(dep);
        allDep = depService.findAllDep();
        return "selectAllDep";
    }

    public String add() {
        depService.depAdd(dep);
        allDep = depService.findAllDep();
        return "selectAllDep";
    }
}
