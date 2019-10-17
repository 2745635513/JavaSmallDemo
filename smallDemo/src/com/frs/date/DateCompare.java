package com.frs.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        System.out.println(sdf.format(date));
        Date date1=sdf.parse("2019-10-16 10:00:00");
        //date的比较
        System.out.println("今天在昨天 " +(date.before(date1) ? "前面" :"后面"));
//        string的比较
        System.out.println("今天在昨天的 "+(date.toString().compareTo(date1.toString() )< 0 ?"后面" :"前面"));
    }
}
