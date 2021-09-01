//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number1;

public class MainTest {
	private static double[] numbers= {-20.5,-87.3,12.3, 2.5, -5.7, 65.4};

	public static void printdoubles(double[] numbers){
		for(double n:numbers) {
			System.out.println(n);
		}
	}
		
	public static void main(String[] args) {
		Sorter sortnum=new Sorter(new NumberComparator());
		Sorter sortabsnum=new Sorter(new AbsNumberComparator());
		MinMaxFinder minmaxfind=new MinMaxFinder(numbers);
		
		System.out.println("\nsort by num");
		sortnum.selectionSort(numbers);
		printdoubles(numbers);
		
		System.out.println("\nsort by absnum");
		sortabsnum.selectionSort(numbers);
		printdoubles(numbers);
		
		
		System.out.println("\nmax&min");
		System.out.println("max="+minmaxfind.getMax());
		System.out.println("min="+minmaxfind.getMin());
		
	}

}
