package com.test.hello;

public class HelloModule {
    public static void main(String[] args) {
        System.out.println("Hello Modules!");

    }
    public String mergeStrings(String str1, String str2)
    {
        return str1.concat(str2);
    }
    public String mergeStringsWithDash(String str1, String str2)
    {
        return str1.concat("-").concat(str2);
    }
}
