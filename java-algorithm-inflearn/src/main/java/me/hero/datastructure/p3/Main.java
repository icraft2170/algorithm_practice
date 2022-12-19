package me.hero.datastructure.p3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public int[] solution(int n, int k, int[] arr) {
    int[] answer = new int[n - k + 1];
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < k; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    answer[0] = map.keySet().size();

    int lt = 0;
    int rt = k;
    for (int i = 1; i < answer.length; i++) {
      map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
      rt++;

      map.put(arr[lt], map.get(arr[lt]) - 1);
      if (map.get(arr[lt]) == 0) {
        map.remove(arr[lt]);
      }
      lt++;
      answer[i] = map.keySet().size();
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = reader.nextInt();
    }

    Main main = new Main();
    int[] results = main.solution(n, k, arr);

    for (int result : results) {
      System.out.print(result + " ");
    }
  }
}