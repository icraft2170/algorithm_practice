package me.tpsw.p1;

import java.util.Scanner;

public class Main {
  public int[] solution(int[] arr1, int[] arr2) {
    int i1, i2;
    i1 = i2 = 0;
    int[] results = new int[arr1.length + arr2.length];

    for (int i = 0; i < results.length; i++) {
      if (i1 == arr1.length) {
        results[i] = arr2[i2];
        i2++;
        continue;
      }
      if (i2 == arr2.length) {
        results[i] = arr1[i1];
        i1++;
        continue;
      }

      if (arr1[i1] < arr2[i2]) {
        results[i] = arr1[i1];
        i1++;
      } else {
        results[i] = arr2[i2];
        i2++;
      }
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
    int[] results = main.solution(arr1, arr2);
    for (int result : results) {
      System.out.print(result + " ");
    }
  }
}
