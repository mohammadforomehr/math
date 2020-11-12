package com.example.library_test;

public class math_lib {
    public  static float sum(float a,float b){
        return a+b;
    }
    public  static float min(float a,float b){
        return a-b;
    }
    public  static float mul(float a,float b){
        return a*b;
    }
    public  static float div(float a,float b){
        if (b==0)
            throw new IllegalArgumentException("تقسیم ناموفق");
        return a/b;
    }
}
