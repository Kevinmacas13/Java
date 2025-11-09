package com.krakedev.entidades;

import java.util.ArrayList;


public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;



    public Naipe() {
        this.numerosPosibles = new ArrayList<Numero>() {{
            add(new Numero("A", 11));
            add(new Numero("2", 2));
            add(new Numero("3", 3));
            add(new Numero("4", 4));
            add(new Numero("5", 5));
            add(new Numero("6", 6));
            add(new Numero("7", 7));
            add(new Numero("8", 8));
            add(new Numero("9", 9));
            add(new Numero("10", 10));
            add(new Numero("J", 10));
            add(new Numero("Q", 10));
            add(new Numero("K", 10));
        }};

        this.cartas = new ArrayList<Carta>();
        for (int i = 0; i < this.numerosPosibles.size(); i++) {
            Palos palos = new Palos();
            cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonRojo()));
            cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonNegro()));
            cartas.add(new Carta(numerosPosibles.get(i),palos.getDiamante()));
            cartas.add(new Carta(numerosPosibles.get(i),palos.getTrebol()));
        }

    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}
