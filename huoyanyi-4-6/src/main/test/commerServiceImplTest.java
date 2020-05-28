import com.lyrk.entity.Commercialactivities;
import com.lyrk.service.CommercialactivitiesService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

public class commerServiceImplTest {
    private CommercialactivitiesService commercialactivitiesService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        commercialactivitiesService=(CommercialactivitiesService)context.getBean("CommercialactivitiesService");
    }

    @After
    public void tearDown() throws Exception {
        commercialactivitiesService=null;
    }

    @Test
    public void getUser() {
        System.out.println("ceshi ");
        Commercialactivities commer1=new Commercialactivities();
        List<Commercialactivities> list=commercialactivitiesService.getCommer(commer1);
        for(Commercialactivities commers:list){
            System.out.println("id:  "+commers.getCommercialId()+" ,name:  "+commers.getCommercialName()
            +"时间："+commers.getCc_createDate());
        }
    }
}