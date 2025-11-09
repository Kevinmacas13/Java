package com.krakedev.entidades;

import java.util.ArrayList;


public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;



    public Naipe() {
        this.numerosPosibles = new ArrayList<Numero>();

        this.numerosPosibles.add(new Numero("A", 11));
        this.numerosPosibles.add(new Numero("2", 2));
        this.numerosPosibles.add(new Numero("3", 3));
        this.numerosPosibles.add(new Numero("4", 4));
        this.numerosPosibles.add(new Numero("5", 5));
        this.numerosPosibles.add(new Numero("6", 6));
        this.numerosPosibles.add(new Numero("7", 7));
        this.numerosPosibles.add(new Numero("8", 8));
        this.numerosPosibles.add(new Numero("9", 9));
        this.numerosPosibles.add(new Numero("10", 10));
        this.numerosPosibles.add(new Numero("J", 10));
        this.numerosPosibles.add(new Numero("Q", 10));
        this.numerosPosibles.add(new Numero("K", 10));


        this.cartas = new ArrayList<Carta>();
        for (int i = 0; i < this.numerosPosibles.size(); i++) {
            Palos palos = new Palos();
            cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonRojo()));
            cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonNegro()));
            cartas.add(new Carta(numerosPosibles.get(i),palos.getDiamante()));
            cartas.add(new Carta(numerosPosibles.get(i),palos.getTrebol()));
        }

    }
  public  ArrayList<Carta> barajar() {
      ArrayList<Carta> auxiliar = new ArrayList<>();
      int numeroAleatorio;
      Carta cartaAleatoria;
      for (int i = 0; i <= 100; i++) {
           numeroAleatorio= Random.obtenerPosicion();
           cartaAleatoria = cartas.get(numeroAleatorio);
          if(cartaAleatoria.getEstado().equals("N")){
              cartaAleatoria.setEstado("C");
              auxiliar.add(cartaAleatoria);
          }
      }
      for(int i=0;i<cartas.size();i++){
          if(!auxiliar.contains(cartas.get(i))){
                cartas.get(i).setEstado("C");
                auxiliar.add(cartas.get(i));

          }
      }

      return auxiliar;
  }
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}
