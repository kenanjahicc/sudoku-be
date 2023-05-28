package com.sudoku.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecordDto {
    private Long tableId;//Foreign Key
    private String userId;//Foreign Key
    private Long seconds;
}
