package Java_Practice;

import java.util.Scanner;

public class FindMaxRepeatingWord {
	void findMaxWord(String Words) {
		int count=0;
		int MaxCount=0;
		int MaxIndex=0;
		String[] arr=Words.split(" ");
		for(int i=0;i<arr.length;i++) {
			String firstWord=arr[i];
			if(Words.contains(firstWord)) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].equalsIgnoreCase(arr[j])) {
						count++;
					}
					if(count>MaxCount) {
						MaxCount=count;
						MaxIndex=i;
					}
					Words=Words.replaceAll(firstWord, "");
				}
			}
		}
		System.out.println("Max Repeating words is "+arr[MaxIndex]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter words sepearted by space: ");
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();
		FindMaxRepeatingWord findMaxRepeatingWord=new FindMaxRepeatingWord();
		findMaxRepeatingWord.findMaxWord(words);
	}

}
