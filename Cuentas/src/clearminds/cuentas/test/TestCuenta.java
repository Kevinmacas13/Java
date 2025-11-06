package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);
        //Creo el objeto Cuenta y lo referencio con cuenta2
        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        //Creo el objeto Cuenta y lo referencio con cuenta3
        Cuenta cuenta3 = new Cuenta("03476");

        //Modifico el tipo de cuenta
        cuenta3.setTipo("C");

        //Imprimo cuenta1, cuenta2 y cuenta3
        System.out.println("--------Valores Iniciales--------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("--------Valores modificados--------");
        cuenta1.setSaldo(444);
        cuenta3.setSaldo(576);
        cuenta3.setTipo("D");
        //Imprimo cuenta1, cuenta2 y cuenta3 modificados
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setSaldo(10);
        Cuenta cuenta5 = new Cuenta("0557", "C", 10);
        Cuenta cuenta6 = new Cuenta("0666");
        System.out.println("--------Valores Finales--------");
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();



    }
}
