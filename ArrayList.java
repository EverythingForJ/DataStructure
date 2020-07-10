package list.arraylist.implementation;

public class ArrayList {
	private int size = 0; // 몇개의 데이터가 리스트에 들어있는지
	private Object[] elementData = new Object[100];

	public boolean addFirst(Object element) {
		if(size<100) {
			return add(0, element);
		} else {
			return false;
		}
	}
	public boolean addLast(Object element) {
		if(size<100) {
			elementData[size] = element;
			size++;
			return true;
		} else {
			return false; 
		}
	}
	public boolean add(int index, Object element)
	{
		if(size<100) {
			for(int i=size-1; i>=index; i--) {
				elementData[i+1] = elementData[i];
			}
			elementData[index] = element;	
			size++;
			return true;
		} else {
			return false;
		}
	}
	// toString()을 구현하면 객체를 문자로 출력하도록 약속되어있다.
	public String toString() {
		String str = "[";
		for(int i=0; i<size; i++) {
			str += elementData[i];
			if (i<size-1) {
				str += ",";	
			}
		}
		return str + "]";
	}
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i=index+1; i<=size-1; i++) {
		elementData[i-1] = elementData[i];
		}
		elementData[size-1] = null;
		size--;
		return removed;
	}
	public Object removeFirst() {
		return remove(0);	
	}
	public Object removeLast() {
		return remove(size-1);	
	}
	// 특정한 위치의 데이터를 빠르게 가져온다.
	// arraylist의 장점
	public Object get(int index) {
		return elementData[index];
	}
	// 굳이 size메소드를 만드는 이유는 외부에서 size를 접근 못하도록하기 위함.
	public int size() {
		return size;
	}
	public int indexOf(Object o) {
		for(int i=0; i<size; i++) {
			if(o.equals(elementData[i])) {
			return i;
			}
		}
		return -1;
	}
	public ListIterator listIterator() {
		return new ListIterator();
	}

	class ListIterator {
		private int nextIndex = 0;
		public boolean hasNext() {
			return nextIndex < size();
		}
		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;
//			return returnData;
			return elementData[nextIndex++];
		}
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		public Object previous() {
			return elementData[--nextIndex];
		}
		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
}
