package study.BinaryTreePaths_257;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	
	private List<String> resultLists = new ArrayList<>();
	
	public List<String> binaryTreePaths(TreeNode root){
		
		String singleResult = "";
		getValue(singleResult, root);
		
		return resultLists;
	}
	
	private void getValue(String singleResult,TreeNode root) {
		
		singleResult = singleResult + "->" + root.val;
		
		TreeNode nextRight = root.right;
		TreeNode nextLeft = root.left;
		
		if (nextRight != null) {
			getValue(singleResult, nextRight);
		}
		
		if (nextLeft != null) {
			getValue(singleResult, nextLeft);
		}
		
		if ( nextRight == null && nextLeft == null) {
			singleResult = singleResult.substring(2, singleResult.length());
			resultLists.add(singleResult);
		}

	}
	
	
}
