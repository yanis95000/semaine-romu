/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.ChessColor;
import fr.rphstudio.chess.interf.IChess.ChessType;
import fr.rphstudio.chess.interf.IMOVE;

/**
 *
 * @author dialloelhadji
 */
public class Piece implements IMOVE{

   
    private ChessColor colorp;
    private ChessType typep;
    private IMOVE Name_Pawnp;

   
    
    
    public int getMoves(IChess.ChessPosition p){
        Name_Pawnp.getPieceMoves(p);
    return 19;
    }
    
    public Piece(ChessColor color, ChessType type, IMOVE Name_Pawn)
    {
        this.colorp = color;
        this.typep = type;
        this.Name_Pawnp = Name_Pawn;
        
    }
    
    public ChessColor getChessColor()
    {
        return colorp;
    }
    
    public ChessType getChessType()
    {
        return typep;
    }

    @Override
    public int[] getPieceMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
