package me.tpsw.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public ArrayList<Integer> solution(int[] arr1, int[] arr2, int num1, int num2) {
    ArrayList<Integer> results = new ArrayList<>();
    int p1, p2;
    p1 = p2 = 0;

    while (p1 < num1 && p2 < num2) {
      if (arr1[p1] < arr2[p2]) results.add(arr1[p1++]);
      else results.add(arr2[p2++]);
    }

    while (p1 < num1) {
      results.add(arr1[p1++]);
    }

    while (p2 < num2) {
      results.add(arr2[p2++]);
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
    ArrayList<Integer> results = main.solution(arr1, arr2, num1, num2);
    results.forEach(i -> {
      System.out.print( i + " ");
    });
  }
}
