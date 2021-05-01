
package ma.enset.demomss.EntityProduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//Remplacement par Rest Data Source sur l'interface JPA Repositoy
public class ProduitrestController {
    @Autowired
    private ProduitReposiroty produitReposiroty;

    @GetMapping(path = "/Produits")
    public List<Produit> list() {
        return produitReposiroty.findAll();
    }

    @GetMapping(path = "/Produits/{id}")
    public Produit getone(@PathVariable Long id) {
        return produitReposiroty.findById(id).get();
    }
    @PostMapping(path = "/Produits/")
    public Produit save(@RequestBody Produit produit) {
        return produitReposiroty.save(produit);
    }

    @PutMapping(path ="/Produits/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        produit.setId(id);
        return produitReposiroty.save(produit);
    }

    @DeleteMapping(path = "Produits/{id}")
    public void delete(@PathVariable Long id ){
       produitReposiroty.deleteById(id);
    }

}
