package org.kil.lij;

import java.util.Scanner;

public class PracPag {
	public static void main(String[] args) {
Scanner rev=new Scanner(System.in);
System.out.println("enter the  values of number");
int n1=rev.nextInt();
int a,i=0,j=0;
a=n1;
while(a>0) {
	i=a%10;
	j=(j*10)+i;		
    a=a/10;
}
System.out.println("reverse number");
}
	
		Scanner rev=new Scanner(System.in);
		
		private void sysout() {
			// TODO Auto-generated method stub

		
		int n2=rev.nextInt();
		int a1,i1=0,j2=0;
		a1=n2;
		while(a1>0) {
			i1=a1%10;
			j2=(j2*10)+i1;		
		    a1=a1/10;
		}
		System.out.println("reverse number");
		}
}

