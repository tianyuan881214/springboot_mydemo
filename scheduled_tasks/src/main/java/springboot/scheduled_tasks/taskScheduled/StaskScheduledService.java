package springboot.scheduled_tasks.taskScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class StaskScheduledService {
    private static final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");

    /**
     * 定时执行计划任务
     * 从前到后依次表示秒 分 时 日 月 星期 年
     */
    @Scheduled(cron="0 09 21 * * ? ")
    public void fixTimeScheduled(){
        System.out.println("在指定时间"+sdf.format(new Date())+"执行！");
    }

    /**
     *以一个固定频率执行，单位毫秒，表示每隔多久执行一次
     */
    @Scheduled(fixedRate = 5000)
    public void fixRateScheduled(){
        System.out.println("每隔5秒执行一次："+sdf.format(new Date()));
    }

    /**
     * 同一个计划任务两次执行间隔固定时间，单位毫秒，上次执行结束到下次开始执行的时间
     */
    @Scheduled(fixedDelay = 6000)
    public void fixDelayScheduled(){
        System.out.println("同一人物间隔6秒执行一次："+sdf.format(new Date()));
    }

}
