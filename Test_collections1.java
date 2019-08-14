package capgemini.collections;

public class Test_collections1 {
	public static void main(String[] args) {
		int _int = 10;
		Integer _intObj = new Integer(10);
		_int = _intObj;// object type is assigned to primitive type...
		_intObj = _int;// primitive type is assigned to object type...
		// before JDK 1.5 - explicit type conversion was needed
		// object type is converted and assigned to primitive type
		_int = _intObj.intValue();
		// Object type is converted and assigned to primitive type
		_intObj = Integer.valueOf(_int);
	}
}
