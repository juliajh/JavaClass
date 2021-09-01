
import java.util.Arrays;

public class PeriodicTable {
	private PeriodicElement[] elements = null;

	// constructor
	public PeriodicTable() {
		this(null);
	}
	
	// constructor
	public PeriodicTable(PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getter & setter
	public PeriodicElement[] getElements() {
		return elements;
	}

	public void setElements(PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getCurrent(int index)
	public PeriodicElement get(int index) {
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
	}

	// getPrevious
	public PeriodicElement getPrevious(int index) {
		return get(--index);
	}

	// getNext
	public PeriodicElement getNext(int index) {
		return get(++index);
	}

	//find by Element -> PeriodicElement
	public PeriodicElement find(Element e) {
		for(PeriodicElement pe : this.elements) {
			if(e != null && pe != null && pe.getNumber() == e.getValue())
				return pe;
		}
		return null;
	}

	// find by Symbol -> PeriodicElement
	public PeriodicElement find(String symbol) {
		PeriodicElement result = null;
		for (PeriodicElement pe : this.elements) {
			if (symbol != null && pe != null && pe.getSymbol().equals(symbol)) {
				result = pe;
				break;
			}
		}
		return result;
	}
	
	// find by Number -> PeriodicElement
	public PeriodicElement find(int number) {
		PeriodicElement result = null;
		for (PeriodicElement pe : this.elements) {
			if (pe != null && pe.getNumber() == number) {
				result = pe;
				break;
			}
		}
		return result;
	}

	// find by State -> PeriodicElement[]
	public PeriodicElement[] find(State state) {
		int count = 0;
		//해당 state에 해당하는 원소의 갯수 count를 셈
		for (PeriodicElement pe : this.elements) {
			if (pe != null && pe.getState().equals(state)) //pe가 null이 아니고 pe의 state가 입력받은 state와 같다면 
			{ 
				count++;
			}
		}
		PeriodicElement[] result = new PeriodicElement[count]; //count크기만큼만을 result 크기로 설정
		count = 0;
		for (PeriodicElement pe : this.elements) {
			if (pe != null && pe.getState().equals(state)) //pe가 null이 아니고 pe의 state가 입력받은 state와 같다면 
			{
				result[count++] = pe;
			}
		}
		return result;
	}
	
	//해당 인덱스에 다른 화학 원소로 바꿈
	public void set(int index,PeriodicElement pe)
	{
		elements[index]=pe;
	}
	
	
	@Override
	public String toString() {
		return "PeriodicTable [elements=" + Arrays.toString(elements) + "]";
	}

	public void print() {
		for (PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}

	
	
}
