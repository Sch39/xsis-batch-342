package dev.sch39.bootcamp.selfpractice.subtitutearrelement;

import java.util.Arrays;

public class Fix34 {
  public static int[] fix34(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 3) {
        for (int j = 0; j < nums.length; j++) {
          if (nums[j] == 4 && (j == 0
              || nums[j - 1] != 3)) {
            int tmp = nums[i + 1];
            nums[i + 1] = nums[j];
            nums[j] = tmp;
            break;
          }
        }
      }
    }

    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(fix34(new int[] { 1, 3, 1, 4 })));
    System.out.println(Arrays.toString(fix34(new int[] { 1, 3, 1, 4, 4, 3, 1 })));
    System.out.println(Arrays.toString(fix34(new int[] { 3, 2, 2, 4 })));
  }

}
