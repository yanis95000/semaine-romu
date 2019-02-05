/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author titouanhuteau
 */
public class King {
   
    
    
     public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p){
         
        List<IChess.ChessPosition> PossibleMove = new ArrayList<IChess.ChessPosition>();
        
        
     
      
        
        PossibleMove.add(new IChess.ChessPosition(p.x+1, p.y+2));
        PossibleMove.add(new IChess.ChessPosition(p.x+1, p.y+0));
        PossibleMove.add(new IChess.ChessPosition(p.x+0, p.y+1));
        PossibleMove.add(new IChess.ChessPosition(p.x+0, p.y+1));

         
         return PossibleMove;
}
     
}