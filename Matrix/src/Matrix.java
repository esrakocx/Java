public class Matrix {

	//matrix multiplication
	public static double[][] multiply(double[][] M, double[][] N){
			
		double[][] result = new double[M.length][N[0].length];
			
		if(M[0].length == N.length) {
			for(int i = 0; i < M.length; i++) {
				for(int j = 0; j < M[0].length; j++) {
					for(int k = 0; k < N.length; k++)
						result[i][j] +=  M[i][k] * N[k][j];
				}
			}
			return result;
		}
			
		else
			throw new RuntimeException("Illegal matrix dimension.");
	}
	
	//returns a new matrix that is the transpose of the matrix M
	public static double[][] transpose(double[][] M){
		
		double[][] result = new double[M[0].length][M.length];
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[0].length; j++) {
				result[j][i] = M[i][j];
			}
		}
		return result;
	}
	
	//returns true if the matrix M is symmetric
	public static boolean isSymmetric(double[][] M) {
		
		double[][] transposed = Matrix.transpose(M);
		boolean flag = false;
		
		if(M.length == M[0].length) {
			for(int i = 0; i < M.length; i++) {
				for(int j = 0; j < M[0].length; j++) {
					if(M[i][j] == transposed[i][j])
						flag = true;
				}
			}
		}
		return flag;
	}
	
	 // returns string representation of the matrix M
	public static String toString(double[][] M) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[0].length; j++) {
				sb.append(M[i][j] + " ");
			}
			sb.append("\n");
		}
		
		String str = sb.toString();
		
		return str;
	}
	
	public static void main(String[] args) {
		
		double[][] A = { { 4.0, 3.0 }, { 2.0, 1.0 } };
        double[][] B = { { -0.5, 1.5 }, { 1.0, -2.0 } };
        double[][] result;

        try{
            result = Matrix.multiply(A, B);
            System.out.println(Matrix.toString(result));
        }catch (Exception e){
            System.out.println("Try again");
        }
		
		double[][] C = { { 2.0, -1.0, 3.0}, {-1.0, 0.0, 5.0}, { 3.0, 5.0, 6.0}};
		boolean sym = Matrix.isSymmetric(C);
		System.out.println("Is symmetric? " + sym + "\n");
		
		double[][] D = { { 4.0, 3.0, 2.0 }, { 2.0, 1.0, -2.0 } };
		double[][] DT = Matrix.transpose(D);
		System.out.println(Matrix.toString(DT));
	}
}
