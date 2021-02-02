package com.ashik.chess.conditions;

import com.ashik.chess.model.Board;
import com.ashik.chess.model.Cell;
import com.ashik.chess.model.Piece;

/**
 * @author ashik
 * 
 * Default condition for moving further. By default, a piece is allowed to move from a cell only if the cell was free
 * when it came there.
 */
public class PieceMoveFurtherConditionDefault implements PieceMoveFurtherCondition {

    @Override
    public boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board) {
        return cell.isFree();
    }
}
