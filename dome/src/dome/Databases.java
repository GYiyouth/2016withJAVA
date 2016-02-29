package dome;

import java.util.ArrayList;

public class Databases {
	private ArrayList<CD> cdList = new ArrayList<CD>();
	public void addCD ( CD cd ){
		cdList.add(cd);
	}
	public void list(){
		for( CD cd: cdList)
		cd.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Databases db = new Databases();
		db.addCD( new CD("七里香	" , "周杰伦" , 1 , 0 , " " ));
		db.addCD( new CD("晴天" , "周杰伦" , 1 , 0 , " " ));
		db.list();
	}

}
