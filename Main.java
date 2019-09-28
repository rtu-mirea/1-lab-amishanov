package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Array_c a=new Array_c(1);
        int n, num=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Операции над массивом");
        System.out.println("1. Заполнить случаными");
        System.out.println("2. Заполнить вручную");
        System.out.println("3. Вывод массива");
        System.out.println("4. Обратный вывод");
        System.out.println("5. Перевернуть массив");
        System.out.println("6. Заменить выбранный бит на выбранное значение");
        while (num!=7){
            System.out.println("Выберите операцию");
            num=in.nextInt();
            switch (num){
                case 1:
                    System.out.println("Введите количество элементов");
                    n=in.nextInt();
                    a=new Array_c(n);
                    a.rand_Input();
                    //a.rand_Input1();
                    break;
                case 2:
                    System.out.println("Введите количество элементов");
                    n=in.nextInt();
                    byte[] tarr=new byte[n];
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("Введите элементы массива");
                    for (int i = 0; i < n; i++){
                        tarr[i] = in.nextByte();
                    }
                    a=new Array_c(tarr);
                    //a.Input();
                    break;
                case 3:
                    a.Out();
                    break;
                case 4:
                    a.revers_Out();
                    break;
                case 5:
                    a.swap();
                    break;
                case 6:
                    byte p, v;
                    System.out.println("Введите номер бита [0;7]");
                    p=in.nextByte();
                    System.out.println("Введите номер бита 0 или 1");
                    v=in.nextByte();
                    a.guess_task(p,v);
                    break;
                default:
                    System.out.println("Неверно");
            }
        }
    }
}
