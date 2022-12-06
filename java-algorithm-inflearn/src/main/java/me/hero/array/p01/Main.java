package me.hero.array.p01;

import java.util.Scanner;
public class Main {
  public void solution(int[] numbers) {
    System.out.print(numbers[0]);
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i - 1] < numbers[i]) {
        System.out.print(" " + numbers[i]);
      }
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int count = Integer.parseInt(reader.nextLine());
    int[] numbers = new int[count];
    for (int i = 0; i < count; i++) {
      numbers[i] = reader.nextInt();
    }

    Main main = new Main();
    main.solution(numbers);
  }
}
