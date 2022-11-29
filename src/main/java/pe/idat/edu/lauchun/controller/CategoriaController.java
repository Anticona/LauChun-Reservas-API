
package pe.idat.edu.lauchun.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.lauchun.entity.CategoriaEntity;
import pe.idat.edu.lauchun.service.CategoriaService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService Catservice;
    
    @GetMapping
    public List<CategoriaEntity>findAll(){
        return Catservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<CategoriaEntity>findAllCustom(){
        return Catservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CategoriaEntity>findById(@PathVariable Long id ){
        return Catservice.findById(id);
    }
    
    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity c){
        return Catservice.add(c);
    }
    
    @PutMapping("/{id}")
    public CategoriaEntity update(@PathVariable long id, @RequestBody CategoriaEntity c){
        c.setIdcategoria(id);
        return Catservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable long id){
        CategoriaEntity objcategoria = new CategoriaEntity();
        String Inactivo = "Inactivo";
        objcategoria.setEstado(Inactivo);
        return Catservice.delete(CategoriaEntity.builder().idcategoria(id).build());
    }
}
