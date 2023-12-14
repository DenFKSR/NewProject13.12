package Task2;

public class Laba2 {
    public static void main(String[] args) {
        var a = 10;
        var b = 3;

       System.out.println(Calculator.summ(a,b));
       System.out.println(Calculator.subtraction(a,b));
       System.out.println(Calculator.multiplication(a,b));
       System.out.println(Calculator.div(a,b));
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
    public static double div(int a, int b){
        return (double)a/b;
    }
    public static double div(long a, long b){
        return (double) a/b;
    }
    public static double div(double a, double b){// последнее
        return a/b;
    }
}
