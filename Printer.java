class Printer {
    int x = 0;
    int y = 1;

    void print() {
	System.out.println("x = " + x + ", y = " + y);
	System.out.println(this.getClass().getName());
    }
}

class SubPrinter extends Printer {

    int z = 3;    
    public static void main(String[] arguments) {

	SubPrinter obj = new SubPrinter();
	obj.print();
    }
}
