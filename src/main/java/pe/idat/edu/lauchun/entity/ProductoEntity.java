package pe.idat.edu.lauchun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder            
@AllArgsConstructor 
@NoArgsConstructor  
@Data              

@Entity(name = "ProductoEntity")
@Table(name = "producto")

public class ProductoEntity {
     private static final long serialVersionUID=1L;
    
    //Atributos
    @Id
    @Column(name = "idproducto")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name = "nombproducto")
    private String nombre;
    
    @Column(name =  "precio")
    private double precio;
    
    @Column(name = "stock")
    private String stock;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "marca")
    private String marca;
    
    @Column(name = "imagen")
    private String imagen;
    
    @ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private CategoriaEntity nombrecategoria;
 
}
