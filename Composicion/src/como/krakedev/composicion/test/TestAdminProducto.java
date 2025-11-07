package como.krakedev.composicion.test;

import como.krakedev.composicion.AdminProducto;
import como.krakedev.composicion.Producto;

public class TestAdminProducto {
    public static void main(String[] args) {
        AdminProducto adminProducto = new AdminProducto();
        Producto productoA = new Producto("Doritos",0.50);
        Producto productoB = new Producto("Papitas",0.50);
        Producto mc;
        mc= adminProducto.buscarMasCaro(productoA,productoB);
        if(mc==null){
            System.out.println("Son iguales");
        }else {
            System.out.println("El más caro es: " + mc.getNombre());
        }
    }

}

