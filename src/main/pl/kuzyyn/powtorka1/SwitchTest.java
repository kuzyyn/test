package main.pl.kuzyyn.powtorka1;

public class SwitchTest {

	public void dayChosen(Days day){
		switch (day){
		case mon: System.out.println("Wybrano poniedzia³ek"); 
					break;
		case tue: System.out.println("Wybrano wtorek");
					break;
		default: System.out.println("nie znaleziono");
					break;	
		}	
	}

}
