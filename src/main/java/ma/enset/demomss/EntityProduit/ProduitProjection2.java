package ma.enset.demomss.EntityProduit;

import org.springframework.data.rest.core.config.Projection;
// la projection permets de nous retourner que les attributs qui nous interessent
@Projection(name="web",types = Produit.class)
public interface ProduitProjection2{
    String getName();
    double getPrice();
}
