package list.arraylist.implementation;

public class Main {
	public static void main(String[] args) {		
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);

		ArrayList.ListIterator li = numbers.listIterator();
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
		}
		System.out.println(numbers);
		
//		ArrayList.ListIterator li = numbers.listIterator();
//		while(li.hasNext()) {
//			int number = (int)li.next();
//			if(number == 30) {
//				li.add(35);
//			}
//		}
//		System.out.println(numbers);
		
		
		
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.previous());
//		System.out.println(li.hasPrevious());
		
//		반복적인 사용을 위한 객체, Iterator패턴
//		ArrayList.ListIterator li = numbers.listIterator();
//		while(li.hasNext()) {
//		System.out.println(li.next());
//		}
		
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
//		System.out.println(numbers.indexOf(40));	
//		System.out.println(numbers.size());	
//		numbers.removeFirst();
//		numbers.removeLast();
//		numbers.add(1, 15);
//		numbers.addFirst(5);
//		numbers.remove(1);
//		System.out.println(numbers.remove(1));
//		System.out.println(numbers.removeLast());
//		System.out.println(numbers.removeFirst());
//		System.out.println(numbers.get(1));
//		System.out.println(numbers);
	}
}
