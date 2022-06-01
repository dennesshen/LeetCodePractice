package study;

import java.util.ArrayList;
import java.util.List;

public class StackLike {
	
	public static void main(String[] args) {
		StackLike stackLike = new StackLike();
		stackLike.push(1);
		stackLike.push(2);
		stackLike.push(3);
		stackLike.push(4);
		stackLike.push(5);
		stackLike.print();
		System.out.println(stackLike.pop());
		stackLike.print();
		System.out.println(stackLike.top());
		System.out.println(stackLike.getMin());
		
	}
	
	private List<Integer> list = new ArrayList<Integer>();
	
	public void push(int x) {
		list.add(x);
	}
	
	public int pop() {
		int answer = list.get(list.size()-1);
		list.remove(list.size()-1);
		return answer;
	}
	public int top() {
		return  list.get(list.size()-1);
	}
	
	public int getMin() {
		return list.stream().mapToInt(Integer::intValue).min().getAsInt();
	}
	
	public void print() {
		System.out.println(list);
	}
	
	

}
