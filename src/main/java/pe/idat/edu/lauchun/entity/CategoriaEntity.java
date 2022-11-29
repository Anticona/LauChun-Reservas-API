
package pe.idat.edu.lauchun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
