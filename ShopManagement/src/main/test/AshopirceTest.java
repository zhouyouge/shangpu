import com.lyrk.entity.*;
import com.lyrk.service.AshopriceService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.AAShapePipe;

import java.util.Date;

public class AshopirceTest {
    private AshopriceService ashopriceService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        ashopriceService=(AshopriceService)context.getBean("AshopriceService");
    }

    @After
    public void tearDown() throws Exception {
        ashopriceService=null;
    }
    @Test
    public void addTower() {
        Ashopprice as=new Ashopprice();
        for(int i=1;i<=100;i++){
            Ashopprice ashopprice=new Ashopprice();
            ashopprice.setAshopId(i);
            ashopriceService.addAshopprice(ashopprice);
            System.out.println("i:"+i);
        }
     /*   ResponseResult rs=ashopriceService.addAshopprice(as);
       *//* System.out.println(rs.getData());*/
    }

   @Test
    public void toUpdateTowerOut() {
       Ashopprice as=new Ashopprice(new Date(), 1, 1.5, 1.5, 1.5, 1.5, 1.5, "1.5");
       as.setBoothNumber("2");
       as.setAnnual(new Date());
       ResponseResult rs=ashopriceService.updateAshopprice(as);
       System.out.println(rs.getData());
    }

    @Test
    public void updateTowerOut() {
        Ashopprice as=new Ashopprice(new Date(), 1, 1.5, 1.5, 1.5, 1.5, 1.5, "1.5");
        as.setBoothNumber("2");
        as.setAnnual(new Date());
        ResponseResult rs=ashopriceService.toUpdateAshopprice(as);
        System.out.println(rs.getData());
    }

    @Test
    public void deleteTower() {
        Ashopprice aa=new Ashopprice();
        aa.setBoothNumber("2");
        aa.setAshopId(2);
        ResponseResult rs=ashopriceService.deleteAshopprice(aa);
        System.out.println(rs.getData());
    }

    @Test
    public void queryTowerList() {
        Ashopprice aa=new Ashopprice();
        AshopPricePage rs=ashopriceService.queryAshoppriceList(new AshopriceParameter());
        System.out.println(rs.getAshoppriceList().size());
    }

    @Test
    public void towerCount() {
        int rs=ashopriceService.AshoppriceCount(new AshopriceParameter());
        System.out.println(rs);

    }

}
