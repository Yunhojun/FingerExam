package com.example.exam.mapper;

import com.example.exam.Schedule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleMapper {
    public void createTable();
    public void dropTable();
    public void save(Schedule schedule);
    public Schedule[] list();
    public Schedule find(Integer id);
}
