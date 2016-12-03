package pl.kuzyyn.powtorka1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Kolekcje{
public Set<String> imionaSet(){
	Set<String> imiona = new TreeSet<String>();
	imiona.add("Robert");
	imiona.add("Ewelina");
	imiona.add("Bogdan");
	imiona.add("Ewelina");
	
	Iterator<String> iterator = imiona.iterator();
	while(iterator.hasNext()){
		Object element = iterator.next();
		System.out.println(element);
	}
	
	return imiona;
}
public List<Pies> dajPsiaKolekcje(){
	List<Pies> psiaLista= new ArrayList<Pies>();
	psiaLista.add(new Pies("radek",15));
	psiaLista.add(new Pies("max",2));
	psiaLista.add(new Pies("cwany",3));
	psiaLista.add(new Pies("milusinski",4));
	psiaLista.add(new Pies("stefek",25));
	psiaLista.add(new Pies("azor",9));

	for (Pies kolejnyPiesek : psiaLista){
		System.out.println("Imie: "+kolejnyPiesek.name + ", wiek: "+kolejnyPiesek.age);
	}
	Collections.sort(psiaLista);
	System.out.println("Posortowane...");
	for (Pies kolejnyPiesek : psiaLista){
		System.out.println("Imie: "+kolejnyPiesek.name + ", wiek: "+kolejnyPiesek.age);
	}
	return psiaLista;
}

}
