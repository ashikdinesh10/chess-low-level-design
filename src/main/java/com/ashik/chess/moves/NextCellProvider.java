package com.ashik.chess.moves;

import com.ashik.chess.model.Cell;

/**
 * @author ashik
 * 
 * Given a cell, it will provide next cell which we can reach to.
 */
interface NextCellProvider {
    Cell nextCell(Cell cell);
}
