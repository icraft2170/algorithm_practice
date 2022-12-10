package me.hero.array.p09;

import java.util.Scanner;

public class Main {
  public int solution(int[][] number, int index) {
    int max = 0;
    int sum = 0;

    for (int i = 0; i < index; i++) {
      for (int j = 0; j < index; j++) {
        sum += number[i][j];
      }
      if (max < sum) {
        max = sum;
      }
      sum = 0;
    }

    for (int i = 0; i < index; i++) {
      for (int j = 0; j < index; j++) {
        sum += number[j][i];
      }
      if (max < sum) {
        max = sum;
      }
      sum = 0;
    }

    for (int i = 0; i < index; i++) {
      for (int j = 0; j < index; j++) {
        if (i == j) {
          sum += number[j][i];
        }
      }
    }
    if (max < sum) {
      max = sum;
    }
    sum = 0;

    for (int i = 0; i < index; i++) {
      for (int j = 0; j < index; j++) {
        if (i + j == (index)) {
          sum += number[i][j];
        }
      }
    }
    if (max < sum) {
      max = sum;
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    int[][] number = new int[index][index];
    for (int i = 0; i < index; i++) {
      for (int j = 0; j < index; j++) {
        number[i][j] = reader.nextInt();
      }
    }

    Main main = new Main();
    int result = main.solution(number, index);
    System.out.print(result);
  }
}
