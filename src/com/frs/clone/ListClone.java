package com.frs.clone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by frace on 2019/10/13 11:58
 */
public class ListClone {
    public static void main(String[] args) {
        /**
         * 浅拷贝：只是内容拷贝，内容的数组指向却没有改变，所以拷贝的信息改变也会改变目标数组
         */
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        //方法一：循环遍历复制
        List<Integer> copyList=new ArrayList<>(list.size());

        for (Integer item:
             list) {
            copyList.add(item);
        }
        copyList.set(2,8);

        Iterator iterator1 = copyList.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println("改变目标"+list.get(2));
        System.out.println();
        //方法二：使用list实现类的构造方法
        List<Integer> copylist2 = new ArrayList<>(list);
        Iterator iterator2=copylist2.iterator();
        while (iterator2.hasNext()){
            System.out.print(iterator2.next() +" ");
        }
        System.out.println();
        //方法三：使用list的addall方法
        List<Integer> copyList3=new ArrayList<>();
        copyList3.addAll(list);
        Iterator iterator3=copyList3.iterator();
        while (iterator3.hasNext()){
            System.out.print(iterator3.next()+" ");
        }
        System.out.println();
        //方法四：使用System.arrayCopy
        Integer[] listArr=list.toArray(new Integer[0]);
        Integer[] copyList4=new Integer[list.size()];
        System.arraycopy(listArr,0,copyList4,0,list.size());
        for (Integer item:
             copyList4) {
            System.out.print(item+" ");
        }
    }
}
