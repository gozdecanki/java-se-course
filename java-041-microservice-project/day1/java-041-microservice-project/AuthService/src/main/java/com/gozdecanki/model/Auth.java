package com.gozdecanki.model;

//@EqualsAndHashCode(callSuper = true)

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder // bir siniftan nesne türetmek için kullanilir
@Data // set ve get metodlarini otomatik tanimlar
@NoArgsConstructor // bos paramtereli hazırlayıcı yapıcı metodu oluşturur.
@AllArgsConstructor // dolu paramtereli hazırlayıcı yapıcı metodu oluşturur.

@ToString // nesne bilgisini terminale yazdirmak icindir

@Entity
@Table(name = "auth")
public class Auth extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    //    @Email
//    @Column(unique = true)
    private String email;

    private String password;




}
