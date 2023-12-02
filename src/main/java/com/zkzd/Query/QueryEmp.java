package com.zkzd.Query;

public class QueryEmp implements java.io.Serializable{
    private  String empName;
    private String sex;
    private Integer salary;
    // 省略 setter 和 getter 方法
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
