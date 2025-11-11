package com.krakedev.herencia;

public class Gato extends Animal {  
@Override
    public void dormir(){
    System.out.println("El gato duerme");
} 

  public void maullar() {
	 System.out.println("El gato maulla"); 
  }
  
  public void maullar(String adjetivo) {
	 System.out.println("El gato maulla: "+adjetivo); 
  }
  

}
