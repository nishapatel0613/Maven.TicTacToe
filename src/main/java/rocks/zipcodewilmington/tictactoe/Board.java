package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isInFavorOfX() {
        char c = 'X';


        if (matrix[0][0] == c && matrix[0][1] == c && matrix[0][2] == c) {
            return true;
        }else if(matrix [1][0] == c && matrix[1][1] == c && matrix[1][2] == c){
           return true;
        }else if (matrix[2][0] == c && matrix[2][1] == c && matrix[2][2] == c){
            return true;
        }else if(matrix[0][1] == c && matrix[1][1] == c && matrix[2][1] == c){
            return true;
        }else if(matrix[0][2] == c && matrix[1][2] == c && matrix[2][2] == c){
            return true;
        }else if(matrix[0][0] == c && matrix[0][1] == c && matrix[0][2] == c){
            return true;
        }else if(matrix[0][2] == c && matrix[0][1] == c && matrix[0][0] == c){
            return true;
        }else{
            return false;
        }


    }


    public boolean isInFavorOfO() {
        char c = 'O';


        if (matrix[0][0] == c && matrix[0][1] == c && matrix[0][2] == c) {
            return true;
        }else if(matrix [1][0] == c && matrix[1][1] == c && matrix[1][2] == c){
            return true;
        }else if (matrix[2][0] == c && matrix[2][1] == c && matrix[2][2] == c){
            return true;
        }else if(matrix[0][1] == c && matrix[1][1] == c && matrix[2][1] == c){
            return true;
        }else if(matrix[0][2] == c && matrix[1][2] == c && matrix[2][2] == c){
            return true;
        }else if(matrix[0][0] == c && matrix[0][1] == c && matrix[0][2] == c){
            return true;
        }else if(matrix[0][2] == c && matrix[0][1] == c && matrix[0][0] == c){
            return true;
        }else{
            return false;
        }

    }

    public Boolean isTie() {
      if(!isInFavorOfX() && !isInFavorOfO()){
          return true;
      }else {
          return false;
      }
}

    public String getWinner() {
        String winner = "";

        if (isTie()) {
            winner = null;
        } else if (isInFavorOfX()) {
            winner = "O";
        } else if (isInFavorOfO()) {
            winner = "X";
        }
        return winner;


    }

}

