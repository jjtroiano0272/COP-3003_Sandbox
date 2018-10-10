/** AUTHOR: JONATHAN TROIANO
 *  ORIGIN DATE: 09/28/2018
 *  UPDATED:
 *
 *  DESCRIPTION:
 * */



// Interfaces have fields that can be adopted by other classes. The use of interfaces
// is that a class can adopt MANY interfaces, not just one (ala parent classes)!

package sample;

import java.lang.Math;

public interface CredentialAssigner {
	boolean isDuplicate;
	double userID;
	
	// Code to assign a randomized ID to every user
	
	
	// Code to check that this ID isn't a duplicate.
}
