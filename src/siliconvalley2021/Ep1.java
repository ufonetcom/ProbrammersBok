package siliconvalley2021;



public class Ep1 {
    public int[] solution(int rows, int columns, int[][] connections, int[][] queries) {
    	int[] answer = {};
    	int cnt = connections.length;
    	int[][] arr = new int[rows][columns];
    	
//    	for(int i=0; i<rows; i++) {
//    		for(int j=0; j<columns; j++) {
//    			arr[i][j]connections[i][j]
//    		}
//    	}
    	
    	for(int i=0; i<connections.length; i++) {
    		int r = 0,c = 0,r1 = 0,c1 = 0;
    		for(int j=0; j<connections[i].length; j++) {
    			
    			if(j==0) {
    				r = connections[i][j];
    			}else if(j==1) {
    				c = connections[i][j];
    			}else if(j==2) {
    				r1 = connections[i][j];
    			}else {
    				c1 = connections[i][j];
    			}
    		}
    		arr[r][c] = 1;
    		arr[r1][c1] = 1;
    	}
    	
    	for(int i=0; i<queries.length; i++) {
    		for(int j=0; j<queries[i].length; j++) {
    			
    		}
    	}
    	
        return answer;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep1 sol = new Ep1();

		//입력값
		int rows = 4;
		int columns = 3;
		int[][] connections = {{1,1,2,1},{1,2,1,3},{1,3,2,3},
				{2,2,2,3},{2,2,3,2},{2,3,3,3},
				{3,2,3,3},{3,2,4,2},
				{4,1,4,2}};
		int[][] queries = {{2,2,3,1},{1,2,4,2}};
		System.out.println(sol.solution(rows, columns, connections, queries));
		
		
	}

}