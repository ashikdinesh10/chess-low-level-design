package com.ashik.chess.model;

import com.ashik.chess.helpers.TestHelpers;
import com.ashik.chess.model.Cell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 
 * @author ashik
 *
 */
class CellTest {

    @Test
    void testFreeCell() {
        Cell cell = new Cell(0, 0);
        assertTrue(cell.isFree());
    }

    @Test
    void testOccupiedCell() {
        Cell cell = new Cell(0, 0);
        cell.setCurrentPiece(TestHelpers.randomPiece());
        assertFalse(cell.isFree());
    }
}