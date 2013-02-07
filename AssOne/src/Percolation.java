
public class Percolation {
	private int closed = 0;
	private int open = 1;
	private WeightedQuickUnionUF board;
	
	
	public Percolation (int N) {
		board = new WeightedQuickUnionUF(N*N);
	}
	
	public void open (int i, int j) {
		i -= 1;
		j -= 1;
		
	}
	
	public boolean isOpen (int i, int j) {
		if (board[i][j] == open) return true;
		return false;
	}
	
	public boolean isFull (int i, int j) {
		return false;
	}
	
	public boolean percolates () {
		return false;
	}
}
