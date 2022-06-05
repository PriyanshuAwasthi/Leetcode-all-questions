class Solution {
	public int totalNQueens(int n) {
		if(n==1) return 1;
		boolean[][] board=new boolean[n][n];
		return queens(board,0); 
	}
	static int queens(boolean[][] board, int row){

		if(row==board.length) return 1;

		int count=0;
		for(int col=0;col<board[0].length;col++)
		{
			if(isSafe(board,row,col))
			{
				board[row][col]=true;
				count += queens(board,row+1);
				board[row][col]=false;
			}
		}
		return count;
	}
	private static boolean isSafe(boolean[][] board, int row, int col) {
		for(int i=0;i<row;i++)
		{
			if(board[i][col]==true) return false;
		}

		int minLeft= Math.min(row,col);
		for(int i=1;i<=minLeft;i++)
		{
			if(board[row-i][col-i]==true) return false;
		}

		int maxRight= Math.min(row,board.length-col-1);
		for(int i=1;i<=maxRight;i++)
		{
			if(board[row-i][col+i]==true) return false;
		}

		return true;
	}
}
