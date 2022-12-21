package me.hero.datastructure.p4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public int solution(String s, String t) {
    int answer = 0;

    char[] tArr = t.toCharArray();
    HashMap<Character, Integer> tMap = new HashMap<>();
    for (char c : tArr) {
      tMap.put(c, tMap.getOrDefault(c, 0) + 1);
    }

    char[] sArr = s.toCharArray();
    HashMap<Character, Integer> sMap = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
    }
    if (sMap.equals(tMap)) {
      answer++;
    }



    int lt = 0;
    int rt = t.length();
    while (rt < s.length()) {
      sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);
      sMap.put(sArr[lt], sMap.getOrDefault(sArr[lt], 0) - 1);
      if (sMap.get(sArr[lt]) == 0) {
        sMap.remove(sArr[lt]);
      }
      lt++;
      rt++;
      if (sMap.equals(tMap)) {
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String s = reader.nextLine();
    String t = reader.nextLine();

    Main main = new Main();
    System.out.print(main.solution(s, t));
  }
}