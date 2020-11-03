public class Main {
    // r1 = row of king
    // c1 = col of king
    // r2 = row of rook
    // c2 = col of rook
    public boolean check(int[][] matrix, int r1, int c1, int r2, int c2){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(r1 < 0 || r2 < 0 || c1 < 0 || c2 < 0 || r1 >= rows || r2 >= rows || c1 >= cols || c2 >= cols)
            return false;
        if(r1 != r2)
            return false;
        int[] directions = {-2, -1, 1, 2};

        for(int hd : directions){
            int newCol = hd + c1;
            if(newCol < 0 || newCol >= cols)
                continue;
            else if(newCol == c2){
                return true;
            }
        }

        return false;
    }
}
