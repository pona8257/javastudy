package ex07_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void printList(List<Integer> list) {
		
		for(int i = 0; i < list.size(); i++) {
			if(i == list.size() - 1) {
				System.out.println(list.get(i));
			}else {
				System.out.print(list.get(i) + "->");
			}
			/*
			 	int lsatIndex = list.size() - 1;
			 
			 	for(int i = 0; i < lastIndex; i++) {
			 		System.out.print(list.get(i) + "->");
			 	}
			 	System.out.print(list.get(lastIndex));
			 */
		}
				
	}
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 2, 3, 1, 4);
		
		printList(list);
		
		Collections.sort(list); 	// 오름차순 정렬
		printList(list);
		
		int idx = Collections.binarySearch(list, 5);	// 이진 검색(반드시 정렬이 되어 있어야 한다.)
		System.out.println(idx);	// 인덱스값 반환
		if(idx > 0) {
			System.out.println("찾았다");
		} else {
			System.out.println("못찾았다");
		}
	}

}
