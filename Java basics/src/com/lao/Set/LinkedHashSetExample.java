package com.lao.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	/**
	 * LinkedHashSet->Child class of HashSet
	 * DS-> Hash table + Linked List
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */

	public void linkedHashSetExample(){
		@SuppressWarnings("rawtypes")
		LinkedHashSet<Comparable> linkedHashSet = new LinkedHashSet<Comparable>();
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");
		linkedHashSet.remove("10");
		System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
		System.out.println("Size: "+linkedHashSet.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample example = new LinkedHashSetExample();
		example.linkedHashSetExample();
	}

}
