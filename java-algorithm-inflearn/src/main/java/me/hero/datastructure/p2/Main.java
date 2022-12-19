package me.hero.datastructure.p2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public String solution(String str1, String str2) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (char key : str1.toCharArray()) {
      map.put(key, map.getOrDefault(key, 0) + 1);
    }

    for (char key : str2.toCharArray()) {
      if (!map.containsKey(key) || map.get(key) == 0) {
        return "NO";
      }
      map.put(key, map.get(key) - 1);
    }

    return "YES";
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str1 = reader.nextLine();
    String str2 = reader.nextLine();

    Main main = new Main();
    System.out.print(main.solution(str1, str2));
  }
}