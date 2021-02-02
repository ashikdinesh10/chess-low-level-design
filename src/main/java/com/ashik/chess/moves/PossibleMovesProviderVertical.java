package com.ashik.chess.moves;

import static com.ashik.chess.moves.VerticalMoveDirection.*;

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
 * This class provides functionality for vertical moves
 *
 */
public class PossibleMovesProviderVertical extends PossibleMovesProvider {
    private VerticalMoveDirection verticalMoveDirection;

    public PossibleMovesProviderVertical(int maxSteps, MoveBaseCondition baseCondition,
                                         PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker,
                                         VerticalMoveDirection verticalMoveDirection) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
        this.verticalMoveDirection = verticalMoveDirection;
    }


    /**
     * this method tells what all vertical moves are possible for a given piece after checking some
     * additional conditions
     */
    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> result = new ArrayList<>();
        if (this.verticalMoveDirection == UP || this.verticalMoveDirection == BOTH) {
            result.addAll(findAllNextMoves(piece, board::getUpCell, board, additionalBlockers, player));
        }
        if (this.verticalMoveDirection == DOWN || this.verticalMoveDirection == BOTH) {
            result.addAll(findAllNextMoves(piece, board::getDownCell, board, additionalBlockers, player));
        }
        return result;
    }
}
