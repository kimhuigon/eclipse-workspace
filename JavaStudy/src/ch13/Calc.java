package ch13;

public interface Calc {
  // public static double PI
  double PI = 3.14;
  // public static int ERROR
  int ERROR = -999999999;
  
  // public abstract int add(..)
  int add(int num1, int num2);
  
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);
}
