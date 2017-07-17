package cn.bitcit.polish;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//int[] preorder={1,2,4,7,3,5,6,8};
		//int[] inorder={4,7,2,1,5,3,8,6};
		int len=in.nextInt();
		int[] preorder=new int[len];
		int[] inorder=new int[len];
		
		for(int i=0;i<len;i++){
			preorder[i]=in.nextInt();
		}
		for(int i=0;i<len;i++){
			inorder[i]=in.nextInt();
		}
		in.close();
		BinaryTreeNode t=construct(preorder,inorder,len);
		System.out.println(t.value);
	}
	public static BinaryTreeNode construct(int[] preorder,int[] inorder,int len) throws Exception{
		if(preorder==null||inorder==null||len<=0){
			return null;
		}
		return constructCore(preorder,inorder,0,len-1,0,len-1);
	}
	
	
	public static BinaryTreeNode constructCore(int[] preorder,int[] inorder,int preStart,int preEnd,int inStart,int inEnd) throws Exception{
		int rootVal=preorder[preStart];
		BinaryTreeNode root=new BinaryTreeNode(rootVal);
		
		if(preStart==preEnd){
			if(inStart==inEnd&&preorder[preStart]==inorder[inStart]){
				return root;
			}else{
				throw new Exception("Invalid input");
			}
			
		}
		int rootin=inStart;
		while(rootin<=inEnd&&inorder[rootin]!=rootVal)
			rootin++;
		if(rootin>inEnd){
			throw new Exception("Invalid input");
		}
		int leftLen=rootin-inStart;
		if(leftLen>0){
			root.left=constructCore(preorder,inorder,preStart+1,preStart+leftLen,inStart,rootin-1);
		}
		if(leftLen<preEnd-preStart){
			root.right=constructCore(preorder,inorder,preStart+leftLen+1,preEnd,rootin+1,inEnd);
		}
		return root;
	}

}

class BinaryTreeNode{
	int value;
	BinaryTreeNode left,right;
	public BinaryTreeNode(int val){
		value=val;
	}
}
