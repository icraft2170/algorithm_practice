package me.hero.datastructure.p1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public char solution(int index, String str) {
    char answer = ' ';
    HashMap<Character, Integer> map = new HashMap<>();
    for (char x : str.toCharArray()){
      map.put(x, map.getOrDefault(x, 0) + 1);
    }

    int max = Integer.MIN_VALUE;
    for (char key : map.keySet()) {
      Integer value = map.get(key);
      if (value > max) {
        max = value;
        answer = key;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    String str = reader.next();

    Main main = new Main();
    System.out.print(main.solution(index, str));
  }
}