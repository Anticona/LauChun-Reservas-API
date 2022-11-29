
package pe.idat.edu.lauchun.entity;

/**
 *
 * @author Sebastian
 */
public class Categoria {

    private int idcategoria;
    private String nombrecategoria;
    private String estado;

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria() {
    }

    public Categoria(int idcategoria, String nombrecategoria, String estado) {
        this.idcategoria = idcategoria;
        this.nombrecategoria = nombrecategoria;
        this.estado = estado;
    }
    
    
}
