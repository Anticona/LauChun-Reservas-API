
package pe.idat.edu.lauchun.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Sebastian
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "CategoriaEntity")
@Table(name = "categoria")
public class CategoriaEntity implements Serializable{
    
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "idcategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcategoria;
    
    @Column(name = "nombrecategoria")
    private String nombrecategoria;
    
    @Column(name = "estado")
    private String estado;

    
    
}
