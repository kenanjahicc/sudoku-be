package com.sudoku.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TableDto {
    private Long id;
    private Long attempted;
    private int[][] table=new int[9][9];
    private int difficulty;

}
