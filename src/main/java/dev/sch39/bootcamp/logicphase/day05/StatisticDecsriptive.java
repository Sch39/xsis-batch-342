package dev.sch39.bootcamp.logicphase.day05;

import java.util.*;

public class StatisticDecsriptive {
  public static Double getMean(Integer[] arr) {
    Double sumArr = 0.0;
    for (int num : arr) {
      sumArr += num;
    }
    return sumArr / arr.length;
  }

  public static Double getMedian(Integer[] arr) {
    Arrays.sort(arr);
    Double median;
    if (arr.length % 2 == 0) {
      median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
    } else {
      median = Double.valueOf(arr[arr.length / 2]);
    }

    return median;
  }

  public static Integer getMode(Integer[] arr) {
    int freqShow = 1;
    Integer mode = null;
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == arr[i]) {
          count++;
        }
      }

      if (count > freqShow) {
        freqShow = count;
        mode = arr[i];
      }
    }
    return mode;
  }

  public static Integer getMin(Integer[] arr) {
    Arrays.sort(arr);
    return arr[0];
  }

  public static Integer getMax(Integer[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Masukkan ukuran deret (masukan angka minus untuk keluar): ");
      int row = scanner.nextInt();
      if (row < 0) {
        System.out.println("Keluar program");
        break;
      }
      int counter = 0;
      Integer[] arr = new Integer[row];
      while (counter < row) {
        System.out.print("Index-" + counter + ": ");
        arr[counter] = scanner.nextInt();
        counter++;
      }

      System.out.println("Mean: " + getMean(arr));
      System.out.println("Median: " + getMedian(arr));
      System.out.println("Mode: " + getMode(arr));
      System.out.println("Min: " + getMin(arr));
      System.out.println("Max: " + getMax(arr));
    }

    scanner.close();
  }
}
