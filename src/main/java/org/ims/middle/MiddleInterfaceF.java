package org.ims.middle;

import java.util.ArrayList;
import java.util.List;

import org.ims.IMS_WEB.MiddleInterface;
import org.ims.beans.StateAbbrv;
import org.ims.beans.StateAbbrvBean;

public class MiddleInterfaceF {
	private MiddleInterface midI = new MiddleInterface();
	public List<StateAbbrv> printStateAbb(){
		List<StateAbbrv> rList = new ArrayList<>();
		System.out.println(midI.test());
		List<StateAbbrvBean> list = midI.getAllAbbr();
		for(StateAbbrvBean s:list){
			s.getStateName();
			StateAbbrv abbrv = this.castAbbrv(s);
			rList.add(abbrv);
		}
		return rList;
	}
	
	//"Castings"
	private StateAbbrv castAbbrv(StateAbbrvBean s){
		StateAbbrv abbrv = new StateAbbrv();
		abbrv.setArrvId(s.getArrvId());
		abbrv.setStateAbbrv(s.getStateAbbrv());
		abbrv.setStateName(s.getStateName());
//		abbrv.setStateAddressSet(s.getStateAddressSet());
		abbrv.setStateAddressSet(null);
		return abbrv;
	}
}
