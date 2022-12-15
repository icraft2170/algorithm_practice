package me.tpsw.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public ArrayList<Integer> solution(int[] arr1, int[] arr2, int num1, int num2) {
    ArrayList<Integer> results = new ArrayList<>();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int p1, p2;
    p1 = p2 = 0;

    while (p1 < num1 && p2 < num2) {
      if (arr1[p1] == arr2[p2]) {
        results.add(arr1[p1++]);
        p2++;
      }
      else if (arr1[p1] < arr2[p2]) p1++;
      else p2++;
    }

    return results;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int num1 = reader.nextInt();
    int[] arr1 = new int[num1];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = reader.nextInt();
    }

    int num2 = reader.nextInt();
    int[] arr2 = new int[num2];
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = reader.nextInt();
    }

    Main main = new Main();
    for (Integer integer : main.solution(arr1, arr2, num1, num2)) {
      System.out.print(integer + " ");
    }
  }
}
