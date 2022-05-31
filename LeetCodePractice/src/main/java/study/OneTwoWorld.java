package study;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class OneTwoWorld {
	
	private static List<List<Integer>> groupsShared;
	
	public static void main(String[] args) {
		int target = 15;
		groupsShared = generateGroups(whichGroup(target));
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> singleResult = new ArrayList<>();
		splitNumber(target, whichGroup(target)-1, singleResult, result);
		
		System.out.println(target+"可以被拆分成：");
		result.forEach(System.out::println);

	}
	
	// target : 欲拆分的目標數字 
	// splitLimit 需要檢查的組別上限
	// singleResult 拿來存放單一拆分答案的List 
	// result 拿來存放所有符合的singleResult
	public static void splitNumber(int target, int splitLimit, List<Integer> singleResult, List<List<Integer>> result) {
		
		int nowSum = singleResult.stream().mapToInt(Integer::intValue).sum();
		if (nowSum == target) {
			List<Integer> deepCopyList = List.copyOf(singleResult);
			result.add(deepCopyList);
			return;
		}
		if (splitLimit-1<0) return;
		
		List<Integer> nowGroup = groupsShared.get(splitLimit-1);	
		for (int i = nowGroup.size()-1; i>=-1; i--) {
			if (i>=0) {
				singleResult.add(nowGroup.get(i));
			}else {
				singleResult.add(0);
			}
			splitNumber(target, splitLimit-1, singleResult, result);
			singleResult.remove(singleResult.size()-1);
		}
		return;
	}
	
	public static int whichGroup(int target) {
		int answer = -1; //傳入
		int power = 0;
		if (target==1) return 1;
		if (target==2) return 2;
		if (target==3) return 3;
		while(answer == -1) {
			if (target<= 3*Math.pow(2, power+1) && target> 3*Math.pow(2, power)) {
				answer = power + 4;
			}
			power++;
		}
		return answer;
	}
	
	public static List<List<Integer>> generateGroups(int groupNumber) {
		List<List<Integer>> groups  = new ArrayList<>();
		List<Integer> group1 = Arrays.asList(1);
		List<Integer> group2 = Arrays.asList(2);
		List<Integer> group3 = Arrays.asList(3);
		groups.add(group1);
		groups.add(group2);
		groups.add(group3);
		
		for (int i = 3; i < groupNumber; i++) {
			Integer groupUplimit = groups.stream()
									   .mapToInt(group -> group.stream().max(Integer::compare).get())
									   .sum();
			Integer groupLowLimit = groups.get(i-1).stream().max(Integer::compare).get();
//			System.out.println(groupUplimit);
//			System.out.println(groupLowLimit);
			List<Integer> newGroup = new ArrayList<Integer>();
			for (int j = groupLowLimit + 1; j <= groupUplimit; j++) {
				newGroup.add(j);
			}
			groups.add(newGroup);
		}
		
		return groups;
	}

}
