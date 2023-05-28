package com.sudoku.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RecordRequestPayload {
    private Long tableId;
    private Long userId;
    private Long seconds;
}
