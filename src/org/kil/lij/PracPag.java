package org.kil.lij;

import java.util.Scanner;

public class PracPag {
	public static void main(String[] args) {
		

@SuppressWarnings("resource")
Scanner rev=new Scanner(System.in);
System.out.println("enter the num");
int n1=rev.nextInt();
int a,i=0,j=0;
a=n1;
while(a>0) {
	i=a%10;
	j=(j*10)+i;		
    a=a/10;
}
System.out.println("reverse num");
}

}

