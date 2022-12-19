package me.hero.tpsw.p4;

import java.util.Scanner;
public class Main {
  public int solution(int n, int m, int[] arr) {
    int count = 0;
    int sum = 0;
    int lt = 0;

    for (int rt = 0; rt < n; rt++) {
      sum += arr[rt];
      if (sum == m)
        count++;
      while (sum >= m) {
        sum -= arr[lt++];
        if (sum == m) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = reader.nextInt();
    }

    Main main = new Main();
    int result = main.solution(n, m, arr);
    System.out.print(result);
  }
}
