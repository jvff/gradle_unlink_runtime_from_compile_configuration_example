package com.janitovff.test;

import com.janitovff.test.lib.TestLib;

public class TestClass {
    public static void main(String[] args) {
        TestLib object = new TestLib();

        System.out.println("Calling TestLib.methodA()");
        object.methodA();

        System.out.println("Calling TestLib.methodB()");
        object.methodB();
    }
}
