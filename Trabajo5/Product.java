package Trabajo3;

import java.util.Objects;

public class Product {

    private String codigo;
    private String nombre;
    private double precio;

    public Product() {
    }

    public Product(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(precio, product.precio) == 0 && Objects.equals(codigo, product.codigo) && Objects.equals(nombre, product.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, precio);
    }

    @Override
    public String toString() {
        return "Product{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
