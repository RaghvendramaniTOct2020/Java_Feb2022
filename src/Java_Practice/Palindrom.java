package Java_Practice;

import java.util.Scanner;

public class Palindrom {
	
	void display(String st) {
		char ch1;
		char ch2;
		int count=1;
		int count2=0;
		for(int i=0;i<st.length()/2;i++) {
			ch1=st.charAt(i);
			ch2=st.charAt(st.length()-count);
			if(ch1==ch2) {
				count++;
			   count2++;
			}else
				break;
		}
		if(count2==st.length()/2) {
			System.out.println("Its palndrom");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		Palindrom p1=new Palindrom();
		p1.display(st);

	}

}
