import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.User;
import com.lyrk.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsersServiceImplTest {

    private UserService userService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        userService=(UserService)context.getBean("UserService");
    }

    @After
    public void tearDown() throws Exception {
        userService=null;
    }

    @Test
    public void loginUser() {
        System.out.println("测试类。。。。。。。。。。");
        User users=new User();
        users.setPassword("123456");
        users.setUserName("王涛");
        ResponseResult rs =userService.loginUser(users);
        System.out.println(rs.getResult()+":"+rs.getFlag()+":"+rs.getData());
    }
}