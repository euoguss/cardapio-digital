package com.codegus.cardapio_digital.food;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "foods")
@Table(name = "foods")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private double price;

    public Food(FoodRequestDTO requestDTO){
        this.title = requestDTO.title();
        this.image = requestDTO.image();
        this.price = requestDTO.price();
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }
}
