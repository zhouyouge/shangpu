import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Yusuan;
import com.lyrk.service.YusuanService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class YusuanServiceImplTest {
    private YusuanService yusuanService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        yusuanService=(YusuanService)context.getBean("YusuanService");
    }

    @After
    public void tearDown() throws Exception {
        yusuanService=null;
    }

    @Test
    public void getUser()  {
        Yusuan yusuan =new Yusuan();
        yusuan.setNian("2020");
        yusuan.setBaYue("111");
      yusuan.setJiuYue("111");
        yusuan.setShiYue("111");
          yusuan.setShiyiYue("111");
        yusuan.setShierYue("111");
        ResponseResult rs=yusuanService.Yusuan2(yusuan);
        for(Yusuan yusuan1:(List<Yusuan>)rs.getData()){
            System.out.println(yusuan1.getBoothNumber()+":"+yusuan1.getRent());
        }

    }
}