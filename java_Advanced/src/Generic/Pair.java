package Generic;

public class Pair <K, V> {
	private K key;
	private V value;
	public Pair (K key, V value) {
		this.key = key;
		this.value = value;
	}
	public Pair() {
		
	}
	//method set
	public void setValue(V value) {
		this.value = value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	//method get
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	

}
