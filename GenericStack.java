import java.util.ArrayList;
/**
 * This method returns for saving calculated results if user requests to
 * @author: "Neha Kapil"
 * @date: 8/29/2017
 * @version 1.0.0
 * @GenericStack<E> object is being created as array list
 * @list.size to support sizeable return of array list
 * @push to push result into array list
 * @peek to view result when user request
 * @Override return with stack + list(as a to string)
*/
	public class GenericStack<E> {
		private ArrayList<E> list = new ArrayList<E>();
		
		public int size() {
			return list.size();
		}
		
		public void push (E o) {
			list.add(o);
		}
		
		public E peek() {
			E o = list.get(size()-1);
			return o;
		}
		
		
		@Override
		public String toString() {
			return "stack:" + list.toString();
		}
	
		
}