package dev.sch39.bootcamp.selfpractice.makesumdivisible;

import java.util.HashMap;

public class Main {
  public static int minSubarray(int[] nums, int p) {
    long totalSum = 0;
    for (int num : nums) {
      totalSum += num;
    }
    int remainder = (int) (totalSum % p);
    if (remainder == 0) {
      return 0;
    }

    HashMap<Integer, Integer> prefixMap = new HashMap<>();
    prefixMap.put(0, -1);

    int minLength = nums.length;
    long prefixSum = 0;

    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];

      int currentMod = (int) (prefixSum % p);

      int target = (currentMod - remainder + p) % p;

      if (prefixMap.containsKey(target)) {
        minLength = Math.min(minLength, i - prefixMap.get(target));
      }

      prefixMap.put(currentMod, i);
    }
    return minLength == nums.length ? -1 : minLength;
  }

  public static void main(String[] args) {
    int[] input1 = { 1, 2, 3 };
    int[] input2 = { 6, 3, 5, 2 };
    int[] input3 = { 3, 1, 4, 1 };
    System.out.println(minSubarray(input1, 3));
    System.out.println(minSubarray(input2, 9));
    System.out.println(minSubarray(input3, 6));
  }
}
