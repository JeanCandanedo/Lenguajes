package automata;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class automata_ab {

	    public static void main (String[] args) {
	    	Scanner Scanner = new Scanner(System.in);
	        String exp="b*+(ab*ab*ab*)*";
	        String t;
	        int i=0;
			while( i<=5) {
	        t=Scanner.next();
	        Pattern pt = Pattern.compile(exp);
	        Matcher mt= pt.matcher(t);
	        boolean res=mt.matches();
	        System.out.println(res);
	        i++;
			}
	    }
}
