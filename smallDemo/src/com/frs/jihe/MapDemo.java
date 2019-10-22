package com.frs.jihe;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("ni",1);
        map.put("wo",2);
        map.put("ta",3);
        Iterator iterator=map.keySet().iterator();
        while (iterator.hasNext()){
            String key=(String) iterator.next();
            System.out.println(map.get(key));
        }
        MyComparator comparator = new MyComparator();
        Map<String,Object> treeMap=new TreeMap<>(comparator);
        treeMap.put("ni",1);
        treeMap.put("wo",2);
        treeMap.put("ta",3);
        Iterator treeIterator=treeMap.keySet().iterator();
        while (treeIterator.hasNext()){
            String key=(String) treeIterator.next();
            System.out.println(treeMap.get(key));
        }
    }

    static class MyComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            // TODO Auto-generated method stub
            String param1 = (String) o1;
            String param2 = (String) o2;
            return -param1.compareTo(param2);
        }
    }
}
