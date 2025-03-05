package Metier;
import jakarta.persistence.*;

@Entity
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private int capacite;

    public Salle() {

    }
}