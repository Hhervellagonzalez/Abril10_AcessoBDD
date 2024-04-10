package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Producto {
    private int idProducto;
    private String nombreProducto;
    private int id_supplier;
    private int id_categoria;
    private String cantidad;
    private double percioUnitario;
    private int unidadesStock;
    private int enpedido;
    private int vovlerAPedir;
    private int discontinua;



    public Producto(int idProducto, String nombreProducto, double percioUnitario, int unidadesStock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.percioUnitario = percioUnitario;
        this.unidadesStock = unidadesStock;
    }

    public Producto(int idProducto, String nombreProducto, int id_supplier, int id_categoria, String cantidad, double percioUnitario, int unidadesStock, int enpedido, int vovlerAPedir, int discontinua) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.id_supplier = id_supplier;
        this.id_categoria = id_categoria;
        this.cantidad = cantidad;
        this.percioUnitario = percioUnitario;
        this.unidadesStock = unidadesStock;
        this.enpedido = enpedido;
        this.vovlerAPedir = vovlerAPedir;
        this.discontinua = discontinua;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPercioUnitario() {
        return percioUnitario;
    }

    public void setPercioUnitario(double percioUnitario) {
        this.percioUnitario = percioUnitario;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    public int getEnpedido() {
        return enpedido;
    }

    public void setEnpedido(int enpedido) {
        this.enpedido = enpedido;
    }

    public int getVovlerAPedir() {
        return vovlerAPedir;
    }

    public void setVovlerAPedir(int vovlerAPedir) {
        this.vovlerAPedir = vovlerAPedir;
    }

    public int getDiscontinua() {
        return discontinua;
    }

    public void setDiscontinua(int discontinua) {
        this.discontinua = discontinua;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", id_supplier=" + id_supplier +
                ", id_categoria=" + id_categoria +
                ", cantidad='" + cantidad + '\'' +
                ", percioUnitario=" + percioUnitario +
                ", unidadesStock=" + unidadesStock +
                ", enpedido=" + enpedido +
                ", vovlerAPedir=" + vovlerAPedir +
                ", discontinua=" + discontinua +
                '}';
    }
}
