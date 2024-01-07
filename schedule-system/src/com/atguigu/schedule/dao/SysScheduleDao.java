package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * ClassName: SysScheduleDao
 * Package: com.atguigu.schedule.dao
 * Description:
 *
 * @author sichen
 * @version 1.0
 * @create 1/4/24 9:09 PM
 */


public interface SysScheduleDao {
    /**
     * 用于向数据库中增加一条日程记录
     * @param schedule 日程数据以SysSchedule实体类对象形式入参
     * @return 返回影响数据库记录的行数。行数为0说明增加失败，大于0说明成功
     */
    int addSchedule(SysSchedule schedule);

    /**
     * 查询所有用户的所有日程
     * @return 将所有日程放入一个:List<SysSchedule>集合中返回
     */
    List<SysSchedule> findAll();
}

