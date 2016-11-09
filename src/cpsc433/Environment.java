/**
 * 
 */
package cpsc433;

import java.util.LinkedHashMap;

/**
 * 
 * <p>Copyright: Copyright (c) 2003, Department of Computer Science, University 
 * of Calgary.  Permission to use, copy, modify, distribute and sell this 
 * software and its documentation for any purpose is hereby granted without 
 * fee, provided that the above copyright notice appear in all copies and that
 * both that copyright notice and this permission notice appear in supporting 
 * documentation.  The Department of Computer Science makes no representations
 * about the suitability of this software for any purpose.  It is provided
 * "as is" without express or implied warranty.</p>
 *
 * @author <a href="http://www.cpsc.ucalgary.ca/~kremer/">Rob Kremer</a>
 *
 */
public class Environment extends PredicateReader /*implements SisyphusPredicates*/ {

	private static Environment instance=null;
	protected boolean fixedAssignments=false;
	private LinkedHashMap<String, Person> people = null;
	
	protected Environment(String name) {
		super(name==null?"theEnvironment":name);
	}
	
	public static Environment get() {
		if (instance==null) instance = new Environment(null);
		return instance;
	}

	// UTILITY PREDICATES
	
	public static String h_exit = "quit the program";
	public void a_exit() {
		System.exit(0);
	}
}
