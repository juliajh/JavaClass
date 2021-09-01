//Lab8 32191826 박주희  11/16
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray<E> implements DataList<E>{
	private static final int CAPACITY=10;
	private int size=0;  //원소가 들어있는 원소의 크기
	private int capacity=CAPACITY;  //배열의 크기
	private E[] data=null;
	
	//constructor
	public DynamicArray() {
		this(CAPACITY);
	}
	
	public DynamicArray(int capacity) {
		this.capacity=capacity;
		this.data=(E[])new Object[capacity];  //capacity 크기의 E[]배열 생성 및 저장
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
		if(this.size<this.capacity) {  //size보다 capacity가 크다면
			this.data[size]=e;  //마지막 원소 뒤에 추가
			this.size++;
		}
		else {  //아니라면
			this.size++; 
			this.capacity++;  //배열 자체에 공간을 ++
			copy(e,this.capacity);  //copy 메소드를 이용하여 복사 후 마지막에 e 추가
			System.out.println("dynamically increase array size= "+size);
		}
	}

	//insert element at the index
	@Override
	public void add(int index, E e) {
		if(index==size) {   //index와 array의 size가 같다면
			add(e);   //뒤에 추가
		}
		else if(index>size) {   //index가 array의 size보다 크다면
			System.out.println("ArrayIndexOutOfBoundsException error"); //error
		}
		else {  //index가 array의 size보다 작다면
			this.size++;
			this.capacity++;
			copy(index,e,this.capacity);  //copy 메소드를 이용하여 index에 삽입
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
		E[] newData=(E[])new Object[CAPACITY];  //capacity의 크기의 배열로 초기화
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
		
		//다음 데이터가 있는지 boolean으로 반환
		@Override
		public boolean hasNext() {
			if(index<size)
				return true;
			else {
				index=0;
				return false;
			}
					
		}

		//다음 요소 반환
		@Override
		public E next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			return get(index++);  
		}
		
		//데이터 삭제
		public void remove() {
			if((index>0)||(index<=DynamicArray.this.capacity))
				DynamicArray.this.remove(--index); 
			else if(index==0)
				DynamicArray.this.remove(index);
		}

	}
	
	//inner class 객체 생성
	@Override
	public Iterator<E> iterator(){
		return new DynamicArrayIterator();
	}

}
