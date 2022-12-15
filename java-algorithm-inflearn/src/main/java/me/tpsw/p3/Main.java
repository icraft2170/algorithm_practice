package me.tpsw.p3;

import java.util.Scanner;

public class Main {
  public int solution(int n, int k, int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < k; j++) {
        if (i < n - j){ sum += arr[i + j];}
      }
      max = Math.max(max, sum);
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = reader.nextInt();
    }

    Main main = new Main();
    int result = main.solution(n, k, arr);
    System.out.print(result);
  }
}
