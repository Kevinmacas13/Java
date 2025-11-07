package como.krakedev.composicion;

public class Direccion {
    private String callePrincial;
    private String calleSecundaria;
    private String numero;
    private double latitud;
    private double longitud;

    public Direccion() {
    }

    public Direccion(String callePrincial, String numero, String calleSecundaria) {
        this.callePrincial = callePrincial;
        this.numero = numero;
        this.calleSecundaria = calleSecundaria;
    }

    public String getCallePrincial() {
        return callePrincial;
    }

    public void setCallePrincial(String callePrincial) {
        this.callePrincial = callePrincial;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }


}
