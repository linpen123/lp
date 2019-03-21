package com.lp.springhome;
import com.lp.springhome.model.controller.TicketWindowRunnable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringhomeApplicationTests {
    private static Logger logger=LoggerFactory.getLogger(SpringhomeApplicationTests.class);
    @Test
    public void contextLoads() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time = simpleDateFormat.format(date);
        logger.debug("张钰是一个大猪头"+time);
        System.out.print("今天天气不错 ");
    }

    @Test
    public void doTest(){
        /*TicketWindow ticketWindow = new TicketWindow("一号柜台");
        ticketWindow.start();
        TicketWindow ticketWindow2 = new TicketWindow("二号柜台");
        ticketWindow2.start();
        TicketWindow ticketWindow3 = new TicketWindow("三号柜台");
        ticketWindow3.start();
        TicketWindow ticketWindow4= new TicketWindow("四号柜台");
        ticketWindow4.start();*/
    /*    final TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();
        Thread thread = new Thread(ticketWindowRunnable,"一号窗口");
        Thread thread2 = new Thread(ticketWindowRunnable,"二号窗口");
        Thread thread3 = new Thread(ticketWindowRunnable,"三号窗口");
        Thread thread4 = new Thread(ticketWindowRunnable,"四号窗口");
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();*/
    }

    @Test
    public void timer() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0); // 控制时
        calendar.set(Calendar.MINUTE, 0);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒

        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
//                System.out.println("-------设定要指定任务--------");

            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }
}
