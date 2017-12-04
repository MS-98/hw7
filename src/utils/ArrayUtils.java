package utils;

public class ArrayUtils {
	public static void reverse(int[] a) {
	    for (int left = 0, right = a.length - 1; left < right; left++, right--) {
	        int num = a[left];
	        a[left]  = a[right];
	        a[right] = num;
	    }
	}

    public static String stringifyArray(int[] a) {
        String stringArr = "";
        for(int i = 0; i < a.length; i++) {	
        	if(i!=a.length-1) {
            stringArr = stringArr + a[i] + ',';
        	}
        	else {
        		stringArr= stringArr + a[i];
        		}
        	}
        return stringArr;
    }
}
