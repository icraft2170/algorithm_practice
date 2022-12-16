package me.tpsw.p6;

import java.util.Scanner;

public class Main {
  public int solution(int[] arr, int index, int changeableCount) {
    int rt = 0, lt = 0, count = 0;
    int maxLength = Integer.MIN_VALUE;

    while (rt < index - 1) {
      rt++;
      if (arr[rt] == 0) {
        count++;
      }
      while (count > changeableCount) {
        lt++;
        if (arr[lt] == 0) {
          count--;
        }
      }
      maxLength = Math.max((rt - lt), maxLength);
    }
    return maxLength;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    int changeableCount = reader.nextInt();

    int[] arr = new int[index];
    for (int i = 0; i < index; i++) {
      arr[i] = reader.nextInt();
    }

    Main main = new Main();
    int result = main.solution(arr, index, changeableCount);
    System.out.print(result);
  }
}