package com.krakedev.servicios;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

import java.util.ArrayList;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<Carta> naipeBarajado;

    public Juego() {
        naipe = new Naipe();
        this.naipeBarajado = new ArrayList<>();
        this.naipeBarajado = naipe.barajar();
    }


    public Juego(ArrayList<String> ids) {
        this.naipe = new Naipe();
        this.naipeBarajado = naipe.barajar();
        this.cartasJugadores = new ArrayList();
        for (int i = 0; i < ids.size(); i++) {
            ArrayList<Carta> cartasJugador = new ArrayList();
            this.cartasJugadores.add(cartasJugador);
        }

    }

    public int devolverTotal(int id) {
        int total = 0;
        for (int i = 0; i < cartasJugadores.get(id).size(); i++) {
            total += cartasJugadores.get(id).get(i).getNumero().getValor();
        }
        return total;
    }
    public String determinarGanador() {
        int idGanador=0;
        int sumaGanador=devolverTotal(0);
        int auxiliar=0;

        for (int i = 0; i < this.cartasJugadores.size(); i++) {
              auxiliar = devolverTotal(i);
            if(auxiliar>=sumaGanador){
                idGanador=i;
                sumaGanador=auxiliar;
            }
        }

        return  "jugador "+String.valueOf(idGanador + 1);
    }

    public void entregarCartas(int cartasPorJugador) {
        int numeroJugadores = this.cartasJugadores.size();

        int contador = 0;
        for (int ronda = 0; ronda < cartasPorJugador; ronda++) {
            for (int j = 0; j < numeroJugadores; j++) {
                if (contador < naipeBarajado.size()) {
                    cartasJugadores.get(j).add(naipeBarajado.get(contador));
                    contador++;
                }
            }
        }

    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }
}
