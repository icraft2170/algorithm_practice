package me.hero.array.p08;

import java.util.Scanner;

public class Main {
  public void solution(int index, int[] scores) {
    int rank = 1;
    for (int i = 0; i < index; i++) {
      for (int j = 0; j < index; j++) {
        if (scores[i] < scores[j]) rank++;
      }
      System.out.print(rank + " ");
      rank = 1;
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    int[] scores = new int[index];
    for (int i = 0; i < scores.length; i++) {
      scores[i] = reader.nextInt();
    }

    Main main = new Main();
    main.solution(index, scores);
  }
}
