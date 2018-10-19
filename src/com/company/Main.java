package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random inp = new Random();
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int[] arr= new int[25];
        for (int i = 0; i<arr.length; i++) {
            arr[i]= i;
            max= Math.max(max, arr[i]);
            min= Math.min(min, arr[i]);
        }
        System.out.println("arr[min] = "+ arr[min]+"\narr[max] = "+arr[max]);
        int temp= arr[min];
        arr[min]= arr[max];
        arr[max]= temp;
        System.out.println("Поменять местами максимальный и минимальный элемент массива:");
        System.out.println(Arrays.toString(arr));

        int[] arr2= new int[25];
        for (int i = 0; i<arr2.length; i++) {
            arr2[i] = inp.nextInt(25);
        }
        System.out.println("Массив случайных чисел:");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Массив случайных чисел в упорядоченном виде:");
        System.out.println(Arrays.toString(arr2)+"\n");

        int[] arr3= new int[20];
        for (int i = 0; i<arr3.length; i++) {
            arr3[i]= inp.nextInt(20);
        }
        System.out.println(Arrays.toString(arr3));
        double tem= 0;
        for (int i = 0; i<arr3.length; i++) {
            tem= tem + arr3[i];
        }
        double middle = tem/arr3.length;
        System.out.println("Средние значение массива: "+middle+"\n");

        int[] arr4= new int[30];
        int even= 0;
        int odd= 0;
        int evens= 0;
        int odds= 0;
        for (int i = 0; i<arr4.length; i++) {
            arr4[i]= i;
            if (i % 2 == 0) {even= even+i;}
            else {odd= odd+i;}
            evens= (even+even) / 2;
            odds= (odd+odd) / 2;
        }
        System.out.println(Arrays.toString(arr4));
        System.out.println("Сумма четных элементов: "+evens+"\n Сумма нечетных элементов: "+odds);

        System.out.println("Таблица 3х5 случайных элементов:");
        for (int i = 0; i<3; i++) {
            for (int f = 0; f<5; f++) {
                System.out.print(inp.nextInt(50) + " ");
            }
            System.out.print("\n");
        }
        String[] str = new String[]{"String 1 "," String 2"," String 3","Same string","Same string"};
        String s1,s2,s3,s4,s5;
         s1 = str[0];
         s2 = str[1];
         s3 = str[2];
         s4 = str[3];
         s5 = str[4];
        System.out.println(Arrays.toString(str)+"\n");
        if (s4==s5) {System.out.println(s1+s2);}
        else {System.out.println(s1+s3);}
    }
}
