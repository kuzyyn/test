package main.pl.kuzyyn.powtorka1;

public class Switch {

	public void dayChosen(Days day){
		switch (day){
		case mon: System.out.println("Wybrano poniedzia�ek"); 
					break;
		case tue: System.out.println("Wybrano wtorek");
					break;
		default: System.out.println("nie znaleziono");
					break;	
		}	
	}

}
