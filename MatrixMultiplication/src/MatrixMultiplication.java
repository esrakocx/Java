
public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		double[][] a = {{4.0, 3.0}, {2.0, 1.0}};
		double[][] b = {{-5.0, 1.5}, {1.0, -2.0}};
		double[][] result = multiply(a, b);
		System.out.print(toString(result));
	}
	
	public static double[][] multiply(double[][] a, double[][] b){
		
		double[][] result = new double[a.length][b[0].length];
		
		if(a[0].length == b.length) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					for(int k = 0; k < b.length; k++)
						result[i][j] +=  a[i][k] * b[k][j];
				}
			}
			return result;
		}
		
		else
			throw new RuntimeException("Illegal matrix dimension.");
	}
	
	public static double[] multiply(double[][] a, double[] u) {
		
		double[] result = new double[u.length];
		
		if(a[0].length == u.length) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					result[i] += a[i][j] * u[i];
				}
			}
			return result;	
		}
		else
			throw new RuntimeException("Illegal matrix dimension.");
	}
	
	public static String toString(double[][] a) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				sb.append(a[i][j] + " ");
			}
			sb.append("\n");
		}
				
		return sb.toString();
	}
}
