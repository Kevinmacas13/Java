package com.krakedev.entidades;

import com.krakedev.servicios.Juego;

import java.util.ArrayList;

public class Jugadores {
    private ArrayList<String> jugadores;

    public Jugadores(){
       jugadores = new ArrayList<>();
    }
    public void jugar(){

        ArrayList <String> jugadores = new ArrayList();
        jugadores.add("Juan");
        jugadores.add("Pedro");
        jugadores.add("Miguel");
        Juego juego = new Juego(jugadores);
        juego.entregarCartas(5);

        for(int i = 0; i < juego.getCartasJugadores().size(); i++){
            int suma = 0;
            for(int j=0 ; j<juego.getCartasJugadores().get(i).size(); j++){
                    suma+=juego.getCartasJugadores().get(i).get(j).getNumero().getValor();
            }
            System.out.println("Total de jugador "+(i+1)+": "+suma);
        }
        String ganador;


    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }
}
