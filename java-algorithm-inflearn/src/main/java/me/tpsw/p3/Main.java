package me.tpsw.p3;

import java.util.Scanner;

/**
 * Sliding Window 기법
 */
public class Main {
  public int solution(int n, int k, int[] arr) {
    int max;
    int sum = 0;

    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    max = sum;

    for (int i = k; i < n; i++) {
      sum = sum - arr[i - k] + arr[i];
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
