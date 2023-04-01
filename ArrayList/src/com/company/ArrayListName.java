package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListName {


    public static void main(String[] args) {
	// write your code here
                String[] arg ={"My" ,"Name" ,"Is","Jod" ,"Ok" ,"Chala ja bsdk"};
        /* ---->  alist.add(element) :- add the particular element at the last
          -----> alist.add(index ,element) :- add the element at the particular index and push other elements forward
          ----->  alist.remove(index):- it removes the element at the particular index and also return the removed element
                    that has to be stored in the reference variable of the Object class
         ----->  alist.set(index,element) :-it replace the element at the particular index and also return the
                    replaced element and that element has to be stored in the reference variable of the Object class
         -----> alist.get(index) :- it returns the element of that index to be returned and that element has to be stored
                in the Object reference variable
         -----> namesList1.addAll(namesList2):- add the arraylist2 to arraylist1 at the last
         ------> namesList1.addAll (2, namesList2):- add the arraylist2 at the particular index
         ------> namesList1.removeAll(namesList2):- it remove the all common element of the  arraylist2  from arrayList1
         ------>	Iterator itr = namesList.iterator() ;
                    namesList.iterator():it is used to iterate over element of the list
        --------> itr.hasNext() :-	This method returns true if and only if this scanner has another token
                   matching the specified pattern.
        -----> aslist.size():- it return the size of the arraylist
                    */
                /*List is an interface*/
                List aList = new ArrayList<>(arg.length);
                for (String argument : arg) {
                    aList.add(argument);
                }
                System.out.println("aList = " + aList);
                System.out.println("aList.size() = " + aList.size());
                Object removedElement = aList.remove(3);
                System.out.println("removedElement = " + removedElement);
                System.out.println("aList = " + aList);
                Object replacedElement = aList.set(0, "Steve Jobs");
        System.out.println(replacedElement);
                System.out.println("aList = " + aList);
                aList.add(0, "Bill Gates");
                System.out.println("aList = " + aList);
                Object variable = aList.get(2);
                int var = (int)variable;
                System.out.println(variable);
            }
        }

