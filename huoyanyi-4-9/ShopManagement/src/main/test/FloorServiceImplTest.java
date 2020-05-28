import com.lyrk.entity.*;
import com.lyrk.service.FloorService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class FloorServiceImplTest {
    private FloorService floorService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        floorService=(FloorService)context.getBean("FloorService");
    }

    @After
    public void tearDown() throws Exception {
        floorService=null;
    }
    @Test
    public void addTower() {
        System.out.println("11");
        Date date=new Date();
        date.getTime();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String date1=format.format(date);
        FloorInformation tower=new FloorInformation("1","1","2223",11,1,1,1,"1","1","1",1,date,date);
        ResponseResult rs=floorService.addFloor(tower);
        System.out.println(rs.getData());
    }

    @Test
    public void toUpdateTowerOut() {
        System.out.println("11");
        FloorInformation floorInformation=new FloorInformation();
        floorInformation.setFloorName("1");
        ResponseResult rs=floorService.toUpdateFloor(floorInformation);
        System.out.println(rs.getData());
    }

    @Test
    public void updateTowerOut() {
        System.out.println("11");
        Date date=new Date();
        date.getTime();
        FloorInformation tower=new FloorInformation("22222","1","1",11,1,1,1,"1","1","1",1,date,date);
        ResponseResult rs=floorService.updateFloor(tower);
        System.out.println(rs.getData());
    }

    @Test
    public void deleteTower() {
        FloorInformation tower1=new FloorInformation();
        System.out.println("11");
        System.out.println("11");
        FloorInformation aa=new FloorInformation();
        aa.setFloorName("1");
        System.out.println((floorService.deleteFloor(aa)).getData());;
    }

    @Test
    public void queryTowerList() {
        System.out.println("11");
        FloorPage rs=floorService.queryFloorList(new FloorParameter());
        for(FloorInformation rr:rs.getFloorInformationList()){
            System.out.println(rr.getBreakoutName());
        };
    }

    @Test
    public void towerCount() {
        System.out.println("11");
        System.out.println((floorService.FloorCount(new FloorParameter())));;
    }
}