package com.softtek.persistencia;

import com.softtek.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AcessoProducto extends Conexion{
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException {
        Statement sentencia;
        ResultSet rs;
        String sql = "select product_id, product_name, unit_price,units_in_stock from products";
        List<Producto> productos = new ArrayList<>();
        abrirConexion();
        sentencia = miConexion.createStatement();
        rs = sentencia.executeQuery(sql);
        while(rs.next()){
            productos.add(new Producto(rs.getInt("product_id"),
                    rs.getString("product_name"),
                    rs.getDouble("unit_price"),
                    rs.getInt("units_in_stock") ));
        }
        return productos;
    }

    public Producto obtenerUnProducto(int ID) throws ClassNotFoundException, SQLException {
        Statement sentencia;
        ResultSet rs;
        String sql = "select product_id, product_name, unit_price, units_in_stock from products where product_id =" + ID;
        abrirConexion();
        sentencia = miConexion.createStatement();
        rs = sentencia.executeQuery(sql);
        Producto producto = null;
        if (rs.next()) {
             producto = new Producto(rs.getInt("product_id"), rs.getString("product_name"),
                    rs.getDouble("unit_price"), rs.getInt("units_in_stock"));
        }
        return producto;
    }


    public String insertarProducto(Producto p1) throws ClassNotFoundException, SQLException {
        Statement sentencia = null;
        String sql = "INSERT INTO products (product_id, product_name, supplier_id, category_id, quantity_per_unit, unit_price, units_in_stock, reorder_level, discontinued) VALUES  (" + p1.getIdProducto() + ", '" + p1.getNombreProducto() + "', " + p1.getId_supplier() + ", " + p1.getId_categoria() + ", '" + p1.getCantidad() + "', " + p1.getPercioUnitario() + ", " + p1.getUnidadesStock() + ", " + p1.getVovlerAPedir() + ", " + p1.getDiscontinua() + ")";

        abrirConexion();
        sentencia = miConexion.createStatement();
        sentencia.executeUpdate(sql);


        return "Producto insertado";
    }


    public String  eliminarProducto(int ID) throws ClassNotFoundException, SQLException {
        Statement sentencia;
        ResultSet rs;
        String sql = "Delete from products where product_id =" + ID;
        abrirConexion();
        sentencia = miConexion.createStatement();
        rs = sentencia.executeQuery(sql);
       return "Producto correctamente eliminado";
    }

    public String modificarProducto(int id, int nuevaCantidad) throws ClassNotFoundException, SQLException {
        Statement sentencia = null;
        ResultSet rs;
        String sql = "UPDATE products SET units_in_stock = " + nuevaCantidad + " WHERE product_id = " + id;

        abrirConexion();

        sentencia = miConexion.createStatement();
        sentencia.executeUpdate(sql);

        return "Producto Actualizado";
        }
    }


