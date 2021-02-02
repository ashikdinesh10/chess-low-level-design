package com.ashik.gameplay;

import com.ashik.chess.model.Board;
import com.ashik.chess.model.Player;
import com.ashik.gameplay.contracts.PlayerMove;

import static com.ashik.chess.conditions.PieceCellOccupyBlockerFactory.defaultAdditionalBlockers;

import java.util.List;

/**
 * 
 * @author ashik
 * 
 * controller class for starting the game
 *
 */
public class GameController {

    public static void gameplay(List<Player> players, Board board) {
        int currentPlayer = 0;
        while (true) {
            Player player = players.get(currentPlayer);
            //TODO: Check if current player has any move possible. If no move possible, then its checkmate.
            PlayerMove playerMove = player.makeMove();
            playerMove.getPiece().move(player, playerMove.getToCell(), board, defaultAdditionalBlockers());
            currentPlayer = (currentPlayer + 1) % players.size();
        }
    }
}
