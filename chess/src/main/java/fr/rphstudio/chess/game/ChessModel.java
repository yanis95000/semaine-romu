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
        throw new EmptyCellException();
    }
    
    @Override
    public void reinit()
    {
        
    }

}
