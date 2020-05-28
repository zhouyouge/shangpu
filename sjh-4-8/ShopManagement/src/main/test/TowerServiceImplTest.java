import com.lyrk.entity.*;
import com.lyrk.service.HouseSourceService;
import com.lyrk.service.TowerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class TowerServiceImplTest {
    private TowerService towerService;
    private HouseSourceService houseSourceService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        towerService=(TowerService)context.getBean("TowerService");
        houseSourceService=(HouseSourceService)context.getBean("HouseSourceService");
    }

    @After
    public void tearDown() throws Exception {
        towerService=null;
    }
    @Test
    public void addTower() {
        System.out.println("11");
        Tower_informationexpression tower=new Tower_informationexpression();
        tower.setBreakoutName("111");
        tower.setTowerCoding("1");
        tower.setTowerName("11");
        tower.setTowerStatus("11");
        tower.setCoveredArea(11);

        tower.setOperatingArea(1.5);
        tower.setUpFloorNumber(11);
        tower.setDownFloorNumber(11);
        tower.setComment("11");
        tower.setTowerImage("111");
        tower.setTower_BreakoutStatus(1);
        ResponseResult rs=towerService.addTower(tower);
        System.out.println(rs.getData());
    }

    @Test
    public void toUpdateTowerOut() {
        System.out.println("11");
        Tower_informationexpression tower=new Tower_informationexpression();
        tower.setBreakoutName("111");
        tower.setTowerCoding("1");
        tower.setTowerName("11");
        tower.setTowerStatus("11");
        tower.setCoveredArea(33);

        tower.setOperatingArea(1.5);
        tower.setUpFloorNumber(33);
        tower.setDownFloorNumber(11);
        tower.setComment("33");
        tower.setTowerImage("333");
        tower.setTower_BreakoutStatus(1);
        ResponseResult rs=towerService.updateTowerOut(tower);
        System.out.println(rs.getData());
    }

    @Test
    public void updateTowerOut() {
        System.out.println("11");
        Tower_informationexpression aa=new Tower_informationexpression();
        aa.setTowerName("11");
        System.out.println((towerService.toUpdateTowerOut(aa)).getData());;
    }

    @Test
    public void deleteTower() {
        System.out.println("11");
        System.out.println("11");
        Tower_informationexpression aa=new Tower_informationexpression();
        aa.setTowerName("11");
        System.out.println((towerService.deleteTower(aa)).getData());;
    }

    @Test
    public void queryTowerList() {
        System.out.println("11");
        TowerPage rs=towerService.queryTowerList(new TowerParameter());
        for(Tower_informationexpression rr:rs.getTowerList()){
            System.out.println(rr.getBreakoutName());
        };
    }

    @Test
    public void towerCount() {
        System.out.println("11");
        System.out.println((towerService.towerCount(new TowerParameter())));;
    }

    @Test
    public void HhoserinCount() {
        System.out.println("11");
        HouseSourcePage towerPage=houseSourceService.queryHouseSourceList(new HouseSourceParameter());
        System.out.println(towerPage.getHouseSourceList().size());;
    }
}