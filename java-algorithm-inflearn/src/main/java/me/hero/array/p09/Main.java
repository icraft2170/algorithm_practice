package me.hero.array.p09;
import java.util.Scanner;

public class Main {
  public int solution(int[][] number, int index) {
    int answer = Integer.MIN_VALUE;
    int sum1; int sum2;

    for (int i = 0; i < index; i++) {
      sum1 = sum2 = 0;
      for (int j = 0; j < index; j++) {
        sum1 += number[i][j];
        sum2 += number[j][i];
      }
      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);
    }
    sum1 = sum2 = 0;
    for (int i = 0; i < index; i++) {
      sum1 += number[i][i];
      sum2 += number[i][index - i - 1];
    }
    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);
    return answer;
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
