//Lab8 32191826 ¹ÚÁÖÈñ  11/16
import java.util.Iterator;
import java.util.List;

public class DataListAdapter<E> implements DataList<E>{
	private List<E> list;
	public DataListAdapter(List<E> list){
		this.list=list;
	}
	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}
	@Override
	public void add(E e) {
		list.add(e);
	}
	@Override
	public void add(int index, E e) {
		list.add(index, e);
	}
	@Override
	public void remove(int index) {
		list.remove(index);
	}
	@Override
	public E get(int index) {
		return list.get(index);
	}
	@Override
	public int size() {
		return list.size();
	}
	@Override
	public void clear() {
		list.clear();
	}
	@Override
	public void print() {
		for(int i=0;i<size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
