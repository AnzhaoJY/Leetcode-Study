class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) return false;
        int col = matrix[0].length;
        if (col == 0) return false;
         return find(matrix, 0, col - 1, 0, row - 1, target);
    }
    
    public boolean find(int[][] m, int left, int right, int top, int bot, int tar) {
        int rowmid = (top + bot) / 2;
        int colmid = (left + right) / 2;
        if(m[rowmid][colmid] == tar) return true; // || m[rowmid ][colmid + 1] == tar || m[rowmid - 1][colmid] == tar || m[rowmid - 1][colmid + 1] == tar) return true;
        else if (rowmid == top && colmid == left) {//base case with one row or col
            if(left == right && top ==bot) return false;
            else if (left == right) {
                if (m[bot][left] == tar) return true;
                else return false;
            }else if (top == bot) {
                if (m[top][right] == tar) return true;
                else return false;
            }
            else {
                if(m[rowmid + 1][colmid + 1] == tar) return true;
                //test top right
                boolean topR = find(m, right, m[0].length - 1, 0, top, tar);//思路错了，试着把m越变越小以确保在讨论对角的时候，范围是想要的范围
                if (topR == true) return true;
                //test bot left
                boolean botL = find(m, 0, left, bot, m.length - 1, tar);
                if (botL == true) return true;
                else return false;
            }
        }
        else if(m[rowmid][colmid] > tar) return find(m, left, colmid, top, rowmid, tar);
        else if(m[rowmid][colmid] < tar) return find(m, colmid, right, rowmid, bot, tar);
        return false;
    }
}
