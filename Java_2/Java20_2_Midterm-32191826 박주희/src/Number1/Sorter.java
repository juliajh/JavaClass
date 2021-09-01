//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number1;

public class Sorter {
	private Comparator comparator=null;
	
	//Constructor
	public Sorter(Comparator comparator) {
		this.comparator = comparator;
	}
	
	//getter,setter
	public Comparator getComparator() {
		return comparator;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	public void selectionSort(double[] data) {
		int size = data.length;
        int min; //최소값을 가진 데이터의 인덱스 저장 변수
        double temp;
        
        for(int i=0; i<size-1; i++){ // size-1 : 마지막 요소는 자연스럽게 정렬됨
            min = i;
            for(int j=i+1; j<size; j++){
                if(this.comparator.compare(data[min], data[j]) > 0){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }

	}
		
		
	
}
