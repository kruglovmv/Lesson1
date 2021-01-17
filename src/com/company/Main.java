package com.company;

public class Main {

    public static void main(String[] args) {
	    byte a = 1;
	    short b = 2;
	    int c =-3;
	    long d = 4L;
	    float e = 5f;
	    double f = 6.1;
	    char g = '7';
	    boolean h = false;
	    String i = "9";
	    System.out.println(task3(1.2f,3.4f, 5.6f, 7.8f));
        int one, two;
        one=two=10;
	    System.out.println("Сумма " +one+ " и " +two+ " лежит в пределах от 10 до 20 " + task4(one,two));
	    task5(-3);
	    int number = 0;
        System.out.println("Число " +number+ " положительное " + task6(number));
        String name = "Михаил";
        task7(name);
        task8(2200);
    }
    public static float task3 (float a, float b, float d, float c){
      return a*(b+(c/d));
    }
    public static boolean task4 (int one, int two){
        return ((one+two)>=10)&&((one+two)<=20);
    }
    public static void task5 (int number) {
        if (number>=0) System.out.println("Число " +number+ " положительное");
        else System.out.println("Число " +number+ " отрицательное");
    }
    public static boolean task6 (int number) {
        return number>=0;
    }
    public static void task7 (String name) {
        System.out.println("Привет, " +name);
    }
    public static void task8 (int year) {
        if (year % 4 > 0) System.out.println("Год "+year+ " не високосный");
                else if (year%100 > 0) System.out.println("Год "+year+ " високосный");
                     else if (year%400 == 0) System.out.println("Год "+year+ " високосный");
                          else System.out.println("Год "+year+ " не високосный");
    }
}
