import com.lyrk.entity.BreakPage;
import com.lyrk.entity.BreakParameter;
import com.lyrk.entity.Breakout;
import com.lyrk.entity.ResponseResult;
import com.lyrk.service.BreakOutService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class BreakOutServiceImplTest {

    private BreakOutService breakOutService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        breakOutService=(BreakOutService)context.getBean("BreakOutService");
    }

    @After
    public void tearDown() throws Exception {
        breakOutService=null;
    }


    @Test
    public void addBreak() {
       /* Breakout breakout =new Breakout();
        breakout.setBreakoutName("11");
        breakout.setBrabbreviation("11");
        breakout.setBrcoding(11);
        breakout.setBrprincipal("11");
        breakout.setBrworkType("11");
        breakout.setBrcoveredArea(11);
        breakout.setBroperatingArea(11);
        breakout.setBrresidentialPool(11);
        breakout.setBroperationalRegime("11");
        breakout.setBrcomment("11");
        breakout.setBrBreakoutDiagram("11");
        breakout.setBrBreakoutLicense("11");
        breakout.setBrBreakoutStatus(11);
        if(breakOutService.addBreak(breakout).getResult()){
            System.out.println("添加陈工");
        }else{
            System.out.println("添加失败");
        }*/
    }

    @Test
    public void queryBreakOutList() {
        BreakParameter param=new BreakParameter();
        BreakPage lsit=breakOutService.queryBreakOutList(param);
        System.out.println(lsit.getBreakoutList().size());
    }

    @Test
    public void toUpdateBreakOut() {
  /*      Breakout breakout =new Breakout();
        breakout.setBreakoutName("11");
        ResponseResult breakout2 =breakOutService.toUpdateBreakOut(breakout);
        System.out.println(breakout2.getResult());*/
    }

    @Test
    public void updateBreakOut() {
        Breakout breakout =new Breakout();
        breakout.setBreakoutName("11");
        breakout.setBrabbreviation("22");
        breakout.setBrcoding(11);
        breakout.setBrprincipal("22");
        breakout.setBrworkType("22");
        breakout.setBrcoveredArea(11);
        breakout.setBroperatingArea(11);
        breakout.setBrresidentialPool(11);
        breakout.setBroperationalRegime("1");
        breakout.setBrcomment("11");
        breakout.setBrBreakoutDiagram("11");
        breakout.setBrBreakoutLicense("11");
        breakout.setBrBreakoutStatus(11);
        if(breakOutService.updateBreakOut(breakout).getResult()){
            System.out.println("修改陈工");
        }else{
            System.out.println("修改失败");
        }
    }

    @Test
    public void deleteBreakOut() {
        Breakout breakout =new Breakout();
        breakout.setBreakoutName("11");
        if(breakOutService.deleteBreakOut(breakout).getResult()){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}