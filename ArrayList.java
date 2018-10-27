public class ArrayList implements List{
	
	public int size;
	public Object data[];
	
	ArrayList(){
		size = 0;
		data = new Object[size];
	}
	
	public void add(Object obj) {
		data[size] = obj;
		size++;
	}
	
	public void add(int pos, Object obj) {
		for(int i = size; i > pos; i--) {
			data[i] = data[i-1];
		}
		data[pos] = obj;
		size++;
	}
	
	public Object get(int pos) {
		if(pos < 0 || pos >= size) {
			System.out.println("Index out of bounds");
		}
		return data[pos]; 
	}
	
	
	public Object remove(int pos) {
		for(int i = pos + 1; i < size; i++) {
			data[i-1] = data[i];
		}
		return size--;
	}
	
	public int size() {
		return size;
	}
}