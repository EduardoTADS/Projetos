package model;

public abstract class Matematica {
	
	public static int soma(int num1, int num2)throws Exception{
		if((num1 + num2) > 100) {
			throw new Exception(excecaoMSG()); 
			}
		return  num1 + num2;
	}

	public static int sub(int num1, int num2) throws Exception{
		if((num1-num2) > 100) {
			throw new Exception(excecaoMSG()); 
			}
		return num1 - num2;
	}
	
	public static int mult(int num1, int num2) throws Exception{
		if((num1*num2) > 100) {
			throw new Exception(excecaoMSG()); 
			}
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) throws ArithmeticException, Exception{
		if(num2 == 0) {
			throw new ArithmeticException(divZero()); 
		}
		if((num1/num2) > 100) {
			throw new Exception(excecaoMSG()); 
			}
		return num1 / num2;
	}
	
	
	public static String excecaoMSG(){
		return "EXCEÇÃO RESULTADO MAIOR QUE 100 (CEM)";
	}
	
	public static String divZero(){
		return "EXCEÇÃO DIVISÃO POR 0 (ZERO)";
	}
	
}
