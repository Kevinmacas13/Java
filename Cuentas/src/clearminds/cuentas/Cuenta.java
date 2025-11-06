package clearminds.cuentas;

public class Cuenta {
    private String Id;
    private String Tipo="A";
    private double Saldo;
    public Cuenta(String id) {
        this.Id = id;
        this.Tipo = "A";
    }
    public Cuenta(String id, String tipo, double Saldo) {
        this.Id = id;
        this.Tipo = tipo;
        this.Saldo = Saldo;
    }

    public String getId() {
        return Id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    public void imprimir(){
        System.out.println("********************");
        System.out.println();
        System.out.println("CUENTA");
        System.out.println();
        System.out.println("********************");
        System.out.println();
        System.out.println("Número de Cuenta: "+this.Id);
        System.out.println();
        System.out.println("Tipo: "+this.Tipo);
        System.out.println();
        System.out.println("Saldo: "+this.Saldo);
        System.out.println();
        System.out.println("********************");

    }

    public void imprimirConMiEstilo(){
        System.out.println("---------------------");
        System.out.println();
        System.out.println("CUENTA");
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        System.out.println("Número de Cuenta: "+this.Id);
        System.out.println();
        System.out.println("Tipo: "+this.Tipo);
        System.out.println();
        System.out.println("Saldo: "+this.Saldo);
        System.out.println();
        System.out.println("---------------------");

    }
}
