package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.entity.CategoriaEntity;

/**
 *
 * @author Sebastian
 */
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

    @Query("select c from CategoriaEntity c where c.Estado='Activos'")
    List<CategoriaEntity> findAllCustom();
}
