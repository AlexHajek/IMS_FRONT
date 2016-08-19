package org.ims.middle;

import java.util.List;

import org.ims.beans.StateAbbrv;

public class App {
	public static void main(String[] args) {
		MiddleInterfaceF midF = new MiddleInterfaceF();
		List<StateAbbrv> rList =midF.printStateAbb();
		for(StateAbbrv s:rList){
			System.out.println(s.getStateAbbrv());
		}
	}
}
