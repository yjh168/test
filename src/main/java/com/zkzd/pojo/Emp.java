package com.zkzd.pojo;

public class Emp implements java.io.Serializable {

        private  Integer empid; // emp表字段： emp_id
        private String empName;
        private String sex;
        private Integer deptId;
        private Integer salary;
        private String dname;
        // 省略 setter 和 getter 方法
    public Emp(Integer empid, String empName, String sex, Integer deptId, Integer salary, String dname) {
        this.empid = empid;
        this.empName = empName;
        this.sex = sex;
        this.deptId = deptId;
        this.salary = salary;
        this.dname = dname;
    }
    public Emp() {
    }


    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
