package com.bits_wilp.fooddeliveryapi.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "users")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    //encrypt this
    @Column(nullable = false)
    private String password;
    private String about;
    private String deliveryAddress;
    private String paymentDetails;
//    @OneToMany(mappedBy = "customer")
//    private List<Order> orders;

//    @Enumerated(EnumType.STRING)
//    private Role role;                      // Enum for user roles (Customer, Owner, Delivery, Admin)

}