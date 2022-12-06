package me.hero.array.p03;

import java.util.Scanner;
// 1 - 가위 / 2 - 바위 / 3 - 보
public class Main {
  public String solution(int playerA, int playerB) {
    if ((playerA == 1 && playerB == 2) || (playerA == 2 && playerB == 3) || (playerA == 3 && playerB == 1)) {
      return "B";
    } else if ((playerB == 1 && playerA == 2) || (playerB == 2 && playerA == 3) || (playerB == 3 && playerA == 1)) {
      return "A";
    } else {
      return "D";
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int count = reader.nextInt();
    int[][] rockPaperScissors = new int[2][count];

    for (int i = 0; i < count; i++) {
      rockPaperScissors[0][i] = reader.nextInt();
    }

    for (int i = 0; i < count; i++) {
      rockPaperScissors[1][i] = reader.nextInt();
    }
    Main main = new Main();

    for (int i = 0; i < count; i++) {
      System.out.println(main.solution(rockPaperScissors[0][i], rockPaperScissors[1][i]));
    }

  }
}
