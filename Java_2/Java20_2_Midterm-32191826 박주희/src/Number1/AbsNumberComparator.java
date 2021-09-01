//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number1;

public class AbsNumberComparator implements Comparator {

	@Override
	public int compare(double o1, double o2) {
		if(Math.abs(o1)>Math.abs(o2))
			return 1;
		else if(Math.abs(o1)<Math.abs(o2))
			return -1;
		else
			return 0;
	}

}
