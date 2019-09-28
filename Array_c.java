package com.company;
import java.util.Scanner;
import java.util.Random;

public class Array_c {
    int count;
    byte arr[];
    Array_c(int count){
        this.count=count;
        arr = new byte [count];
    }
    void rand_Input (){//Метод получения псевдо случайного числа
        for (int i = 0; i < count; i++){
            arr[i] = (byte) ((Math.random()*255)-128) ;
        }
    }
    void rand_Input1 (){//Метод получения псевдо случайного числа через Random
        Random random=new Random();
        random.nextBytes(arr);

    }

    void Input(){ //Метод ввода в консоль
        System.out.println("Введите " + count + " Чисел");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        for (int i = 0; i < count; i++){
            arr[i] = in.nextByte();
        }
    }
    void Out(){
        System.out.println("Ваш массив: ");
        for (int i:arr){
            System.out.println(i);
        }
    }
    void revers_Out(){
        System.out.println("Ваш массив: ");
        for (int i=count-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    void swap(){
        int mid= count / 2;
        for (int i=0; i<mid;i++) {
            byte temp = arr[i];
            arr[i] = arr[count - 1 - i];
            arr[count - 1 - i]=temp;
        }
        //this.Out();
    }
    void guess_task(byte pos,byte val){
      for (int i=0; i<count;i++){
           if (val==1)
               arr[i]=(byte) (arr[i] | (1<<pos));
           else
               arr[i]=(byte) (arr[i] & ~(1<<pos));
        }
        //this.Out();
    }
}
