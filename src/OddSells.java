import java.util.*;
class OddSells 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> rowMap = new HashMap<>();
		HashMap<Integer,Integer> colMap = new HashMap<>();
		int n = 2, m =3;
		int[][] indices = {{0,1},{1,1}};

		/*for(int[] indice : indices){
			rowMap.put(indice[0],rowMap.getOrDefault(indice[0],0)+1);
			colMap.put(indice[1],colMap.getOrDefault(indice[1],0)+1);
		}
		int count = 0;

		for(int i =0;i<n;i++){
			for(int j =0;j<m;j++){
				int temp =0;
				temp+= rowMap.getOrDefault(i,0);
				temp+= colMap.getOrDefault(j,0);
				count+=temp%2;
			}
		}*/

		boolean[] rows = new boolean[n], cols = new boolean[m];
        for (int[] indice : indices) {
            rows[indice[0]] ^= true;
            cols[indice[1]] ^= true;
        }
        
        int rowOdds = 0, colOdds = 0;
        for (int i = 0; i < n; i++) {
            rowOdds += rows[i] ? 1 : 0;
        }
        for (int i = 0; i < m; i++) {
            colOdds += cols[i] ? 1 : 0;
        }
        int count =  rowOdds * (m - colOdds) + colOdds * (n - rowOdds);
		System.out.println(count);
	}
}


/*
image = [[1,1,0],[1,0,1],[0,0,0]];
flip = [[0,1,1],[1,0,1],[0,0,0]]
invert = [[1,0,0],[0,1,0],[1,1,1]]


*/