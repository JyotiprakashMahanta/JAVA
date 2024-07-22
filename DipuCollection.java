class DipuCollection 
{
	private Object[] objArray=new Object[5];
	private int elementCount=0;
	public void add(Object obj)
	{
		if(elementCount==objArray.length)
		{
			increaseCapacity();
		}
		objArray[elementCount]=obj;
		elementCount++;
	}
	public void increaseCapacity()
	{
		int newCapacity=objArray.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<objArray.length;i++)
		{
			nextArray[i]=objArray[i];
		}
		objArray=nextArray;
	}
	public int Capacity()
	{
			return objArray.length;
	}
	public int Size()
	{
		return elementCount;
	}
	public Object get(int index)
	{
		if (index<0 || index>=Size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		return objArray[index];
	}
	public void replace(int index,Object obj)
	{
		if (index<0 || index>Size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		objArray[index]=obj;
	}
	public void remove(int index)
	{
		if (index<0 || index>Size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		while (index<Size()-1)
		{
			objArray[index]=objArray[index+1];
		} index++;
	}
	
}