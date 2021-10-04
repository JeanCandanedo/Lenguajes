package automata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ayut {
	public static void main (String[] args) {
	String cadena="a";
	Pattern pat = Pattern.compile("(b+ab*ab*a)*");
    Matcher mat = pat.matcher(cadena);
    
    if (mat.find()) {
        System.out.println("Válido");                                                                            
    } else {
        System.out.println("No Válido");                                                                         
    }
}
}
