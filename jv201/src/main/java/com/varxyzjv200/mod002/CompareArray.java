package com.varxyzjv200.mod002;

public class CompareArray {
	public static boolean equals(int[] nums, int[] target) {
		if(nums.length != target.length) {
			return false;
		}
		for(int i=0; i < (nums.length); i++) {
			if(nums[i] != target[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {10,20,30,40,50};
		int[] target = new int[] {10,20,30,40,90};
//		System.out.print(nums.equals(target));
		if(equals(nums, target)) {
			System.out.println("nums, target 은 구성이 같은 배열입니다.");
		}else {
			System.out.println("nums, target 은 구성이 같지 않습니다.");
		}
	}
	
}
