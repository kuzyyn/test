package main.pl.kuzyyn.powtorka1;

public class Calculations {

	public double round(Double numberToRound, int decimal){
		double rounded;
		if (decimal==0) { 
			return rounded = Math.round(numberToRound);
		}
		rounded = numberToRound*decimal*10;
		rounded = Math.round(rounded);
		rounded/=(decimal*10);
		return rounded;
	}
}
