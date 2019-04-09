package com.kursk;

public class Util {
    public static void println(String s){
        System.out.println(s);
    }

    public static void println(boolean b){
        System.out.println(b);
    }

    public static void println(int i){
        System.out.println(i);
    }

    public static void println(Object o){
        System.out.println(o.toString());
    }

    public static void println(Double o){
        System.out.println(o.toString());
    }

    public static void print(String s){ System.out.print(s);}

    public static void print(boolean b){
        System.out.print(b);
    }

    public static void print(int i){
        System.out.print(i);
    }

    public static void print(Object o){
        System.out.print(o.toString());
    }

    public static void printf(String format, Object ... args)
    {
        System.out.printf( format,  args);
    }
}
