package com.baizhi.action;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmsEmpService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@Scope("prototype")
public class EmsEmpAction {
    @Autowired
    private EmsEmpService emsEmpService;
    private List<Emp> allEmp;
    private Integer id;
    private Integer depid;
    private Emp emp;
    private File img;
    private String imgFileName;
    private String imgContentType;
    private String src;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getImgContentType() {
        return imgContentType;
    }

    public void setImgContentType(String imgContentType) {
        this.imgContentType = imgContentType;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Emp> getAllEmp() {
        return allEmp;
    }

    public void setAllEmp(List<Emp> allEmp) {
        this.allEmp = allEmp;
    }


    public String selectEmp() {
        allEmp = emsEmpService.findAllEmp(depid);
        return "selectEmp";
    }

    public String selectOneEmp() {
        emp = emsEmpService.findOneEmp(id);
        return "selectOneEmp";
    }

    public String updateEmp() throws IOException {
        System.out.println(imgFileName);
        if (img != null) {
            FileUtils.copyFile(img, new File("E:\\source\\maven-web\\ems\\src\\main\\webapp\\img" + "/" + imgFileName));
            emp.setSrc(imgFileName);
        } else {
            emp.setSrc(src);
        }
        emsEmpService.empUpdate(emp);
        allEmp = emsEmpService.findAllEmp(emp.getDepid());
        return "selectEmp";

    }

    public String addEmp() throws IOException {
        if (img != null) {
            FileUtils.copyFile(img, new File("E:\\source\\maven-web\\ems\\src\\main\\webapp\\img" + "/" + imgFileName));
            emp.setSrc(imgFileName);
        }
        emsEmpService.empAdd(emp);
        return "selectEmp";
    }

    public String deleteEmp() {
        emsEmpService.empDelete(id);
        allEmp = emsEmpService.findAllEmp(depid);
        return "selectEmp";
    }
}


