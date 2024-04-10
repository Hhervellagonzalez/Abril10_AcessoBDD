package com.softtek.presentacion;

import com.softtek.modelo.Producto;
import com.softtek.persistencia.AcessoProducto;
import com.softtek.persistencia.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        /*try {
            c1.abrirConexion();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        AcessoProducto aP1 = new AcessoProducto();

        try {
            System.out.println(aP1.obtenerTodos());
            System.out.println(aP1.obtenerUnProducto(1));
            //aP1.eliminarProducto(1);
            //Producto p1 = new Producto(78,"pelota", 10,10,"muchas",10.0,100,5,5,10);
            //System.out.println(aP1.insertarProducto(p1));
            //System.out.println(aP1.modificarProducto(1,100));
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
