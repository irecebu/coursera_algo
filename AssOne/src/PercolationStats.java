
public class PercolationStats {

	public static void main(String[] args) {
		int n = StdIn.readInt();
		int t = StdIn.readInt();
		PercolationStats  ps = new PercolationStats(n, t);
	}
	
	public PercolationStats (int N, int T) {
		
		int c, r;
		for (int i = 0; i < T; i++) {
			Percolation p = new Percolation(N);
			while (!p.percolates()){
				do {
					r = StdRandom.uniform(N);
					c = StdRandom.uniform(N);
				} while (p.isOpen(c, r));
				p.open(c, r);
			}
		}
	}
	
	public double mean () {
		return 0;
	}
	
	public double stddev () {
		return 0;
	}
	
	public double confidenceLo () {
		return 0;
	}
	
	public double confidenceHi () {
		return 0;
	}
   
}
