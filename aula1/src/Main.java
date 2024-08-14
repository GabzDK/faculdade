public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.setNum1(30);
        calc.setNum2(5);

        System.out.println("Soma " + calc.somar());
        System.out.println("Subtracao " + calc.subtrair());
        System.out.println("Divisao " + calc.dividir());
        System.out.println("Multiplicacao " + calc.multiplicar());
    }
}