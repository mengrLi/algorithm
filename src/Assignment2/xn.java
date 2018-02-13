package Assignment2;

import java.util.Scanner;


public class xn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入x：");
        int x = sc.nextInt();
        System.out.println("输入n：");
        int n = sc.nextInt();
        System.out.println(function(x, n));

    }
    public static int function (int x,int n){
        if(n > 0){
            return x*function(x, n - 1);
        }
        return 1;
    }
}