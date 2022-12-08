package me.hero.array.p06;

import java.util.Scanner;

public class Main {
  public void solution(String[] numbers) {
    int[] numberArray = new int[numbers.length];
    int index = 0;
    for (String numberStr : numbers) {
      numberArray[index] = Integer.parseInt(new StringBuilder(numberStr).reverse().toString());
      index++;
    }

    for (int i = 0; i < numberArray.length; i++) {
      printPrimeNumber(numberArray[i]);
    }

  }

  private void printPrimeNumber(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (count > 2) return;
      if (number % i == 0) count++;
    }
    if (count == 2) {
      System.out.print(number + " ");
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int count = reader.nextInt();
    String[] numbers = new String[count];
    for (int i = 0; i < count; i++) {
      numbers[i] = reader.next();
    }

    Main main = new Main();
    main.solution(numbers);
  }
}
