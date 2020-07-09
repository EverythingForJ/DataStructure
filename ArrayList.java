package list.arraylist.implementation;

public class ArrayList {
	private int size = 0; // ��� �����Ͱ� ����Ʈ�� ����ִ���
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
	// toString()�� �����ϸ� ��ü�� ���ڷ� ����ϵ��� ��ӵǾ��ִ�.
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
	// Ư���� ��ġ�� �����͸� ������ �����´�.
	// arraylist�� ����
	public Object get(int index) {
		return elementData[index];
	}
	// ���� size�޼ҵ带 ����� ������ �ܺο��� size�� ���� ���ϵ����ϱ� ����.
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
	}
}
