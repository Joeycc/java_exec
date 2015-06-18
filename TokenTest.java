import java.util.StringTokenizer;

class TokenTester {

    public static void main(String[] arguments) {
	StringTokenizer st1, st2;

	String quote = "assd geg ejwqg";
	st1 = new StringTokenizer(quote);
	System.out.println("Token 1: "+ st1.nextToken());
	System.out.println("Token 2: " + st1.nextToken()); 

    }
}
