package utils;

public class Math {
	public static int factorial(int a){
        if(a <= 1){
        	return 1;
        	}
        return a * factorial(a - 1);
    }
	
    public static int factorialLoop(int a)
    {
        int num = 1;
        if(a <= 0){
        return num;
        }
        for(int i = 1; i <= a; i++){
            num = num * i;
        }
        return num;
    }

}
