package com.ashik.chess.moves;

import java.util.ArrayList;
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
 * This class provides functionality for Horizontal moves
 *
 */
public class PossibleMovesProviderHorizontal extends PossibleMovesProvider {

    public PossibleMovesProviderHorizontal(int maxSteps, MoveBaseCondition baseCondition,
                                           PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
    }

    /**
     * this method tells what  all horizontal moves are possible for a piece
     * 
     */
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, final Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> result = new ArrayList<>();
        result.addAll(findAllNextMoves(piece, board::getLeftCell, board, additionalBlockers, player));
        result.addAll(findAllNextMoves(piece, board::getRightCell, board, additionalBlockers, player));
        return result;
    }
}
