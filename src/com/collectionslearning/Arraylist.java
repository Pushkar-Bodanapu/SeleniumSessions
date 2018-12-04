package com.collectionslearning;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		//1. Can contain duplicate values
		//2. Maintain Insertion order
		//3. Not synchronized- So it is slow compared to other collections
		//4. It allows randow access to fetch other elements to store values on the basis of indexes
		
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add("test");
		ar.add(true);
		ar.add(34.3);
		System.out.println(ar.size());//size of array-5
		//System.out.println(ar.get(2));//30
		//To print all the elements from array- Use  1.foreach loop or 2.iterator
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		//Generics
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		//a.add("abdf");//This is not allowed as we have defined generics as Integer for arraylist
		
		//ArrayList<E> e = new ArrayList<E>();
		
	}
	

}
