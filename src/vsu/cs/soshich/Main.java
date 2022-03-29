package vsu.cs.soshich;

import java.util.ArrayList;
import java.util.Scanner;


public class Main
  {

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print("Введите " + (i+1) + "-й элемент списка: ");
            arrayList1.add(scanner.nextInt());
        }
        int lastSymbol;
        boolean flag = false; // false - такого числа еще не было, true - уже было
        for (int i = 0; i < arrayList1.size(); i++)
        {
            lastSymbol = arrayList1.get(i);
            flag = false;
            for (int j = 0; j < arrayList2.size(); j++)
            {
                if (arrayList2.get(j) == lastSymbol)
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                arrayList2.add(lastSymbol);
            }
        }

        for (int i = 0; i < arrayList1.size(); i++)
        {
            System.out.print(arrayList1.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayList2.size(); i++)
        {
            System.out.print(arrayList2.get(i) + " ");
        }
    }
}