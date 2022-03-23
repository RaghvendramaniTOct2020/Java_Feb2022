package Java_Practice;

public class ReverseString {
	
	public void reverseDisplay(String st) {
		String rev="";
		System.out.println("Reverse String is: " );
		for(int i=st.length()-1;i>=0;i--) {
			rev+=st.charAt(i);
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reverse=new ReverseString();
		reverse.reverseDisplay("Raman");
		

	}

}
