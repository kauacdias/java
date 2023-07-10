package sobrecarga;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        
        System.out.println(calculadora.calcular("ag", "ua"));
        System.out.println(calculadora.calcular(12.5, 50.3));
        System.out.println(calculadora.calcular(10, 10));
    }
}
