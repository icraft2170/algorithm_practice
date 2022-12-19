package me.hero.datastructure.p3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public int[] solution(int n, int k, int[] arr) {
    int[] answer = new int[n - k + 1];
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < answer.length; i++) {
      for (int j = i; j < k + i; j++) {
        set.add(arr[j]);
      }
      answer[i] = set.size();
      set.clear();
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