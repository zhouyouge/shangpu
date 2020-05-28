import com.lyrk.entity.Breakout;
import com.lyrk.entity.FloorInformation;
import com.lyrk.entity.Gongyou;
import com.lyrk.entity.Tower_informationexpression;
import com.lyrk.service.GongyouService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class GongyouServiceImplTest {

    private GongyouService gongyouService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        gongyouService=(GongyouService)context.getBean("GongyouService");
    }

    @After
    public void tearDown() throws Exception {
        gongyouService=null;
    }


    @Test
    public void getBreakout() {
        /*有参为单查，无参为全查*/
     /*   Gongyou gongyou=new Gongyou();
        gongyou.setBreakoutName("洛阳分场");*/
        List<Breakout> list=gongyouService.getBreakout( null);
        for(Breakout br:list){
            System.out.println(br.getBreakoutName()+":"+br.getBrcomment());
        }
    }

    @Test
    public void getTowner() {
        Gongyou gongyou=new Gongyou();
        gongyou.setBreakoutName("洛阳分场");
        List<Tower_informationexpression> list=gongyouService.getTowner(gongyou);
        for(Tower_informationexpression br:list){
            System.out.println(br.getBreakoutName()+":"+br.getTowerCoding());
        }
    }

    @Test
    public void getFloor() {
        Gongyou gongyou=new Gongyou();
        gongyou.setTowerName("洛龙楼栋");
        List<FloorInformation> list=gongyouService.getFloor( gongyou);
        for(FloorInformation br:list){
            System.out.println(br.getBreakoutName()+":");
        }
    }
}