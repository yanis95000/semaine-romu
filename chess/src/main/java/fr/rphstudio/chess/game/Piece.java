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
<<<<<<< HEAD
public class Piece implements IMOVE{
=======
public class Piece{
>>>>>>> master

   
    private ChessColor colorp;
    private ChessType typep;
    private IMOVE Name_Pawnp;

   
    
    
    public int getMoves(IChess.ChessPosition p){
        Name_Pawnp.getPieceMoves(p);
    return 19;
    }
    
<<<<<<< HEAD
    public Piece(ChessColor color, ChessType type, IMOVE Name_Pawn)
=======
    
    public Piece(ChessColor color, ChessType type, IMOVE Name_Pawn)

>>>>>>> master
    {
        this.colorp = color;
        this.typep = type;
        this.Name_Pawnp = Name_Pawn;
        
<<<<<<< HEAD
=======
    }
    
    public Piece(ChessColor color, ChessType type)
    {
        this(color,type,null);
>>>>>>> master
    }
    
    public ChessColor getChessColor()
    {
        return colorp;
    }
    
    public ChessType getChessType()
    {
        return typep;
    }

<<<<<<< HEAD
    @Override
    public int[] getPieceMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
=======
>>>>>>> master
}
