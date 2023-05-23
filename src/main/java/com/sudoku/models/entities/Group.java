package com.sudoku.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="app_group")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="gr_name")
    private String name;
    @Column(name="gr_description")
    private String description;
    @Column(name="gr_code")
    private String code;
//    @OneToOne(mappedBy = "")
//    private User owner;
//    public Group(String name, String description){
//        this.name=name;
//        this.description=description;
//    }
}
