package me.hero.array.p11;

import java.util.Scanner;

public class Main {
  public int solution(int[][] arr, int index) {
    int maxIndex = 0;
    int maxCount = Integer.MIN_VALUE;
    for (int i = 0; i < index; i++) {
      int count = 0;
      for (int j = 0; j < index; j++) {
        for (int k = 0; k < 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            count++;
            break;
          }
        }
      }
      if (maxCount < count) {
        maxIndex = i;
        maxCount = count;
      }
    }

    return maxIndex + 1;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    int[][] arr = new int[index][5];
    for (int i = 0; i < index; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = reader.nextInt();
      }
    }

    Main main = new Main();
    int result = main.solution(arr, index);
    System.out.print(result);
  }
}
