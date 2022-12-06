package me.hero.array.p02;

import java.util.Scanner;

public class Main {
  public int solution(int[] heightArray) {
    int count = 1;
    int maxHeight = heightArray[0];
    for (int i = 1; i < heightArray.length; i++) {
      if (maxHeight < heightArray[i]) {
        maxHeight = heightArray[i];
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int count = reader.nextInt();
    int[] heightArray = new int[count];

    for (int i = 0; i < count; i++) {
      heightArray[i] = reader.nextInt();
    }

    Main main = new Main();
    int maxCounts = main.solution(heightArray);
    System.out.print(maxCounts);
  }
}
