
public class Sorter<E> {
	private Comparator<E> comparator=null;

	//Constructor
	public Sorter(Comparator<E> comparator) {
		this.comparator = comparator;
	}

	//getter,setter
	public Comparator<E> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
	public void bubbleSort(E[] data) {
		//이중 반복문을 이용
		//입력받은 배열의 값을 비교하여 순서 재정비
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(this.comparator.compare(data[j], data[j+1]) > 0) { 
					  E temp = data[j];
					  data[j]=data[j+1];
					  data[j+1]=temp;
				}
			}
		}
	}
	

}
