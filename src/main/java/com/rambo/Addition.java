package com.rambo;
public class Addition{
    
    public static void main(String[] args){
        Addition obj= new Addition();
        int c=obj.add(10,10);
        System.out.println("result" + c);
    }

    public static int add(int a, int b){
        return a+b;
        
    }
    
}