import java.util.Scanner;

public class Stack<Item> {
	private Node first; //верхушка стека
	private int N;		//count element
	private class Node{	//вложенный класс 
		Item item;
		Node next;
	}

	public boolean isEmpty() {return first == null;}
	public int size (){return N;}
	public void push (Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public Item pop(){
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	//Тестируем наше приложение
	public static void main(String args[]){
		Stack<String> s = new Stack<String>();
		Scanner in = new Scanner(System.in);
		boolean end;
		end = false;

		do{
			String item = in.next();
			if(!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty()){ System.out.println(s.pop());}
			System.out.println(s.size());
			if(item.equals("q")) end = true;
		}while(!end);
		System.out.println("1111");
		System.out.println("1111");
	}

}