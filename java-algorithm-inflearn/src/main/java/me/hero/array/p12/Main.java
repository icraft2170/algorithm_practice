package me.hero.array.p12;

import java.util.Scanner;

public class Main {
  public int solution(int[][] arr, int n, int m) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == j) continue;
        int count = 0;

        for (int k = 0; k < m; k++) {
          int position1 = 0;
          int position2 = 0;
          for (int s = 0; s < n; s++) {
            if (arr[k][s] == i) { position1 = s; }
            if (arr[k][s] == j) { position2 = s; }
          }
          if (position1 < position2) {
            count++;
          }
        }
        if (count == m) {
          answer++;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] arr = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = reader.nextInt();
      }
    }

    Main main = new Main();
    System.out.print(main.solution(arr, n, m));



  }
}
