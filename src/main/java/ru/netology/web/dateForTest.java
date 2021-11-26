package ru.netology.web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public  class dateForTest {
    public String lDate (){
        LocalDate date = LocalDate.now();
        String testDate;
        date = date.plusDays(3);
        testDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return testDate;
    }
    public String dateToday(){
        LocalDate today = LocalDate.now();
        String todayString;
        todayString = today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return todayString;
    }

}


