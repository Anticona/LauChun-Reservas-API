

package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.CategoriaEntity;

/**
 *
 * @author Sebastian
 */
public interface CategoriaService {
     // funcion que te permita mostrar todos los datos    
    List<CategoriaEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<CategoriaEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<CategoriaEntity> findById(long id);
    
    //funcion para registrar datos
    CategoriaEntity add(CategoriaEntity c);
    
    //funcion para actualizar datos
    CategoriaEntity update(CategoriaEntity c);
    
    //funcion para eliminar datos
    CategoriaEntity delete(CategoriaEntity c);
}