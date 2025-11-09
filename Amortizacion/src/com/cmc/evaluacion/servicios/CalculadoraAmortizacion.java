package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;


public class CalculadoraAmortizacion {



        public static double calcularCuota(Prestamo prestamo) {
        double cuota = 0;
        cuota = (prestamo.getMonto()*((prestamo.getInteres()/12)/100))/(1-Math.pow((1+((prestamo.getInteres()/12)/100)),-1*prestamo.getPlazo()));
        return cuota;

    }


    public static void generarTabla(Prestamo prestamo) {
        double valorConstante = calcularCuota(prestamo);
        for(int i=0; i<prestamo.getPlazo(); i++){
            Cuota nuevaCuota = new Cuota(i+1);
            nuevaCuota.setCuota(valorConstante);
            prestamo.getCuotas().add(nuevaCuota);
        }
        prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());


        for(int i=0;i<prestamo.getCuotas().size();i++){
            if(i==prestamo.getCuotas().size()-1){
                Cuota cuota=prestamo.getCuotas().get(i);
                double interesPrestamo= cuota.getInicio()*(((prestamo.getInteres()/12))/100);
                double capitalAbono= cuota.getCuota()-interesPrestamo;
                cuota.setInteres(interesPrestamo);
                cuota.setAbonoCapital(capitalAbono);
                cuota.setSaldo(0);

            }else{
                calcularValoresCuota(prestamo.getInteres(),prestamo.getCuotas().get(i),prestamo.getCuotas().get(i+1));
            }

        }


    }
    public static void calcularValoresCuota(double interes, Cuota cuota, Cuota cuotaSiguiente) {
            double interesPrestamo= cuota.getInicio()*(((interes/12))/100);
             double capitalAbono= cuota.getCuota()-interesPrestamo;
             double saldoActual= cuota.getInicio()-capitalAbono;
             cuota.setInteres(interesPrestamo);
             cuota.setAbonoCapital(capitalAbono);
             cuota.setSaldo(saldoActual);
             cuotaSiguiente.setInicio(saldoActual);


    }
    public static void mostrarTabla(Prestamo prestamo) {

            System.out.println("Número  | Cuota | Inicio  | Interés | Abono | Saldo");
            for(int i=0;i<prestamo.getCuotas().size();i++){
                prestamo.getCuotas().get(i).mostrarPrestamo();
            }

    }



}
