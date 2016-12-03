package pl.kuzyyn.powtorka1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {
	public void checkRegex(){
	String pattern = "\\D";
	String checkedString = "gfd3hgfw2-534244124";
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(checkedString);
	while (m.find( )){
	System.out.println("znaleziono na indeksie: "+m.start());
	System.out.println(checkedString.substring(m.start(), m.end()));
	}
}
}