package com.lao.linkedList;

import java.util.LinkedList;

public class linkedListExample {

	public void linkedListOperation() {
		LinkedList <Integer> linkedList = new LinkedList <Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		
		System.out.println("Linked List :" +linkedList);
		
			//Add an Element to the First Position
	
		linkedList.addFirst(1);
		System.out.println("Linked list add first :" +linkedList);
		
		//Add element Last
		
		linkedList.addLast(5);
		System.out.println("Linked list add Last :"+linkedList);
		
		//Get first Value
		System.out.println("First value is :" +linkedList.getFirst());
		
		//Get value to Index Position
		System.out.println("First value by index Position is : "+linkedList.get(0));
		
		//Get third value
		System.out.println("First value by index Position is : "+linkedList.get(3));
		
		//Removing value
		System.out.println("Remove First :"+linkedList.removeFirst());
		System.out.println(linkedList);
		System.out.println("Remove Last :" + linkedList.removeLast());
		System.out.println(linkedList);
		
		//Poll method delete first element in LinkedList
		
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		
		//Poll method delete Last element in Linkedlist
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
		
		System.out.println("**************************************************");
	}
	
	public void iterateLinkedListsimplefor() {
		
		LinkedList <String> linkedList = new LinkedList <String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		//iteration
				System.out.println("Simple For Loop");
				
				for(int index =0; index < linkedList.size();index++) {
					System.out.println("Elememnts in LinkedList are: "+ linkedList.get(index));
				}
				System.out.println("**************************************************");
			

		
	}
	public void iterationewithAdvancedFor() {
		LinkedList <String> linkedList = new LinkedList <String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		System.out.println("for each");
		 for (String string : linkedList) {
			System.out.println("Elements in Linked list are :" +string);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linkedListExample nw = new linkedListExample();
		
		nw.linkedListOperation();
		
		linkedListExample Nw = new linkedListExample();
		Nw.iterateLinkedListsimplefor();
		
		linkedListExample Feach = new linkedListExample();
		Feach.iterationewithAdvancedFor();
	

	}

}
