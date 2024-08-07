package com.example.exam;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.PostConstruct;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class Schedule {
   private Integer id;
   private LocalDate startDate;
   private LocalDate endDate;
   private String color;
   private String title;
   private String description;
   private String file;
   private String repeatTerm;
   private String alarmTime;
}