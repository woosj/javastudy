package javaDay22;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class TreeMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("��ȭ", "�����޺� ŰŰ");
		map.put("ȣ��", "������Ʈ�̺�");
		map.put("��ȭ", "Ȳȥ���� ��������");
		map.put("TV", "��Ÿ�� û��");
		map.put("��", "��Ÿ�� û��");
		map.put("a", "��Ÿ�� û��");
		
		Map<String, String> subMap = map.subMap("TV", "��ȭ");
		System.out.println(subMap);
		/*
		 * TreeMap Ŭ������ ��Ʈ�� ���·� �ڷḦ �߰���
		 * TreeMap Ŭ������ SortedMap<k,v> subMap(K fromKey, K toKey) �޼���
		 * ���� fromKey(�̰��� �����Ѵ�) ~ toKey(�̰��� �������� �ʴ´�)�� Ű ������ ������ �κ��� �並 ������
		 */
		System.out.println(map.toString());
	}

}
