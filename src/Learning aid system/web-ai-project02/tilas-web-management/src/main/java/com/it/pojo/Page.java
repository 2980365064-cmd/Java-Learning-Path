package com.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    private Integer page =1;
    private Integer pageSize=10;
    private String name;
    private String degree;
    private Integer clazzId;
    private @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate begin;
    private @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate end;
}
