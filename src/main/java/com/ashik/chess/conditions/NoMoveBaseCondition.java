package com.ashik.chess.conditions;

import com.ashik.chess.model.Piece;

/**
 * @author ashik
 * 
 * Helper implementation to use when there is no associated base condition with a move.
 */
public class NoMoveBaseCondition implements MoveBaseCondition {
    public boolean isBaseConditionFullfilled(Piece piece) {
        return true;
    }
}
