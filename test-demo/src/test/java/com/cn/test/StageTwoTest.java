package com.cn.test;

import com.cn.demo.TestDemo;


public class StageTwoTest {
    public static void main(String[] args) {
        String[] dictionary = {"stage","two","test"};
        /**
         * dictionary 用户自定义字典
         * false 代表不是额外字典， 则只使用用户自定义字典
         */
        TestDemo testDemo = new TestDemo(dictionary,false);
        testDemo.getResult("stagetwotest");
        testDemo.getResult("ilikeicecreamandmango");
    }
}
