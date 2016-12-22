package com.test.bhavya;
public class factorial {
	public static void main(String args[]){
		int i;
		int n = Integer.parseInt(args[0]);
		int fac = 1;
		for(i = 1; i <= n; i ++){
			fac = fac * i;
//			System.out.println(fac);
		}
		System.out.println(fac);
	}

}
