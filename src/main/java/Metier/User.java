package Metier;

import jakarta.persistence.*;

@Entity
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nom;
        private String email;
        private String motDePasse;

        private Role role;

        public User(){

        }

    }
