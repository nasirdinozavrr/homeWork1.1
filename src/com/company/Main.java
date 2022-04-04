package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String something;
        final int NUM = 1;
        String word = "Hello World";
        something = NUM + word;
        System.out.println(something);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if(NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("Вы сохранили ноль");

        }
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше имя; ");
        String name = input.nextLine();
        System.out.println("О, Привет " + name);

    }
}