package com.krakedev.evaluacion;

public class Telefono {
    private String numero;
    private String tipo;
    private String estado;

    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        boolean isCorrecto = false;


        if (this.numero != null && this.tipo != null) {
            isCorrecto = true;
            if (this.tipo.equals("Movil") || this.tipo.equals("Convencional")) {
                isCorrecto = true;
                if ((this.tipo.equals("Movil") && this.numero.length() == 10) || (this.tipo.equals("Convencional") && this.numero.length() == 7)) {
                    isCorrecto = true;
                } else {
                    isCorrecto = false;
                }
            } else {
                isCorrecto = false;
            }

        } else {
            isCorrecto = false;
        }
        if(isCorrecto)

        {
            this.estado = "C";
        } else

        {
            this.estado = "E";
        }


    }






public String getNumero() {
    return numero;
}

public String getTipo() {
    return tipo;
}

public String getEstado() {
    return estado;
}
}

