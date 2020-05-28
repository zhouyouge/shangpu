import com.lyrk.entity.*;
import com.lyrk.service.AshopriceService;
import com.lyrk.service.DisversifiedService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class DisversfiedTest {
    private DisversifiedService disversifiedService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        disversifiedService=(DisversifiedService)context.getBean("DisversifiedService");
    }

    @After
    public void tearDown() throws Exception {
        disversifiedService=null;
    }
    @Test
    public void addTower() {
        Disversified as=new Disversified();
        as.setDiversifiedCoding("CCDJ11111");
        as.setBreakoutName("1");
        as.setFloorName("1");
        as.setTowerName("1");
        as.setDiversifiedName("1");
        as.setDiversifiedStatus("1");
        as.setCoveredArea(1.1);
        as.setDiversifiedType("1");
        as.setOutdoors("1");
        as.setStandardRent("1");
        as.setCommnet("1");
        ResponseResult rs=disversifiedService.addDisversified(as);
        System.out.println(rs.getData());
    }

   @Test
    public void toUpdateTowerOut() {
       Disversified as=new Disversified();
       as.setDiversifiedName("1");
       ResponseResult rs=disversifiedService.toUpdateDisversfied(as);
       System.out.println(rs.getData());
    }

    @Test
    public void updateTowerOut() {
        Disversified as=new Disversified();
        as.setDiversifiedCoding("CCDJ11111");
        as.setBreakoutName("1");
        as.setFloorName("1");
        as.setTowerName("1");
        as.setDiversifiedName("1");
        as.setDiversifiedStatus("1");
        as.setCoveredArea(1);
        as.setDiversifiedType("1");
        as.setOutdoors("1");
        as.setStandardRent("1");
        as.setCommnet("1");
        ResponseResult rs=disversifiedService.updateDisversified(as);
        System.out.println(rs.getData());
    }

    @Test
    public void deleteTower() {
        Disversified as=new Disversified();
        as.setDiversifiedName("1");
        ResponseResult rs=disversifiedService.deleteDisversified(as);
        System.out.println(rs.getData());
    }

    @Test
    public void queryTowerList() {
        Ashopprice aa=new Ashopprice();
        DisversifiedPage rs=disversifiedService.queryDisversfiedList(new DisversifiedParameter());
        System.out.println(rs.getDisversifiedList().size());
    }

    @Test
    public void towerCount() {
        int rs=disversifiedService.disversifedCount(new DisversifiedParameter());
        System.out.println(rs);

    }

}
