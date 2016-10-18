package biz.somos.coordinatorlayout.Model;

/**
 * Created by sbv23 on 17/10/2016.
 */
public class MenuItem {

    protected String nombre;
    protected String categoria;

    public MenuItem() {
    }

    public MenuItem(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
