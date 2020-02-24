package Exercicio1;

public class Molde1 {

    public static void main(String args[]) {
        int a = 5, b = 3, d;
        double c = 3.0, e;
        d = a / b;
        System.out.println("d = " + d);
        e = a / c;
        System.out.println("e = " + e);
        e = (double) a / b;
        System.out.println("e = " + e);
        d = (int)(a / c);  //Apresenta erro por é impossivel converter de double para inteiro. Corrigi acrescentando o (int) 
        System.out.println("d = " + d);
	System.out.println("FIM");
    }

}
