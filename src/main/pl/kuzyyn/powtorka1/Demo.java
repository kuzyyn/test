package main.pl.kuzyyn.powtorka1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Demo {
	public static void nicNieRob(){
		System.out.print("Nicnierobie");
	}
	public static void main(String[] args) {
		int decimal = 44;
		String binary;
		String catsName = "figa";
		Calculations calculation = new Calculations();
		//Unicode unicode = new Unicode();
		//unicode.printCharsFromUnicode();
		System.out.println(Integer.toBinaryString(decimal));
		decimal>>>=2;
		System.out.println(decimal);
		System.out.println(Integer.toBinaryString(decimal));
		
		//RegExpressions regs = new RegExpressions();
	//	regs.checkRegex();
		
	//	InputOutput io = new InputOutput();
	//	io.readFromUserInput();
	
		
		Switch st = new Switch();
		st.dayChosen(Days.tue);
		System.out.println("dalszy kod");
		
		Kolekcje kolekcja = new Kolekcje();
		kolekcja.dajPsiaKolekcje();
		int a = 5;
		int b = 6;
		System.out.println("aaaa "+a+b+" dfsadf ");
		nicNieRob();
		
		
}		
}
