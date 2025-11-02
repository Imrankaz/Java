package BasicsOfJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Class29_ArrayList_ForEach_Iterator_size_add_addAll_remove_removeAll_clear_isEmpty_contains_indexOf_set_get_equals_Sort_Assending_dessending_clear_isEmpty_contains_indexOf_set_get_equals_Sort_Assending_dessending  {
	private static Scanner input;
	public static void main(String[] args)
	{
		System.out.println("ArrayList_ForEach_Iterator_size_add_addAll_remove_removeAll_clear_isEmpty_contains_indexOf_set_get_equals");
		System.out.println("using Switch Case");
		input = new Scanner(System.in);
		
		int n;
		System.out.println("input an int digit from (0 to 12):");
		
		n = input.nextInt();
		
		switch(n) {
				
				case 0:
					System.out.println("zero");
					System.out.println("Array List");
					
					ArrayList<Integer> name = new ArrayList<Integer>();
					
					System.out.println("Size: "+name.size());
					
					name.add(10);   //index 0, value 10
					name.add(20);   //index 1, value 20
					name.add(30);   //index 2, value 30
					name.add(3,40); //index 3, value 40
					
					System.out.println(name); // will print the arraylist
					
					System.out.println("Size: "+name.size());
					
					
					break;
	
					
					
					
				case 1:	
					System.out.println("one");
					System.out.println("Array List");
					
					//**********************//
					ArrayList<Integer> name1 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name1.size());
					
					name1.add(10);   //index 0, value 10
									 // here index 1 added(Pushed) from last line;
					name1.add(20);   //index 2, value 20
					name1.add(30);   //index 3, value 30
					name1.add(1,40); //index 1, value 40
					
					//**********************//
					System.out.println(name1);  //if we use "ArrayList", then only 'array name' can print the 'full array';
					
					System.out.println("Size: "+name1.size());	
					
					break;
					
					
					
					
				case 2:
					System.out.println("two");
					System.out.println("For Each Loop");
					
					ArrayList<Integer> name2 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name2.size());
					
					name2.add(10);   //index 0, value 10
					name2.add(20);   //index 1, value 10
					name2.add(30);   //index 2, value 10
					name2.add(3,40); //index 3, value 10
					
					//**********************//
					for(Integer x: name2)
					{
						System.out.print(x+" ");
					}
					System.out.println();

					System.out.println("Size: "+name2.size());
					
					break;
					
					
					
				case 3:
					System.out.println("three");
					
					System.out.println("For Each Loop");
					
					ArrayList<Integer> name3 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name3.size());
					
					name3.add(10);   //index 0, value 10
					name3.add(20);   //index 1, value 10
					name3.add(30);   //index 2, value 10
					name3.add(3,40); //index 3, value 10
					
					//**********************//
					for(int x: name3)
					{
						System.out.println(x);
					}
					
					System.out.println("Size: "+name3.size());
					
					break;
					
					
					
				case 4:
					System.out.println("four");	
					
					
					System.out.println("Iterator");
					
					ArrayList<Integer> name4 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name4.size());
					
					name4.add(10);   //index 0, value 10
					name4.add(20);   //index 1, value 10
					name4.add(30);   //index 2, value 10
					name4.add(3,40); //index 3, value 10
					
					//**********************//
					Iterator<Integer> itr = name4.iterator();				
					
					//**********************//
					while(itr.hasNext())
					{
						System.out.print(itr.next()+" ");
						
					}
					System.out.println();
					
					System.out.println("Size: "+name4.size());
					
					
					break;
					
					
					
				case 5:
					System.out.println("five");	
					System.out.println("Removing index & value from array");
					
					ArrayList<Integer> name5 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name5.size());
					
					name5.add(10);   //index 0, value 10
					name5.add(20);   //index 1, value 10
					name5.add(30);   //index 2, value 10
					name5.add(3,40); //index 3, value 10
					
					
					System.out.println(name5);
					System.out.println("Size: "+name5.size());
					
					//**********************//
					name5.remove(2);
					name5.remove(1);
					//name5.remove(3);
					System.out.println(name5);
					System.out.println("Size: "+name5.size());
					
					break;
					
					
					
					
					
				case 6:
					System.out.println("six");	
					System.out.println("Removng all index & value from array:==>  name8.removeAll(name8);");
					
					ArrayList<Integer> name8 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name8.size());
					
					name8.add(10);   //index 0, value 10
					name8.add(20);   //index 1, value 10
					name8.add(30);   //index 2, value 10
					name8.add(3,40); //index 3, value 10
					
					
					System.out.println(name8);
					System.out.println("Size: "+name8.size());
					
					
					name8.remove(2);
					//name8.remove(1);
					System.out.println(name8);
					System.out.println("Size: "+name8.size());
					
					//**********************//
					System.out.println("name8.removeAll(name8) : ");
					name8.removeAll(name8);
		
					System.out.println(name8);
					System.out.println("Size: "+name8.size());
					

					
					break;
					
					
					
					
				case 7:
					System.out.println("seven");
					
					System.out.println("Clear the value from array:  name6.clear();  :");
					
					ArrayList<Integer> name6 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name6.size());
					
					name6.add(10);   //index 0, value 10
					name6.add(20);   //index 1, value 10
					name6.add(30);   //index 2, value 10
					name6.add(3,40); //index 3, value 10
					
					
					System.out.println(name6);
					System.out.println("Size: "+name6.size());
					
					//**********************//
					System.out.println("name6.clear() : ");
					name6.clear(); 				//name8.removeAll(name8); remove all and clear() works same;
					System.out.println(name6);
					System.out.println("Size: "+name6.size());

					
					break;
					
					
					
				case 8:
					System.out.println("eight");	

					System.out.println("isEmpty();    contains(30)    indexOf(40)     set(2,22)    get(0)");
					System.out.println("name7.isEmpty();	 name7.contains(30);	name7.indexOf(40);	name7.set(2,22);	name7.get(0);");
					
					ArrayList<Integer> name7 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name7.size());
					
					name7.add(10);   //index 0, value 10
					name7.add(20);   //index 1, value 10
					name7.add(30);   //index 2, value 10
					name7.add(3,40); //index 3, value 10
					
					
					System.out.println(name7);
					System.out.println("Size: "+name7.size());
					
					//**********************//
					Boolean check_empty = name7.isEmpty();
					
					System.out.println("Array is empty: " +check_empty);
					
					
					//**********************//
					boolean contains = name7.contains(30);
					System.out.println("is this Arry contains 30 !!!??? : "+contains);
					
					
					//**********************//
					int index_num = name7.indexOf(40);
					System.out.println("index of this array value 40 is : "+index_num);
					
					//**********************//
					name7.set(2,22);      // array.set(index,value) // replace the value of index 2;
					System.out.println("name7.set(2,22); \nafter replacing the index 2 value by 22 from 30, array is : "+name7);
					
					
					//**********************//
					int x= name7.get(0);
					System.out.println("value in index 0 is: "+x);
	
					break;
					
					
					
					
					
				case 9:
					System.out.println("nine");	
					
					System.out.println("nameC.addAll(nameA);	nameC.equals(nameA);");
					
					ArrayList<Integer> nameA = new ArrayList<Integer>();
					ArrayList<Integer> nameB = new ArrayList<Integer>();
					ArrayList<Integer> nameC = new ArrayList<Integer>();
					
					System.out.println("Size: "+nameA.size());
					
					nameA.add(10);   //index 0, value 10
					nameA.add(20);   //index 1, value 10
					nameA.add(30);   //index 2, value 10
					nameA.add(3,40); //index 3, value 10
					
					
					System.out.println("nameA: "+nameA);
					System.out.println("nameA Size: "+nameA.size());
					
					nameB.add(1);   //index 0, value 10
					nameB.add(2);   //index 1, value 10
					nameB.add(3);   //index 2, value 10
					nameB.add(4); //index 3, value 10
					
					System.out.println("nameB: "+nameB);
					System.out.println("nameB Size: "+nameB.size());
					
					
					nameC.addAll(nameA);
					System.out.println("nameC: "+nameC);
					System.out.println("nameC Size: "+nameC.size());
					
					
					boolean result = nameC.equals(nameA);
					System.out.println("nameC == nameA :  "+result);
					
					result = nameC.equals(nameB);
					System.out.println("nameC == nameB :  "+result);
					
					break;
					
				case 10:
					System.out.println("Ten");	
					System.out.println("Sorting-Array- Assending or Desinding");
				    System.out.println("Arrays.sort(C); ");
	               	 
                	int[] C = {10,30,-100,-3,500,1,6,-40,1000,90};
               	 
                	//**********************//
                	Arrays.sort(C); 
               	 
                	System.out.println("Assending result is :  ");
                	for(int i=0;i<10;i++)
                	{
                    	System.out.println(" "+C[i]);
                	}
                	System.out.println();
                	System.out.println("Dessending result is :  ");
                	for(int i=9;i>=0;i--)
                	{
                    	System.out.println(" "+C[i]);
                	}
               	 
                	System.out.println("\n*******************\n");
					break;
					
					
				case 11:
					System.out.println("nine");	
					
					System.out.println("Sorting-ArrayList- Assending or Desinding (part1) ");
				
					ArrayList<Integer> name9 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name9.size());
					
					name9.add(30);   //index 0, value 10
					name9.add(-40);   //index 1, value 10
					name9.add(10);   //index 2, value 10
					name9.add(3,40); //index 3, value 10
					
					
					System.out.println(name9);
					System.out.println("Size: "+name9.size());
					
					//**********************//
					name9.sort(null);
					System.out.println("After Sorting Assending resut is: "+name9);
					
				
					

					
					break;
				case 12:
					System.out.println("Twelve");
					System.out.println("Sorting-ArrayList- Assending or Desinding (part2) ");
					System.out.println("Collections.sort(name10);     Collections.sort(name10, Collections.reverseOrder());");
					
					ArrayList<Integer> name10 = new ArrayList<Integer>();
					
					System.out.println("Size: "+name10.size());
					
					name10.add(30);   //index 0, value 10
					name10.add(-40);   //index 1, value 10
					name10.add(10);   //index 2, value 10
					name10.add(3,40); //index 3, value 10
					
					
					System.out.println("name10 : "+name10);
					System.out.println("Size: "+name10.size());
					
					//**********************//
					Collections.sort(name10);
					System.out.println("After Sorting Assending resut is: "+name10);
					
					//**********************//
					Collections.sort(name10, Collections.reverseOrder());
					System.out.println("After Sorting Dessending resut is: "+name10);
					
					
					break;
					
					
					
				case 13:
					System.out.println("Thirteen");	
					break;
					
				default: 		//works like else;
					System.out.println("not a digit");		
		
		
		
		}
		
		
		
	}

}



