package ma.enset.demomss;

import ma.enset.demomss.EntityProduit.Produit;
import ma.enset.demomss.EntityProduit.ProduitReposiroty;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DemoMssApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMssApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProduitReposiroty produitReposiroty ,RepositoryRestConfiguration
    restconfiguration){
        return args -> {
            restconfiguration.exposeIdsFor(Produit.class);
        produitReposiroty.save(new Produit("ord",6000,3));
        produitReposiroty.save(new Produit("imprimante",20,15));
        produitReposiroty.save(new Produit("cartable",500,5));
        produitReposiroty.findAll().forEach(p->{
            System.out.println(p.getName());
        });

    };

}}
