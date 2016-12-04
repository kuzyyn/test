package main.pl.kuzyyn.powtorka2;

public class Auto extends Maszyna{
	String model;
	Toyota toyota;
	public Auto(String model){
		this.model=model;
	}
public void inMaszyna(){
System.out.println(this.getClass().getName() +  " inMaszyna ale w Auto!");	
}
public void inAuto(){
	System.out.println(this.getClass().getName() + " inAuto w Auto");
}

public void inAutoInMaszyna(){
	super.inMaszyna();
	System.out.println("Z poziomu Auta do maszyny");
}
	public int getWeight(){
		toyota = new Toyota("ttt");
		return 50;
		
	}
	
	public String getModel(){
		return model;
	}
}
