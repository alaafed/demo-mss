package ma.enset.demomss.EntityProduit;


import org.springframework.data.rest.core.config.Projection;

@Projection(name="mobile",types = Produit.class)
public interface ProduitProjection {
    String getName();

}

