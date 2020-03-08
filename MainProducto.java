
/**
 * Use los comentarios para explicar el objetivo de este programa MainTienda .
 *
 * @author (Sus Nombres y Apellidos y Su email)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
class MainProducto
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        producto producto = new producto();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        producto.cantidadInicial= c.leerEntero("Cantidad Inicial");
        producto.cantidadComprada= c.leerEntero("Cantidad Comprada");
        producto.cantidadVendida= c.leerEntero("Cantidad Vendida");
        producto.preciodeCompra= c.leerEntero("Precio de Compra");

        //invocar el algoritmo o los algoritmos, usando el Modelo
        producto.alogoritmo();

        //mostrar / imprimir los datos de salida
        c.imprimir("Precio de Venta = " + producto.preciodeVenta);
        c.imprimir("Ingresos = " + producto.ingresos);        
        c.imprimir("Egresos = " + producto.egresos);
        c.imprimir("Ganancias Brutas = " + producto.gananciasBrutas);  
        c.imprimir("Impuestos = " + producto.impuestos);
        c.imprimir("Ganancias Netas = " + producto.gananciasNetas);

    } 
    
}//fin class MainTienda
