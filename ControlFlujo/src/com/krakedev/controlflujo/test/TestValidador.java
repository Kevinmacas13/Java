package com.krakedev.controlflujo.test;
import com.krakedev.controlflujo.Validador;
public class TestValidador {
    public static void main(String[] args) {
     Validador validador = new Validador();
     validador.validadEdad(18);
        validador.validadEdad(19);
        validador.validadEdad(6);
        validador.validadEdad(15);
        validador.validadEdad(0);
    }
}
