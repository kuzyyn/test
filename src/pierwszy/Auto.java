package pierwszy;

public class Auto extends Maszyna{
	
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
		return 50;
	}
}
