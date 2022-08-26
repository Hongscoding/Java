package sub2;
/*
 * 날짜 : 2022/08/22
 * 이름 : 홍민준
 * 내용 :  
 * 
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		
		// 1차원 배열
		int []scores = {80,60,78,62,92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		System.out.println("scores의 합 : "+total);
		
		// 2차원 배열
		int [][]arr2d = {{1,2,3,4}, 
						 {5,6,7,8}, 
						 {9,10,11,12}};
		
		System.out.println("arr2d[0][0] : "+arr2d[0][0]);
		System.out.println("arr2d[0][0] : "+arr2d[0][1]);
		System.out.println("arr2d[0][0] : "+arr2d[0][2]);
		System.out.println("arr2d[0][0] : "+arr2d[0][3]);
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("arr2d["+i+"]["+j+"] : "+arr2d[i][j]);
			}
		}
		
		// 3차원 배열
		int[][][] arr3d = {{{1,  2,  3},
							{4,  5,  6},
							{7,  8,  9}}, 
						   {{10, 11, 12},
							{13, 14, 15},
							{16, 17, 18}}, 
						   {{19, 20, 21}, 
							{22, 23, 24}, 
							{25, 26, 27}}};
		for(int a=0;a<3;a++) {
			for(int b=0;b<3;b++) {
				for(int c=0;c<3;c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n ", a,b,c, arr3d[a][b][c]);
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}





















