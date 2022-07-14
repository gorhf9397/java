package java0714;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collection_list {

	public static void main(String[] args) {
		// Collection => list, set, map
		// list => 데이터의 중복이 허용, 순서가있다
		// Set => 데이터의 중복허용X , 순서없음
		// Map => 키값, 데이터값 : 키값은 중복이X
		
		// Array 리스트에는 모든 자료가 전부 들어올수있다
		// <> => 기본자료형은 사용X 전부 클래스만O
		ArrayList<String> list1=new ArrayList<String>();
		// String 자료를 하나씩 저장할 수 있는 공간이 생성
		list1.add("Hong");
		list1.add("Super");
		list1.add("bat");
		list1.add("Hong");// 중복가능
		
		System.out.println(list1.get(0)); // get(index)
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Hong");
		list2.add("Super");
		list2.add("bat");
		list2.add("Hong");
		
		System.out.println(list2.get(1));
		
		Vector<String> list3=new Vector<String>();
		
		list3.add("Hong");
		list3.add("Super");
		list3.add("bat");
		list3.add("Hong");
		
		System.out.println(list3.get(3));
		
		Stack<String> list4=new Stack<String>();
		
		list4.add("Hong");
		list4.add("Super");
		list4.add("bat");
		list4.add("Hong");
		
		System.out.println(list4.get(2));
		
		//List<String> ttt=new 위에 클래스의 생성자를 통해 객체 생성가능(ex : ArrayList, LinkedList, Vector, Stack)
	}

}
