
public class BiTree {
	private int data;
	private String key = null;
//	private int num;
	public BiTree LNode = null ;
	public BiTree RNode = null ;
	
	public BiTree(int data){ // ���캯�� 1
		this.data = data;
	}
	
	public BiTree(int data, String key){ // ���캯�� 2
		this.data = data;
		this.key = key;
	}
	
	public BiTree (String key){ // ���캯��3
		this.key = key;
	}
	
	public boolean link( BiTree dad, BiTree son, String drct){ // �ڵ�����
		drct = drct.trim().toLowerCase();
		switch( drct ){
			case "left": {
				if (dad.LNode == null ){
					dad.LNode = son;
					System.out.println("��������ڵ�");
					return true;
				}
				break;
			} // Left Child
			case "right": {
				if (dad.RNode == null){
					dad.RNode = son;
					System.out.println("�������ҽڵ�");
					return true;
				}
				break;
			} // Right Child
			default : {
				System.out.println("�������󣬲���ʧ��");
				return false;
			}
		} // switch
		return false;
	}  // link 
	
	public BiTree clear(BiTree node){ // ���һ���ڵ�
		BiTree ret = node;
		node = null;
		return ret;
	}
	
	public void printNode( BiTree node ){ // ��ӡһ���ڵ������
		if(node.data != (Integer)null)
			System.out.println("�ýڵ��data������  " + node.data);
		if(node.key != null)
			System.out.println("�ýڵ��key������  " + node.key);
		if(node.data == (Integer)null && node.key == null)
			System.out.println("����һ���սڵ㣬�����κ�����");
	}
	
	public BiTree getLChild(BiTree node){ // �õ���ڵ�
		return node.LNode;
	}
	
	public BiTree getRChild(BiTree node){ // �õ��ҽڵ�
		return node.RNode;
	}
	
	public boolean isExist(BiTree node){ // �б� ����
		if( node != null )
			return true;
		else
			return false;
	}
	// �������ܽڵ���
	public int getNum(BiTree root){ // ����rootΪ�������ڵ���
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
	// ��dataΪx�Ľڵ���
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
	// ��key Ϊָ���ַ����Ľڵ���
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
