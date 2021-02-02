package com.ashik.chess.moves;

import java.util.List;

import com.ashik.chess.conditions.MoveBaseCondition;
import com.ashik.chess.conditions.PieceCellOccupyBlocker;
import com.ashik.chess.conditions.PieceMoveFurtherCondition;
import com.ashik.chess.model.Board;
import com.ashik.chess.model.Cell;
import com.ashik.chess.model.Piece;
import com.ashik.chess.model.Player;

/**
 * 
 * @author ashik
 * 
 * This class provides functionality for diagonal moves
 *
 */
public class PossibleMovesProviderDiagonal extends PossibleMovesProvider {


    public PossibleMovesProviderDiagonal(int maxSteps, MoveBaseCondition baseCondition,
                                         PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
    }

    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        return null;
    }
}
