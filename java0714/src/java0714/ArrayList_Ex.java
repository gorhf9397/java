package java0714;

import java.util.ArrayList;

public class ArrayList_Ex {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		// 값넣기 =>add() : 중복허용
		list.add("Hong");
		list.add("Super");
		list.add("bat");
		list.add("wonder");
		list.add("bad");
		
		// 크기 => size()
		System.out.println(list.size());
		
		System.out.println("---------------------");
		// 꺼내기 => get(Index)
		System.out.println(list.get(2));
		
		System.out.println("---------------------");
		// for문을 통해 배열의 길이 계산
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		// 값을 바꾸기 => set()
		list.set(1, "batwoman");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		// 찾기 indexOf <=> lastIndexOf()
		int n=list.indexOf("wonder");
		System.out.println(n);
		
		System.out.println("---------------------");
		// 지우기 => remove(index)
		list .remove(1);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		// 전부 지우기 => clear()
		list.clear();
		System.out.println(list.size());
		
		System.out.println("---------------------");
		// 비었는지 확인 => isEmpty()
		System.out.println(list.isEmpty());
		list.add("hahaha"); 
		System.out.println(list.isEmpty());
	}

}
