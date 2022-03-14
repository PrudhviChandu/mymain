package com.te.arrays;

public class Duplicate {
public static void main(String[] args) {
	int a[]= {1 ,2,2,2,3,3,5,3,4,4};
	for(int j=0;j<=a.length-1;j++) {
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==a[j]&&i!=j) {
				count++;
				a[i]='\n';
			}
		}
			if(a[j
			     
			     ]!='\n'&&count>0) {
System.out.println(a[j]+"");				
			}
		}
	}
}

