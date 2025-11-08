package com.clearminds.componentes;

public class Producto {

private String Nombre;
private double Precio;
private String Codigo;

public Producto(String nombre, String codigo, double precio) {
    Nombre = nombre;
    Precio = precio;
    Codigo = codigo;
}
public void incrementarPrecio(int porcentaje){
    this.Precio+=((double)porcentaje/100)*this.Precio;
}
public void disminuirPrecio(double descuento){
    this.Precio-=descuento;
}
public String getNombre() {
    return Nombre;
}
public void setNombre(String nombre) {
    Nombre = nombre;
}
public double getPrecio() {
    return Precio;
}
public void setPrecio(double precio) {
    Precio = precio;
}
public String getCodigo() {
    return Codigo;
}
public void setCodigo(String codigo) {
    Codigo = codigo;
}





}
