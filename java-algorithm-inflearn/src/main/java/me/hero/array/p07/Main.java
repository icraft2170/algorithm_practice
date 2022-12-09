package me.hero.array.p07;

import java.util.Scanner;

public class Main {
  public int solution(int index, int[] scores) {
    int score = 0;
    int count = 1;

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] == 1) {
        score += count;
        count++;
      } else {
        count = 1;
      }
    }
    return score;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    int[] scores = new int[index];
    for (int i = 0; i < scores.length; i++) {
      scores[i] = reader.nextInt();
    }

    Main main = new Main();
    int score = main.solution(index, scores);
    System.out.print(score);
  }
}
