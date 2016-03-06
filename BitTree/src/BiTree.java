
public class BiTree {
	private int data;
	private String key = null;
//	private int num;
	public BiTree LNode = null ;
	public BiTree RNode = null ;
	
	public BiTree(int data){ // 构造函数 1
		this.data = data;
	}
	
	public BiTree(int data, String key){ // 构造函数 2
		this.data = data;
		this.key = key;
	}
	
	public BiTree (String key){ // 构造函数3
		this.key = key;
	}
	
	public boolean link( BiTree dad, BiTree son, String drct){ // 节点连接
		drct = drct.trim().toLowerCase();
		switch( drct ){
			case "left": {
				if (dad.LNode == null ){
					dad.LNode = son;
					System.out.println("插入至左节点");
					return true;
				}
				break;
			} // Left Child
			case "right": {
				if (dad.RNode == null){
					dad.RNode = son;
					System.out.println("插入至右节点");
					return true;
				}
				break;
			} // Right Child
			default : {
				System.out.println("输入有误，插入失败");
				return false;
			}
		} // switch
		return false;
	}  // link 
	
	public BiTree clear(BiTree node){ // 清空一个节点
		BiTree ret = node;
		node = null;
		return ret;
	}
	
	public void printNode( BiTree node ){ // 打印一个节点的数据
		if(node.data != (Integer)null)
			System.out.println("该节点的data数据是  " + node.data);
		if(node.key != null)
			System.out.println("该节点的key数据是  " + node.key);
		if(node.data == (Integer)null && node.key == null)
			System.out.println("这是一个空节点，不含任何数据");
	}
	
	public BiTree getLChild(BiTree node){ // 得到左节点
		return node.LNode;
	}
	
	public BiTree getRChild(BiTree node){ // 得到右节点
		return node.RNode;
	}
	
	public boolean isExist(BiTree node){ // 判别 存在
		if( node != null )
			return true;
		else
			return false;
	}
	// 求树的总节点数
	public int getNum(BiTree root){ // 求以root为根的树节点数
		return getnum( root, 0);
	}
	private int getnum(BiTree root, int num){ 
		if(isExist(root)){
			num++;
			num+=getnum(root.LNode, num);
			num+=getnum(root.RNode,num);
			return num;
		}
		return num;			
	}
	// 求data为x的节点数
	public int getNum(BiTree root, int x){
		return getnum(root, 0, x);
	}
	private int getnum(BiTree root, int num, int value){ 
		if(isExist(root) && root.data == value){
			num++;
			num+=getnum(root.LNode, num, value);
			num+=getnum(root.RNode,num, value);
			return num;
		}
		return num;			
	}
	// 求key 为指定字符串的节点数
	public int getNum(BiTree root, String x){
		return getnum(root, 0, x);
	}
	private int getnum(BiTree root, int num, String key){ 
		if(isExist(root) && root.equals(key)){
			num++;
			num+=getnum(root.LNode, num, key);
			num+=getnum(root.RNode,num, key);
			return num;
		}
		return num;			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello", a = s;
		if(a==s)
			System.out.println(1);
		else
			System.out.println(2);
		String b = "hello";
		switch(b){
		case "hell": System.out.println(1);break;
		default : System.out.println(2);break;
		}

	}

}
