package com.sudoku.models.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tablen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="attempted")
    private Long attempted;
    @Column(name="s_table")
    private String table;
}
