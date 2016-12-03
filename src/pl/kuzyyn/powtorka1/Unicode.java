package pl.kuzyyn.powtorka1;

public class Unicode {

	public void printCharsFromUnicode(){
		char unicodeChar;
		for (int i=0;i<200;i++){
			unicodeChar = (char)(i);
			System.out.print("Binary: " + Integer.toBinaryString(i));
			System.out.print("\t char: "+unicodeChar);
			System.out.println("\t Unicode: " +(int)unicodeChar);
		}
	}
	
	public int BinToDecInt(String binary){
		int decimal=0;
		if (this.isBinary(binary)){
			decimal=this.convertBinToDec(binary);
			return decimal;
		}
		else{	
			System.out.println("Podany ci¹g znaków nie jest liczb¹ binarn¹");
			return 0;
		}
		
		
	}
	private boolean isBinary(String binary){
		boolean isBinary=false;
		for (int i=0;i<binary.length();i++){
			if (binary.charAt(i)=='0' || binary.charAt(i)=='1' ){
				isBinary=true;
			}else {
				isBinary=false;
				break;
			}		
		}
		return isBinary;
	}
	private int convertBinToDec(String binary){
		int length=binary.length();
		int decimal=0,single,power=0;
		
		for (int i=length-1;i>=0;i--){
			single = binary.charAt(i)-48;
			System.out.println("single is "+single + ". Power is "+power);
			if (power==0){
				decimal+=single;
				power++;
			}else{
			single=single*2;	
			decimal+=(int)Math.pow(single, power);
			power++;
			}
		}
		System.out.println(decimal);
		return decimal;
		}
	
	public void  testChar(){
		char a = '9';
		int b = a-'0';
		System.out.print(a+ " "+ b);
	}
}
