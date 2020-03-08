
/**
 * Write a description of class producto here.
 * 
 * @author jose castillo 1152021 
 * @version 0.01
 */
public class producto
{
  //entradas//
  int cantidadInicial;
  int cantidadComprada;
  int cantidadVendida;
  int preciodeCompra;
  //salidas//
  int preciodeVenta;
  int ingresos;
  int egresos;
  int gananciasBrutas;
  int impuestos;
  int gananciasNetas;
  int existencias;

 void alogoritmo() {
     preciodeVenta = ((preciodeCompra*29)/100)+preciodeCompra;
     ingresos = preciodeVenta*cantidadVendida;
     egresos = cantidadComprada*preciodeCompra;
     existencias = (cantidadInicial+cantidadComprada)-cantidadVendida;
     gananciasBrutas = ingresos-egresos;
     impuestos = (ingresos*19)/100;
     gananciasNetas = gananciasBrutas-impuestos;

  
    }
}