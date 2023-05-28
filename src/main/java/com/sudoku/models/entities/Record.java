package com.sudoku.models.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="app_record")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Record implements Comparable<Record>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="tableId")
    private Long tableId;//Foreign Key
    @Column(name="userId")
    private Long userId;//Foreign Key
    @Column(name="seconds")
    private Long seconds;

    public Record(Long tableId, Long userId, Long seconds) {
        this.tableId = tableId;
        this.userId = userId;
        this.seconds = seconds;
    }

    @Override
    public int compareTo(Record o) {
        return Long.compare(this.seconds, o.seconds);
    }
}
