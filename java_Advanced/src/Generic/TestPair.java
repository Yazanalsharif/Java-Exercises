package Generic;

public class TestPair{
 public static void main(String args []) {
	 // i can delete <Integer, Integer> but will display warning it must parameterized
	 Pair  <Integer, Integer>pair = new Pair<Integer, Integer> ();
	 Pair <Integer, Integer> pair1 = new Pair <Integer, Integer> ();
	 pair.setValue(10);
	 pair.setKey(10);
	 pair1.setValue(10);
	 pair1.setKey(10);
	 System.out.print(compare(pair, pair1));
	 
 }
 public static <K, G> boolean compare(Pair<K, G>  b1, Pair<K, G> b2) {
	 return b1.getValue().equals(b2.getValue()) && b1.getKey().equals(b2.getKey());
 }
}
