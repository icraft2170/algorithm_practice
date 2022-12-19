package me.hero.datastructure.p2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public String solution(String str1, String str2) {
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();

    for (char key : str1.toCharArray()) {
      Integer value = map1.getOrDefault(key, 0);
      map1.put(key, value + 1);
    }

    for (char key : str2.toCharArray()) {
      Integer value = map2.getOrDefault(key, 0);
      map2.put(key, value + 1);
    }

    if (map1.equals(map2)) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str1 = reader.nextLine();
    String str2 = reader.nextLine();

    Main main = new Main();
    System.out.print(main.solution(str1, str2));
  }
}