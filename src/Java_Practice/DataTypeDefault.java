package Java_Practice;

class DataTypeDefault{

	String st;
	boolean b;
	int i;
	byte b1;
	double d;
	long l;
	short s;
	char ch;
	float f;
	boolean boo;
	
	void displayDefaultValues(){
		System.out.println("String "+st);
		System.out.println("boolean " +b);
		System.out.println("Integer " +i);
		System.out.println("Byte " +b1);
		System.out.println("Long " +l);
		System.out.println("Short " +s);
		System.out.println("Character "+ch+"ch");
		System.out.println("Float " +f);
		System.out.println("Boolen " +boo);
		System.out.println("Double " +d);
	}

	public static void main(String[] args){
		DataTypeDefault d1=new DataTypeDefault();
		d1.displayDefaultValues();
	}
}