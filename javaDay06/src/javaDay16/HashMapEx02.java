package javaDay16;

import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("ȫ�浿1", new Integer(30));
		map.put("ȫ�浿2", new Integer(30));
		map.put("ȫ�浿3", new Integer(50));
		map.put("ȫ�浿4", new Integer(60));
		map.put("ȫ�浿5", new Integer(70));
		
		/*
		 * Ű�� ���� Set���·� ����
		 * (HashMap�� �̿��ؼ� key�� value�� �����ֱ����ؼ�) ��ü�� �̿���
		 * Map.Entry �������̽� �̿�
		 * Map.entrySet �޼���� Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��� �並 ��ȯ��
		 * �� ��Ʈ���� ������ ����ϴ� ������ ����� ���÷��� ���� �ݺ��ڸ� �̿��Ͽ� ����� (Iterator)
		 * 
		 */
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()){
			Map.Entry<String, Integer> e = it1.next();
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
		
		Set set2 = map.keySet();	//Ű�� set�� ������
		System.out.println("���� ������ ���:" + set2);
		System.out.println(map.values());
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		
		while(it2.hasNext()){
			Integer i = it2.next();
			sum +=i;
		}
		
		System.out.println("�հ�" + sum);
		System.out.println("���" + (float)sum/set2.size());
		
		System.out.println("�ְ�����" + Collections.max(v));
		System.out.println("��������" + Collections.min(v));
		
		
	}

}
