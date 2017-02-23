package javaDay15.Collection;

import java.util.*;
import static java.lang.System.out;

class AData {
	int x, y;
	
	public AData(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		
	}
	public void disp(){
		out.println("x=" + x + ",y = " + y);
	}
}

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AData ap = new AData(10,20);
		AData bp = new AData(20,30);
		AData cp = new AData(30,40);
		
		HashSet hs = new HashSet();
		
		hs.add(ap);
		hs.add(bp);
		hs.add(cp);
		
		out.println("해시코드:" + hs.hashCode());
		out.println("사이즈:" + hs.size());
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			((AData)it.next()).disp();
		}
		System.out.println();
		
	}

}
