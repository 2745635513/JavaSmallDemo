package com.frace.thinking.ninthChapter;

import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

/**
 * Created by frace on 2019/11/18 17:50
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object items[];
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object item) {
        if (next < items.length) {
            items[next++] = item;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

    private class Printer{
        String name="frace ";
        Printer(String name){
            this.name+=name;
        }
        public String toString(){
            return name;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
    public Printer getPrinter(){
        return new Printer("feng");
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + ",");
            selector.next();
        }
        System.out.println(sequence.getPrinter());
    }
}
