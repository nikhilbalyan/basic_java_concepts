package november_21st_2017;

public class Music {

	static int numOfPlaylist(int N, int K, int L) {
//		if( N < L && K == 1)
		if(K >= N) {
			return 0;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		numOfPlaylist(1, 0, 3);
	}
}
