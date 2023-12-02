package com.zkzd.dao;
import com.zkzd.Query.QueryEmp;
import com.zkzd.pojo.Emp;
import java.util.List;
import java.util.Map;

public interface EmpDao {
    public List<Emp> getAll();
    public int addEmp(Emp emp);
    public int updateEmp(Map map);
    /**
     * 使用 Association  实现对象关联
     * @return
     */
    public List<Emp> getAssociation(Map<String,Object> map );
    public List<Emp> testIf(QueryEmp queryEmp);
}
