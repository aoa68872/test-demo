package com.cn.test;

import com.cn.demo.TestDemo;

public class StageThreeTest {
    public static void main(String[] args) {
        String[] dictionary = {"stage","three","test"};
        /**
         * dictionary 用户自定义字典
         * true 代表额外字典， 则只使双字典
         */
        TestDemo testDemo = new TestDemo(dictionary,true);
        testDemo.getResult("stagethreetest");
        testDemo.getResult("ilikeicecreamandmango");
        testDemo.getResult("ilikeicecreamandmangostagethreetest");
    }
}
