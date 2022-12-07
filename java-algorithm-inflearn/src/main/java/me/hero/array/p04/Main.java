package me.hero.array.p04;

import java.util.Scanner;

public class Main {
  public int[] solution(int count) {
    int[] sequence = new int[count];
    sequence[0] = 1;
    sequence[1] = 1;
    for (int i = 2; i < count; i++) {
      sequence[i] = sequence[i - 1] + sequence[i - 2];
    }

    return sequence;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int i = reader.nextInt();

    Main main = new Main();
    int[] resultArray = main.solution(i);
    for (int n : resultArray) {
      System.out.print(n + " ");
    }
  }
}
