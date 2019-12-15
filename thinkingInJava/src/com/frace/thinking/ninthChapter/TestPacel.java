package com.frace.thinking.ninthChapter;


import sun.security.krb5.internal.crypto.Des;

/**
 * Created by frace on 2019/11/18 21:26
 */
class Parcel4 {
    private class PContent implements Contents {
        private int i = 4;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContent();
    }
}
public class TestPacel {

    public static void main(String[] args) {
        Parcel4 parcel4=new Parcel4();
        Contents contents=parcel4.contents();
        Destination destination=parcel4.destination("frace_feng");
    }
}
