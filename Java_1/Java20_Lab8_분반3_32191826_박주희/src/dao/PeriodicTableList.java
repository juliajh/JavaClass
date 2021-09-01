package dao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dto.PeriodicElement;

public class PeriodicTableList implements IPeriodicElementFinder {

	private List<PeriodicElement> elements=null;
	
	// constructor
	public PeriodicTableList() {
		super();
	}
	
	// constructor
	public PeriodicTableList(List<PeriodicElement> elements) {
		this.elements = elements;
	}

	public void Numbersort() {
	      Collections.sort(elements, PeriodicElement.NumberComparator);
	   }
	
	public void Symbolsort() {
	      Collections.sort(elements, PeriodicElement.SymbolComparator);
	   }
	
	public void Namesort() {
	      Collections.sort(elements, PeriodicElement.NameComparator);
	   }
	
	public void Weightsort() {
	      Collections.sort(elements, PeriodicElement.WeightComparator);
	   }
	
	public void Periodsort() {
	      Collections.sort(elements, PeriodicElement.PeriodComparator);
	   }
	
	public void Groupsort() {
	      Collections.sort(elements, PeriodicElement.GroupComparator);
	   }
	
	public void Typesort() {
	      Collections.sort(elements, PeriodicElement.TypeComparator);
	   }
	
	public void Statesort() {
	      Collections.sort(elements, PeriodicElement.StateComparator);
	   }

	
	@Override
	public PeriodicElement findElement(Predicate<PeriodicElement> predicate) {
		PeriodicElement p=new PeriodicElement();
		for(PeriodicElement pe:elements)
		{
			if(predicate.test(pe))
				p=pe;
		}
		return p;
		

	}

	@Override
	public PeriodicElement[] findElements(Predicate<PeriodicElement> predicate) {
		List<PeriodicElement> p2=new ArrayList<>();
		for(PeriodicElement pe:elements)
		{
			if(predicate.test(pe))
				p2.add(pe);
		}
		PeriodicElement[] array = p2.toArray(new PeriodicElement[p2.size()]);
		return array;
	}
}
