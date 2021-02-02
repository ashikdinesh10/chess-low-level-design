package com.ashik.chess.conditions;

import com.ashik.chess.model.Piece;

/**
 * @author ashik
 * 
 * It provides the base condition for a piece to make a move. The piece would only be allowed to move from its current
 * position if the condition fulfills.
 */
public interface MoveBaseCondition {
    boolean isBaseConditionFullfilled(Piece piece);
}
