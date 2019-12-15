package com.frace.thinking.tenthChapter;

import com.frace.thinking.ninthChapter.Parcel7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by frace on 2019/11/19 21:30
 */
public class Test extends Parcel7 {
    public static void main(String[] args) {
//        System.out.println(Test.class instanceof Object);
        List list=Arrays.asList(1,2,3);
        List list1=Arrays.asList(1,3,5);
        List list2=list.subList(1,2);
        System.out.println(list.size());
//        System.out.println(list.retainAll(list2));

    }
}
