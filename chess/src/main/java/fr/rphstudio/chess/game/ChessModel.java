/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.ChessColor;
import fr.rphstudio.chess.interf.OutOfBoardException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dialloelhadji
 */
public class ChessModel implements IChess {
    
    private ChessModel()
    {
        this.define_table();
    }
    
    private static ChessModel instance;
    public static ChessModel getInstance(){
        if(ChessModel.instance == null){
            ChessModel.instance = new ChessModel();
        }
        return ChessModel.instance;
    }
    
    
    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying)
    {
        return 0;
    }
    
    @Override
    public boolean undoLastMove()
    {
        return true;
    }
    
    @Override
    public List<ChessType> getRemovedPieces(ChessColor color)
    {
        return new ArrayList<ChessType>();
    }
    
    @Override
    public ChessKingState getKingState(ChessColor color)
    {
        return null;
    }
    
    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1)
    {
        
    }
    
    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p)
    {
        return new ArrayList<ChessPosition>();
        
       
    }
    
    @Override
    public int getNbRemainingPieces(ChessColor color)
    {
        return 0;
    }
    
    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException
    {
        throw new EmptyCellException();
    }
    
    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException
    {
        // check position
        //if( p.x<0 )
        
        
        // check piece non null
        
//        return table[p.x][p.y].getChessType();
        
        
        throw new EmptyCellException();
    }
    
    @Override
    public void reinit()
    {
        
    }
    
    private Piece Chess_Board[][];
    
    
    private void define_table()
    {
        this.Chess_Board = new Piece [IChess.BOARD_WIDTH][IChess.BOARD_HEIGHT];
            for(int x=0; x<IChess.BOARD_WIDTH; x++)
            {
                Chess_Board[x][IChess.BOARD_POS_Y_BLACK_PAWNS] = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN);
                Chess_Board[x][IChess.BOARD_POS_Y_WHITE_PAWNS] = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN);
                //Chess_board[IChess.bo][]
            }
           
        
    }
    
    
    

}
