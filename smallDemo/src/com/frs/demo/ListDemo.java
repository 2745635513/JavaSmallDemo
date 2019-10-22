package com.frs.demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {
    public static void main(String[] args) {
//        Integer[] age={12,3,18,23};
//        List list = Arrays.asList(age);//不能进行增删操作
//        List<Integer> list1= Stream.of(age).collect(Collectors.toList());
//
//        String[] arrays = {"a", "b", "c"};
//        List<String> listStrings = Stream.of(arrays).collect(Collectors.toList());
//
//
//        Integer[] ageCopy=list1.stream().toArray(Integer[]::new);//
//
//        System.out.println(0.1+0.2>0.3);
//        System.out.println(0.1F+0.2F);

        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1,3);
        List list1=new LinkedList(list);
        list.addAll(list1);

        list=list.subList(2,5);
        list.clear();
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }

    }
}
