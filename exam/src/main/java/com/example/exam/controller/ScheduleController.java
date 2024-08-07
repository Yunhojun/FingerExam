package com.example.exam.controller;

import com.example.exam.Schedule;
import com.example.exam.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public String test(){
        return "hello";
    }

    @GetMapping("/createTable")
    public String createTable(){
        scheduleService.createTable();
        return  "Table Created!";
    }

    @GetMapping("/dropTable")
    public String dropTable(){
        scheduleService.dropTable();
        return  "Table Droped!";
    }

    @GetMapping("/clear")
    public String clearTable(){
        scheduleService.dropTable();
        scheduleService.createTable();
        return "Table Cleared!";
    }

    @PostMapping("/save")
    public void save(@RequestBody Schedule schedule){
        scheduleService.save(schedule);
    }

    @GetMapping("/list")
    public Schedule[] list(){
        return scheduleService.list();
    }

    @GetMapping("/find/{id}")
    public Schedule find(@PathVariable Integer id){
        return scheduleService.find(id);
    }
}
