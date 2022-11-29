package pe.idat.edu.lauchun.service;

import pe.idat.edu.lauchun.entity.ProductoEntity;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    
       
    List<ProductoEntity> findAll();
    
   
    List<ProductoEntity> findAllCustom();
    
    
    Optional<ProductoEntity> findById(Long id);
    
   
    ProductoEntity add (ProductoEntity p);
    
    
    ProductoEntity update (ProductoEntity p);
    
    
    ProductoEntity delete (ProductoEntity p); 
}
