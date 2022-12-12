package me.hero.array.p10;

import java.util.Scanner;

public class Main {
  public int solution(int[][] arr, int index) {
    int count = 0;

    for (int i = 1; i <= index; i++) {
      for (int j = 1; j <= index; j++) {
        int tmp = arr[i][j];
        if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1]
            && arr[i][j] > arr[i][j + 1]) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    int[][] arr = new int[index + 2][index + 2];
    for (int i = 1; i <= index; i++) {
      for (int j = 1; j <= index; j++) {
        arr[i][j] = reader.nextInt();
      }
    }

    Main main = new Main();
    int result = main.solution(arr, index);
    System.out.print(result);

  }
}
