package pl.kuzyyn.powtorka1;

public class Pies  implements Comparable<Pies> {
public String name;
public Integer age;
	public Pies(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Pies o) {
	//	int porownanieImie = age.compareTo(o.age);
		return -age + o.age;
	}
}
