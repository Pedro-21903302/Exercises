package DailyCoding;

public class solve27_8_21 {

	
	
	public static class Node {
		Node left,right;
		String key;
		
		Node(String x)
		{
			this.key = x;
			left = right = null;
		}
	}
	
	
	public static void again(Node current,String[] cleanString,int pos,String currentString)
	{
		if(cleanString[pos] == "right")
		{
			currentString += ".right";
			Node newNode = new Node(currentString);
			current.right =  newNode;
			again(current.right,cleanString,pos+1,currentString);
		}
		else if(cleanString[pos] == "left")
		{
			currentString += ".left";
			Node newNode = new Node(currentString);
			current.left =  newNode;
			again(current.left,cleanString,pos+1,currentString);
		}
		
	}
	
	
	public static Node deserialize(String s)
	{
		String[] cleanString = s.split("\\.");
		Node root = new Node("Node");
		again(root,cleanString,1,"");
		return root;
	}
	
	
	
	public static void main(String[] args)
	{
		Node root = deserialize("left.left.left.left");
		System.out.println(root.left.key);
	}
	
	
}
