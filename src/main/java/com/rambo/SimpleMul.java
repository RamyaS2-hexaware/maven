package com.rambo;
public class SimpleMul{
    
    public static void main(String[] args){
        SimpleMul obj= new SimpleMul();
        int c=obj.mul(4,5);
        System.out.println("result" + c);
    }

    public static int mul(int a, int b){
        return a*b;
        
    }
    
}