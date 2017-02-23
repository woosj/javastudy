package javaDay22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class SungImpl2 implements Sung2 {
	
	private Map<String,Sung2VO> map;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public SungImpl2() {
		// TODO Auto-generated constructor stub
		map = new TreeMap<String, Sung2VO>();
		//map = new HashMap<String, Sung2VO>();
	}
	
	@Override
	public int insert() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("\n�й� : ");
		hak = br.readLine();
		
		if(map.containsKey(hak)){
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}
		
		Sung2VO ob = new Sung2VO();
		ob.setHak(hak);
		
		System.out.print("�̸� :");
		ob.setName(br.readLine());
		
		System.out.print("�������� :");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("��������:");
		ob.setEng(Integer.parseInt(br.readLine()));
		
		System.out.print("�������� :");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);
		
		return 1;
	}

	@Override
	public int update() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("\n������ �й� : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return 0;
		}
		
		Sung2VO ob = new Sung2VO();
		ob.setHak(hak);
		
		System.out.print("�̸� :");
		ob.setName(br.readLine());
		
		System.out.print("�������� :");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("��������:");
		ob.setEng(Integer.parseInt(br.readLine()));
		
		System.out.print("�������� :");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);
		
		return 1;
	}

	@Override
	public void search() throws IOException {
		// TODO Auto-generated method stub
		//�й����� �˻���
		String hak;
		System.out.print("\n�˻� �� �й� : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("�������� �ʴ� �й��Դϴ�.");
		}
		
		/*Sung2VO info = map.get(hak);
		System.out.println(info.toString());
		*/
		
		System.out.println(map.get(hak).toString());
		
		/*//�̸����� �˻���
		String name;
		System.out.print("\n�˻� �� �̸� : ");
		name = br.readLine();
		
		//Ű���� �迭�� ������
		Set<String> keys = map.keySet();
		//�迭�� Ű���� �ϳ��� �����´�.
		for(String key : keys){
			//������ Ű������ ��ü�� �ҷ��� �����Ѵ�.
			Sung2VO ob = map.get(key);
			//�̸��� ���Ͽ� ������ ���� ���
			if(ob.getName().equals(name)){
				System.out.println(ob.toString());
			}
			
		}
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			Sung2VO data = map.get(key);
			if(data.getName().equals(name)){
				System.out.println(data.toString());
			}
		}*/
		
	}

	@Override
	public int delete() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("\n������ �й� : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return 0;
		}
		
		map.remove(hak);		
		System.out.println("�ڷ���� �Ϸ�....");
		
		return 1;
	}

	//��ü���(�й���)
	@Override
	public void writeAll() {
		// TODO Auto-generated method stub
		
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		
		System.out.println("\n ��ü��� ");
		
		while(it.hasNext()){
			String key = it.next();
			Sung2VO data = map.get(key);
			System.out.println(data.toString());
			
		}

	}
	
	//��ü���(����)
	@Override
	public void writeSort() {
		// TODO Auto-generated method stub
		List<Sung2VO> lists = new ArrayList<Sung2VO>();
		Set<String> set = map.keySet();
		Iterator<String> it1 = set.iterator();
		
		while(it1.hasNext()){
			String key = it1.next();
			lists.add(map.get(key));
		}
		//�������� ����
		Collections.sort(lists, new MyComparator<Sung2VO>());
		//�������� ����
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<Sung2VO>()));
		System.out.println("\n �հ������ ���");
		
		Iterator<Sung2VO> it2 = lists.iterator();
		
		while(it2.hasNext()){
			Sung2VO data = it2.next();
			System.out.println(data.toString());
		}
	}

}

class MyComparator<T> implements Comparator<T>{
		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			Sung2VO s1 = (Sung2VO)o1;
			Sung2VO s2 = (Sung2VO)o2;
			
			int n = s1.getTot() - s2.getTot();
			if(n > 1){
				return 1;
			}else{
				return -1;
			}
		}
		
}