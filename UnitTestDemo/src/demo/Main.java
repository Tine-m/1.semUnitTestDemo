package demo;

public class Main {

    public static void main(String[] args) {

        // test af lommeregner sum metode med positive heltal
        Calculator calculator = new Calculator();
	    int result = calculator.sum(10,20);
        System.out.println("Forventet Result er 30: faktisk result er: " +  result);
    }
}
