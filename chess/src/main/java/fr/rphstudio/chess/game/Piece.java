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
    private ChessColor colorp;
    private ChessType typep;
    
    
    public int getMoves(){
        
    return 19;
    }
    
    public Piece(ChessColor color, ChessType type)
    {
        this.colorp = color;
        this.typep = type;
    }
    
    public ChessColor getChessColor()
    {
        return colorp;
    }
    
    public ChessType getChessType()
    {
        return typep;
    }
}
