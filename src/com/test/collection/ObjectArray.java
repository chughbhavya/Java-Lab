package com.test.collection;

import java.util.*;
public class ObjectArray {
	public static void main(String[] args){
		Profile p1 = new Profile();
		p1.makeProfile(26, "Bhavya", "Student");
		Profile p3 = new Profile();
		p3.makeProfile(31,"Milind", "Engineer");
		
		
		ArrayList<Profile> a = new ArrayList<Profile>();
		a.add(p1);
		a.add(p3);
		
		Iterator i = a.iterator();
		
		while(i.hasNext()){
			Profile p2 = (Profile)i.next();
			System.out.println(p2.age+p2.name+p2.occupation);
		}
	}

}
