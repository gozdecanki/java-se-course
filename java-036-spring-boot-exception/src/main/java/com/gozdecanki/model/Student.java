package com.gozdecanki.model;

import jakarta.persistence.*;
import lombok.*;

@Data// @Setter + @Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="FIRST_NAME", length=100, nullable = false)
    private String firstName;

    @Column(name="LAST_NAME", length=125)
    private String lastName;

    @Column(name="EMAIL", unique = true)//unique bu maille 1 kez kayıt yapabilirsin diyoruz
    private String email;
}
