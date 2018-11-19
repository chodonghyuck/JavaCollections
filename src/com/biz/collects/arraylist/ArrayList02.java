package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList();
		
		intList.add(30);  // 0
		intList.add(40);  // 1
		intList.add(50);  // 2
		intList.add(60);  // 3
		intList.add(70);  // 4
		
		// intList의 3번째 데이터 60을 보고싶다.
        System.out.println(intList.get(3));                           // obj.set(값) : 저장 , setting
                                                                      // ? = obj.get() : 읽기
	                                                                  // obj.add(값) : 추가  
	    System.out.println(intList.get(2));
	    // int List의 2번쨰 데이터 (50) 을 100으로 바꾸고싶다.
        intList.set(2, 100);
	    System.out.println(intList.get(2));
	    
	    // intList의 개수가 몇개냐
	    int nSize = intList.size();
	    System.out.println("intList 개수 : " + nSize);
	    for(int i = 0 ; i < intList.size(); i++) {
	    	System.out.println(intList.get(i));
	    }
	    
	    nSize = intList.size();
	    for(int i = 0 ; i < nSize; i++) {
	    	System.out.println(i + ":" +intList.get(i));
	    	
	    }
	    System.out.println("======================================");
	    intList.remove(3);
	    nSize = intList.size();
	    for(int i = 0 ; i < nSize; i++) {
	    	System.out.println(i + ":" + intList.get(i));
	    	
	    }
	    System.out.println("======================================");
	    intList.add(2,900);
	    nSize = intList.size();
	    for(int i = 0 ; i < nSize; i++) {
	    	System.out.println(i + ":" + intList.get(i));
	    	
	    }
	    System.out.println("======================================");
	    intList.add(2,100);
	    intList.add(4,100);
	    intList.add(100);
	    
	    nSize = intList.size();
	    for(int i = 0 ; i < nSize; i++) {
	    	System.out.println(i + ":" + intList.get(i));
	    	
	    }
	    	    
	}    

}
