package com.example.laki.app.springbootact;

import org.junit.runners.Parameterized;

import java.util.Collection;

public class JustTest {

    public static  void main(String[] args){
        System.out.println(getstring());
    }

    private static String getstring() {
        String val="Hello";
        try {
            System.out.println(val);
            System.exit(0);
        }
        finally {
            System.out.println("World");
        }
        return null;
    }
}
