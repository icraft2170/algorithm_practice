package me.hero.array.p05;

import java.util.Scanner;

public class Main {
  public int solution(int index) {
    int[] numbers = new int[index + 1];
    int answer = 0;
    for (int i = 2; i <= index; i++) {
      numbers[i] = i;
    }

    for (int i = 2; i <= index; i++) {
      if (numbers[i] == 0) continue;
      answer++;
      for (int j = 2 * i; j <= index; j+=i) {
        numbers[j] = 0;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int i = reader.nextInt();

    Main main = new Main();
    int result = main.solution(i);
    System.out.print(result);
  }
}
