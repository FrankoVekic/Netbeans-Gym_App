/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.utility;

/**
 *
 */
public class OibValidation {
	
	public static final int NO_ERROR = 0;
	public static final int ERR_INVALID_LENGHT = 1;
	public static final int ERR_INVALID_FORMAT = 2;
	public static final int ERR_INVALID_CONTROL = 3;
	
	private static final int asciiDigitsOffset = '0';	

	public static boolean checkOIB(String oib) {
		return checkOIBState(oib) == NO_ERROR;
	}
	
	public static int checkOIBState(String oib) {
        if (oib.length() != 11) {
            return ERR_INVALID_LENGHT;
        }

        char[] chars = oib.toCharArray();
        
        int a = 10;
        for (int i = 0; i < 10; i++) {
        	char c = chars[i];
        	if (c < '0' || c > '9') {
        		return ERR_INVALID_FORMAT;
        	}
            a = a + (c - asciiDigitsOffset);
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int control = 11 - a;
        control = control % 10;

        if (control != (chars[10] - asciiDigitsOffset)) {
        	return ERR_INVALID_CONTROL;
        }
    	return NO_ERROR;
    }
}
