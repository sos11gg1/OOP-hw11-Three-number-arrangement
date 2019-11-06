package com.example.lib;

public class MyClass {
    public static void main(String[] avg){
        int a;
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if(x>y){
            a=x;
            x=y;
            y=a;
        }
        if(x>z){
            a=x;
            x=z;
            z=a;
        }
        if(y>z){
            a=y;
            y=z;
            z=a;
        }
        System.out.println(x+"  "+y+"  "+z);
    }
}
