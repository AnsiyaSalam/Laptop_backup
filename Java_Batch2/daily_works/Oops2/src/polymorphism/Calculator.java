package polymorphism;

public class Calculator {
	
	public int add(int value1,int value2)
	{
		return value1+value2;
	}
	
	//Overloaded method
	//Same method name but different set of parameters
	
	public float add(float value1, float value2)
	{
		return value1+value2;
	}

}
