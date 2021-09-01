//Lab8 32191826 ������  11/16
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray<E> implements DataList<E>{
	private static final int CAPACITY=10;
	private int size=0;  //���Ұ� ����ִ� ������ ũ��
	private int capacity=CAPACITY;  //�迭�� ũ��
	private E[] data=null;
	
	//constructor
	public DynamicArray() {
		this(CAPACITY);
	}
	
	public DynamicArray(int capacity) {
		this.capacity=capacity;
		this.data=(E[])new Object[capacity];  //capacity ũ���� E[]�迭 ���� �� ����
	}

	//increase array size&copy all data
	public void copy(E e,int newCapacity) {
		E[] newData=(E[])new Object[newCapacity];
		//copy before new Capacity-1
		for(int i=0;i<newCapacity-1;i++) {
			newData[i]=this.data[i];
		}
		newData[newCapacity-1]=e;
		this.data=newData;
	}
	
	//increase array size & copy data before and after the index
	public void copy(int index,E e, int newCapacity) {
		E[] newData=(E[])new Object[newCapacity+1];
		for(int i=0;i<index;i++) {
			newData[i]=this.data[i];
		}
		newData[index]=e;
		for(int i=index+1;i<newCapacity;i++) {
			newData[i]=this.data[i-1];
		}
		this.data=newData;
	}

	//add element to the dynamic array
	@Override
	public void add(E e) {   
		if(this.size<this.capacity) {  //size���� capacity�� ũ�ٸ�
			this.data[size]=e;  //������ ���� �ڿ� �߰�
			this.size++;
		}
		else {  //�ƴ϶��
			this.size++; 
			this.capacity++;  //�迭 ��ü�� ������ ++
			copy(e,this.capacity);  //copy �޼ҵ带 �̿��Ͽ� ���� �� �������� e �߰�
			System.out.println("dynamically increase array size= "+size);
		}
	}

	//insert element at the index
	@Override
	public void add(int index, E e) {
		if(index==size) {   //index�� array�� size�� ���ٸ�
			add(e);   //�ڿ� �߰�
		}
		else if(index>size) {   //index�� array�� size���� ũ�ٸ�
			System.out.println("ArrayIndexOutOfBoundsException error"); //error
		}
		else {  //index�� array�� size���� �۴ٸ�
			this.size++;
			this.capacity++;
			copy(index,e,this.capacity);  //copy �޼ҵ带 �̿��Ͽ� index�� ����
		}
		
	}

	//remove element at the index
	@Override
	public void remove(int index) {
		if((index<0)||(index>=this.size)) {
			System.out.println("Error. cannot remove due to index out of bounds");
		}
		else {
			for(int i=index;i<size-1;i++) {
				this.data[i]=this.data[i+1];
				
			}
			this.size--;
			this.data[size]=null;
		}
	}

	//get element at the index
	@Override
	public E get(int index) {
		if(index>=0&&index<this.size) {
			return data[index];
		}
		return null;
	}

	//get the size of dynamic array(# of elements)
	@Override
	public int size() {
		return this.size;		
	}

	//remove all elements and reset
	@Override
	public void clear() {
		for(int i=0;i<this.size()-1;i++) {
			remove(i);
		}
		size=0;
		capacity=CAPACITY;
		E[] newData=(E[])new Object[CAPACITY];  //capacity�� ũ���� �迭�� �ʱ�ȭ
	}

	//print all elements in the dynamic array
	@Override
	public void print() {
		for(int i=0;i<size();i++)
		{
			System.out.println(data[i]);
		}
	}
	
	//inner class
	public class DynamicArrayIterator implements Iterator<E> {
		private int index=0;
		
		//���� �����Ͱ� �ִ��� boolean���� ��ȯ
		@Override
		public boolean hasNext() {
			if(index<size)
				return true;
			else {
				index=0;
				return false;
			}
					
		}

		//���� ��� ��ȯ
		@Override
		public E next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			return get(index++);  
		}
		
		//������ ����
		public void remove() {
			if((index>0)||(index<=DynamicArray.this.capacity))
				DynamicArray.this.remove(--index); 
			else if(index==0)
				DynamicArray.this.remove(index);
		}

	}
	
	//inner class ��ü ����
	@Override
	public Iterator<E> iterator(){
		return new DynamicArrayIterator();
	}

}
