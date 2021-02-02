package com.ashik.gameplay.contracts;

import com.ashik.chess.model.Cell;
import com.ashik.chess.model.Piece;

import lombok.Getter;

@Getter
public class PlayerMove {

    Piece piece;
    Cell toCell;
}
