package New_Package;

public class NITCollection {
	private Object[] elementData;
	private int elementCount;
	
	public NITCollection() {
		elementData = new Object[10];
	}
	
	public void add(Object obj) {
		if(size() == capacity()) {
			increaseCapacity();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	
	private void increaseCapacity() {
		Object[] nextArray = new Object[capacity()*2];
		
		for(int i=0; i<elementData.length;i++)  {
			nextArray[i] = elementData[i];
		}
		elementData = nextArray;
	}
	
	public int capacity() {
		return elementData.length;
	}
	
	public int size() {
		return elementCount;
	}
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(elementData);
	}
}
