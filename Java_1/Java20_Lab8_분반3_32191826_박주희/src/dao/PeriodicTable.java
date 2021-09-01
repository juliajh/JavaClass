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
		for(PeriodicElement pe:elements)  //foreach���� �̿��Ͽ�
		{
			if(predicate.test(pe))  //�ش� ���ǿ� �����ϴ� ���Ҹ� ���Ͽ�
				p=pe;  //p�� �����Ѵ�
		}
		return p;

	}

	@Override
	public PeriodicElement[] findElements(Predicate<PeriodicElement> predicate) {
		List<PeriodicElement> p2=new ArrayList<>();   //PeriodicElement�� list p2 ����
		for(PeriodicElement pe:elements)   //foreach���� �̿��Ͽ�
		{
			if(predicate.test(pe))  //�ش����ǿ� �����ϴ� ���ҵ���
				p2.add(pe);  //p2 list�� �߰��Ѵ�
		}
		PeriodicElement[] array = p2.toArray(new PeriodicElement[p2.size()]);  //list�� p2�� array������ �ٲپ� array�� ����
		return array;
		
	}

}
