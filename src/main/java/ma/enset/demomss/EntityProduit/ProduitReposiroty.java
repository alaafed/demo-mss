package ma.enset.demomss.EntityProduit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ProduitReposiroty extends JpaRepository<Produit, Long> {
    @RestResource(path="/ByName")
    Page<Produit> findByNameContains (
            @Param("kw") String name, Pageable pageable
    );
}
