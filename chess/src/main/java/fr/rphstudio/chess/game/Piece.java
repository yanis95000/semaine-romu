/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.ChessColor;
import fr.rphstudio.chess.interf.IChess.ChessType;

/**
 *
 * @author dialloelhadji
 */
public class Piece {
    private ChessColor Valentin;
    private ChessType Richmond;
    
    public Piece(ChessColor color, ChessType type)
    {
        this.Valentin = color;
        this.Richmond = type;
    }
    
    public ChessColor getChessColor()
    {
        return Valentin;
    }
    
    public ChessType getChessType()
    {
        return Richmond;
    }
}
