import com.lyrk.entity.CommercialPage;
import com.lyrk.entity.CommercialParameter;
import com.lyrk.entity.Commercialactivities;
import com.lyrk.entity.ResponseResult;
import com.lyrk.service.CommercialactivitiesService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class commerServiceImplTest {
/*    private CommercialactivitiesService commercialactivitiesService;*/
    @Before
    public void setUp() throws Exception {
 /*       ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationcount-spring.xml");
        commercialactivitiesService=(CommercialactivitiesService)context.getBean("CommercialactivitiesService");
   */ }

    @After
    public void tearDown() throws Exception {
  /*      commercialactivitiesService=null;*/
    }

    @Test
    public void getUser()  {
      /*  System.out.println("ceshi ");
        Commercialactivities commer1=new Commercialactivities();
        CommercialPage page=commercialactivitiesService.getCommer(new CommercialParameter());
        for(Commercialactivities commers:page.getCommercialactivitiesList()){
            System.out.println("id:  "+commers.getCommercialId()+" ,name:  "+commers.getCommercialName()
            +"时间："+commers.getCc_createDate());
            Date date=commers.getCc_createDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String aa=sdf.format(date);
            String string = "Sat Oct 10 22:32:00 CST 2020";
           *//* Date dated = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);.parse("Wed Jul 31 00:00:00 CST 2019");
*//*
            SimpleDateFormat sddd = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
            try {
                Date aaaaa=sddd.parse("Wed Jul 31 00:00:00 CST 2019");
                System.out.println("ffff:"+aaaaa);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            try {
                         date = sdf.parse(string);

                 } catch (ParseException e) {
                            e.printStackTrace();
            }


        }*/
    }
}