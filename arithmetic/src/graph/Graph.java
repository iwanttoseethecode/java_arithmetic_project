package graph;

/*
 *       V0  V1  V2  V3  V4
 *  V0   0   -   -   -   6
 *  V1   9   0   3   -   -
 *  V2   2   -   0   5   -
 *  V3   -   -   -   0   1
 *  V4   -   -   -   -   0
 * 
 * */


public class Graph {
	
	private int[][] matrix;
	private static final int MAX_VALUE = Integer.MAX_VALUE; //表示无法到达 
	
	public Graph(){
		matrix = new int[5][5];
		
		matrix[0] = new int[]{0,MAX_VALUE,MAX_VALUE,MAX_VALUE,6};
		matrix[1] = new int[]{9,0,3,MAX_VALUE,MAX_VALUE};
		matrix[2] = new int[]{2,MAX_VALUE,0,5,MAX_VALUE};
		matrix[3] = new int[]{MAX_VALUE,MAX_VALUE,MAX_VALUE,0,1};
		matrix[4] = new int[]{MAX_VALUE,MAX_VALUE,MAX_VALUE,MAX_VALUE,6};
	}
	
	/*
	 * 计算某个顶点的出度
	 * */
	public int getOutdegree(int pointIndex){
		int degree = 0;
		int length = matrix[pointIndex].length;
		for(int i=0;i<length;i++){
			if(matrix[pointIndex][i]>0 && matrix[pointIndex][i]<MAX_VALUE){
				degree += 1;
			}
		}
		
		return degree;
	}
	
	/*
	 * 计算某个顶点的出度
	 * */
	
	public int getIndegree(int pointIndex){
		int degree = 0;
		int length = matrix.length;
		for(int i=0;i<length;i++){
			if(matrix[i][pointIndex]>0 && matrix[i][pointIndex]<MAX_VALUE){
				degree += 1;
			}
		}
		
		return degree;
	}
	
	/*
	 * 获取两个顶点之间的权值
	 * 
	 * */
	public int getWeight(int fromIndex,int toIndex){
		return matrix[fromIndex][toIndex];
	}
	
	
}
