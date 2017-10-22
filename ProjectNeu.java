package se_02;

public class ProjectNeu {
	
	
	
	public ProjectNeu (int[][] iseq) {
		
		int[][] prio = iseq;
		
	}
	
	public boolean isWellSorted(int[] iseq) {
		
		if(iseq.length>2) {
			if(iseq[0] == 1 && iseq[1] == 2 && iseq[2] == 3 || iseq[0] == 2 && iseq[1] == 1 && iseq[2] == 3) {
				return true;
				
			} else {return false;}
		}else {return false;}
	}
	
}