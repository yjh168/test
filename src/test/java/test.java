import com.zkzd.dao.EmpDao;
import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resources;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        InputStream input = Resources.class.getResourceAsStream("/mybatis-config.xml");
        // 创建工厂对象用于获取SqlSession
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
        // 获取连接对象
        SqlSession session = factory.openSession();
        EmpDao empDao = session.getMapper(EmpDao.class);
        Map map = new HashMap();
        map.put("empName","mike");
        map.put("empId",4);
        System.out.println("你好!");
        System.out.println("你好!");
        System.out.println("你好!");
        int count = empDao.updateEmp(map);

        if(count>0){
            System.out.println("修改成功!");
        }else{
            System.out.println("修改失败!");
        }
        session.commit();
        session.close();
    }

}
