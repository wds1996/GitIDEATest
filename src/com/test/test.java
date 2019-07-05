package com.test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
//        单行注释；
        /* 多行注释 */
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(1);
        System.out.println(arrayList.get(0));
        method();
    }

    public static void method() {
        System.out.println(11111);
        String[] arr = new String[]{"aaa", "bbb", "ccc"};
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
