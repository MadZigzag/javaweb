package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.dao.impl.SysScheduleDaoImpl;
import com.atguigu.schedule.pojo.SysSchedule;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * ClassName: TestSysScheduleDao
 * Package: com.atguigu.schedule.test
 * Description:
 *
 * @author sichen
 * @version 1.0
 * @create 1/4/24 10:58 PM
 */
public class TestSysScheduleDao {
    private static SysScheduleDao scheduleDao;
    @BeforeClass
    public static void initScheduleDao() {
        scheduleDao = new SysScheduleDaoImpl();
    }

    @Test
    public void testAddSchedule() {
        int row = scheduleDao.addSchedule(new SysSchedule(null, 2, "学习数据库", 1));
        System.out.println(row);
    }

    @Test
    public void testFindAll() {
        List<SysSchedule> scheduleList = scheduleDao.findAll();
        scheduleList.forEach(System.out::println);
    }
}
