import java.util.ArrayList;

public class King extends ConcretePiece {

ArrayList <Position> moves=new ArrayList<>();
    King(ConcretePlayer owner, int playerName, int kills) {
        super("♚" ,owner,playerName, kills);
    }

    public boolean isWon(Position a) {
        return a.isCorner();

    }
// public void printMoves(String s){
//         System.out.print("k"+this.playerName+":");
//         System.out.print("(");
//         for(int i=0;i<moves.size();i++){
//             System.out.print(position.get(i).getCol()+","+position.get(i).getRow());
//         }
//     System.out.print(")");
//     System.out.println("\n");
// }

}
