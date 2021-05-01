package ma.enset.demomss.EntityProduit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
  @Data @NoArgsConstructor @AllArgsConstructor
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private double quantity;

    public Produit(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


}
