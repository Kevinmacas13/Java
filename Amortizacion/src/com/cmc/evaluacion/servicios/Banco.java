package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cliente;

import com.cmc.evaluacion.entidades.Prestamo;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ArrayList<Prestamo>> prestamos;
    private ArrayList<Cliente> clientes ;

    public Banco(){
        this.prestamos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public ArrayList<Prestamo> buscarPrestamos(String cedula){
       Cliente clienteEncontado;
        ArrayList<Prestamo> prestamosEncontado = new ArrayList<>();
        clienteEncontado= buscarCliente(cedula);
        if(clienteEncontado!=null){
            int index = this.clientes.indexOf(clienteEncontado);
            if (this.prestamos.get(index) != null) {
                prestamosEncontado=this.prestamos.get(index);
            }
           return prestamosEncontado;
        }else {
            System.out.println("Prestamo no encontrado");
            return null;
        }

    }
    public void asignarPrestamo(String cedula,Prestamo prestamo){
        Cliente clienteEncontado;
        clienteEncontado = buscarCliente(cedula);
        if(clienteEncontado!=null){
            int index = this.clientes.indexOf(clienteEncontado);
            while (prestamos.size() <= index) {
                prestamos.add(new ArrayList<>());
            }
            prestamos.get(index).add(prestamo);

        }else {
            System.out.println("No es cliente del banco");
        };

    }
   public Cliente buscarCliente(String cedula){
        for(int i=0;i<this.clientes.size();i++){
            if(this.clientes.get(i).getCedula().equals(cedula)){
                return  this.clientes.get(i);
            }
        }
        return null;
   }
   public void registrarCliente (Cliente cliente){
        if(buscarCliente(cliente.getCedula())==null){
            this.clientes.add(cliente);
            this.prestamos.add(new ArrayList<>());
        }

   }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<ArrayList<Prestamo>> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<ArrayList<Prestamo>> prestamos) {
        this.prestamos = prestamos;
    }
}
