package me.hero.array.p06;

import java.util.Scanner;

public class Main {
  public void solution(int[] numbers) {
    int n = numbers.length;
    for (int i = 0; i < n; i++) {
      int tmp = numbers[i];
      int result  = 0;
      while (tmp > 0) {
        int t = tmp % 10;
        result = result * 10 + t;
        tmp = tmp / 10;
      }

      if (isPrime(result)) {
        System.out.print(result + " ");
      }
    }
  }

  private boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int count = reader.nextInt();
    int[] numbers = new int[count];
    for (int i = 0; i < count; i++) {
      numbers[i] = reader.nextInt();
    }

    Main main = new Main();
    main.solution(numbers);
  }
}
