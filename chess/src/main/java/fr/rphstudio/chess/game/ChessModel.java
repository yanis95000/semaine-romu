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
    private int nb_black = 18;
    private int nb_white = 18;
    private Piece Chess_Board[][];
    
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
    public List<IChess.ChessType> getRemovedPieces(ChessColor color)
    {
        return new ArrayList<IChess.ChessType>();
    }
    
    @Override
    public IChess.ChessKingState getKingState(ChessColor color)
    {
        return null;
    }
    
    @Override
    public void movePiece(IChess.ChessPosition p0, IChess.ChessPosition p1)
    {
        
    }
    
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p)
    {
    
         
        
        return new ArrayList<IChess.ChessPosition>();

       
    }
    
    @Override
    public int getNbRemainingPieces(ChessColor color)
    {
        if(color == ChessColor.CLR_BLACK){
        
        return nb_black;
        }else{
        
        return nb_white;
        }
        
        
    }
    
    @Override
    public ChessColor getPieceColor(IChess.ChessPosition p) throws EmptyCellException, OutOfBoardException
    {
        //throw new EmptyCellException();
        
           if( p.x < 0 || p.y < 0 ||p.x>7  || p.y>7)
           {
            throw new OutOfBoardException();
           }
           
           if(Chess_Board[p.x][p.y]==null)
           {
               throw new EmptyCellException();
           }
           
            return Chess_Board[p.x][p.y].getChessColor();
    }
    
    @Override
    public IChess.ChessType getPieceType(IChess.ChessPosition p) throws EmptyCellException, OutOfBoardException
    {
        // check position
        //if( p.x<0 )
        
        
        // check piece non null
        
//        return table[p.x][p.y].getChessType();
           if( p.x < 0 || p.y < 0 ||p.x>7  || p.y>7)
           {
            throw new OutOfBoardException();
           }
           
           if(Chess_Board[p.x][p.y]==null)
           {
               throw new EmptyCellException();
           }
                
        return Chess_Board[p.x][p.y].getChessType();
        
        //throw new EmptyCellException();
    }
    
    @Override
    public void reinit()
    {
        
    }
    

    
    
    private void define_table()
    {
        this.Chess_Board = new Piece [IChess.BOARD_WIDTH][IChess.BOARD_HEIGHT];
            for(int x=0; x<IChess.BOARD_WIDTH; x++)
            {
                Chess_Board[x][IChess.BOARD_POS_Y_BLACK_PAWNS] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
                Chess_Board[x][IChess.BOARD_POS_Y_WHITE_PAWNS] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
                //Chess_board[IChess.bo][]
            }
           
            Chess_Board[IChess.BOARD_POS_X_KINGSIDE_ROOK][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK);
            Chess_Board[IChess.BOARD_POS_X_QUEENSIDE_ROOK][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK);          
            Chess_Board[IChess.BOARD_POS_X_KINGSIDE_ROOK][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK);
            Chess_Board[IChess.BOARD_POS_X_QUEENSIDE_ROOK][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK);

        // LORD KNIGHT
            Chess_Board[IChess.BOARD_POS_X_KINGSIDE_KNIGHT][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT);
            Chess_Board[IChess.BOARD_POS_X_QUEENSIDE_KNIGHT][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT);
            Chess_Board[IChess.BOARD_POS_X_KINGSIDE_KNIGHT][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT);
            Chess_Board[IChess.BOARD_POS_X_QUEENSIDE_KNIGHT][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT);
        //Bishop placement
            Chess_Board[IChess.BOARD_POS_X_KINGSIDE_BISHOP][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP);
            Chess_Board[IChess.BOARD_POS_X_QUEENSIDE_BISHOP][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP);
            Chess_Board[IChess.BOARD_POS_X_KINGSIDE_BISHOP][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP);
            Chess_Board[IChess.BOARD_POS_X_QUEENSIDE_BISHOP][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP);
        //Queen placement
            Chess_Board[IChess.BOARD_POS_X_QUEEN][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_QUEEN);
            Chess_Board[IChess.BOARD_POS_X_QUEEN][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_QUEEN);
        //King placement
            Chess_Board[IChess.BOARD_POS_X_KING][7] = new Piece(ChessColor.CLR_WHITE, IChess.ChessType.TYP_KING);
            Chess_Board[IChess.BOARD_POS_X_KING][0] = new Piece(ChessColor.CLR_BLACK, IChess.ChessType.TYP_KING);
        
    }
    
    
    

}
