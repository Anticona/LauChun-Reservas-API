package pe.idat.edu.lauchun.repository;

import pe.idat.edu.lauchun.entity.ProductoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{
    @Query("select p from ProductoEntity p where p.estado = '1'")
    List<ProductoEntity> findAllCustom();
   
}
