package com.example.exam.service;

import com.example.exam.Schedule;
import com.example.exam.mapper.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    public void createTable(){
        scheduleMapper.createTable();
    }

    public void dropTable(){
        scheduleMapper.dropTable();
    }

    public void save(Schedule schedule){
        scheduleMapper.save(schedule);
    }

    public Schedule[] list(){
        return scheduleMapper.list();
    }

    public Schedule find(Integer id){
        return scheduleMapper.find(id);
    }
}
