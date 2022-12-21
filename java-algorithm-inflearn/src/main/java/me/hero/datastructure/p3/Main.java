package me.hero.datastructure.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public ArrayList<Integer> solution(int n, int k, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < k - 1; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    int lt = 0;
    for (int rt = k - 1; rt < n; rt++) {
      map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
      answer.add(map.size());
      map.put(arr[lt], map.get(arr[lt]) - 1);
      if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
      lt++;
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

    ArrayList<Integer> solution = main.solution(n, k, arr);
    for (Integer integer : solution) {
      System.out.print(integer + " ");
    }
  }
}