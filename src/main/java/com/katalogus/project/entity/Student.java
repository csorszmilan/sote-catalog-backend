package com.katalogus.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Student {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String password;

    private String neptunCode;

    private Long turnusId;

    @ManyToMany
    private List<Konzultacio> konzultacioList;

    @ManyToMany
    private List<Eloadas> eloadasList;

    @ManyToMany
    private List<Gyakorlat> gyakorlatList;

}
