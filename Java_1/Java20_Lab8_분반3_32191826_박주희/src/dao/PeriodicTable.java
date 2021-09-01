package dao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import dto.PeriodicElement;
import java.util.stream.Collectors;

public class PeriodicTable implements IPeriodicElementFinder{

	private PeriodicElement[] elements=null;

	// constructor
	public PeriodicTable() {
		this(null);
	}
	
	// constructor
	public PeriodicTable(PeriodicElement[] elements) {
		this.elements = elements;

	} 

	public void Numbersort() {
	      Arrays.sort(elements, PeriodicElement.NumberComparator);
	   }
	
	public void Symbolsort() {
	      Arrays.sort(elements, PeriodicElement.SymbolComparator);
	   }
	
	public void Namesort() {
	      Arrays.sort(elements, PeriodicElement.NameComparator);
	   }
	
	public void Weightsort() {
	      Arrays.sort(elements, PeriodicElement.WeightComparator);
	   }
	
	public void Periodsort() {
	      Arrays.sort(elements, PeriodicElement.PeriodComparator);
	   }
	
	public void Groupsort() {
	      Arrays.sort(elements, PeriodicElement.GroupComparator);
	   }
	
	public void Typesort() {
	      Arrays.sort(elements, PeriodicElement.TypeComparator);
	   }
	
	public void Statesort() {
	      Arrays.sort(elements, PeriodicElement.StateComparator);
	   }

	
	@Override
	public PeriodicElement findElement(Predicate<PeriodicElement> predicate) {
		PeriodicElement p=new PeriodicElement();
		for(PeriodicElement pe:elements)  //foreach문을 이용하여
		{
			if(predicate.test(pe))  //해당 조건에 성립하는 원소를 구하여
				p=pe;  //p에 저장한다
		}
		return p;

	}

	@Override
	public PeriodicElement[] findElements(Predicate<PeriodicElement> predicate) {
		List<PeriodicElement> p2=new ArrayList<>();   //PeriodicElement형 list p2 생성
		for(PeriodicElement pe:elements)   //foreach문을 이용하여
		{
			if(predicate.test(pe))  //해당조건에 성립하는 원소들을
				p2.add(pe);  //p2 list에 추가한다
		}
		PeriodicElement[] array = p2.toArray(new PeriodicElement[p2.size()]);  //list형 p2를 array형으로 바꾸어 array에 저장
		return array;
		
	}

}
