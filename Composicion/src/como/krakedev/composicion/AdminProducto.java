package como.krakedev.composicion;

public class AdminProducto {
    //Recibe 2 producto
    //Retorna el de mayor precio
    //Si tiene el mismo precio retorna null

    public Producto buscarMasCaro(Producto producto1, Producto producto2) {
      if(producto1.getPrecio()>producto2.getPrecio()){
      return producto1;
      }else if(producto1.getPrecio()<producto2.getPrecio()){
          return producto2;
      }else{
          return null;
      }
    }
}
