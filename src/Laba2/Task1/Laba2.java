package Laba2.Task1;

public class Laba2 {
    public static void main(String[] args) {
        var a = 7.27;
        var b = 8.35;
        Calculator calculator = new Calculator();
        System.out.println(calculator.summ(a,b));
        System.out.println(calculator.subtraction(a,b));
        System.out.println(calculator.multiplication(a,b));
        System.out.println(calculator.div(a,b));
    }
}
class Calculator{
    public static int summ(int a, int b){
        return a+b;
    }
    public static long summ(long a, long b){
        return a+b;
    }
    public static double summ(double a, double b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static long subtraction(long a, long b){
        return a-b;
    }
    public static double subtraction(double a, double b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static long multiplication(long a, long b){
        return a*b;
    }
    public static double multiplication(double a, double b){// последнее
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static long div(long a, long b){
        return a/b;
    }
    public static double div(double a, double b){// последнее
        return a/b;
    }
}
