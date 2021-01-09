package dataStructures;
/*
 * Object class for testing data strucures
 */
public class TestObject {
	
	private int testField1;
	private int testField2;
	
	public TestObject(int value1, int value2) {
		this.testField1 = value1;
		this.testField2 = value2;
	}
	
	// GET AND SET METHODS
	public int getTestField1() {
		return testField1;
	}
	public void setTestField1(int testField1) {
		this.testField1 = testField1;
	}
	public int getTestField2() {
		return testField2;
	}
	public void setTestField2(int testField2) {
		this.testField2 = testField2;
	}
	
	@Override
	public String toString() {
		return "TestObjects [testField1=" + testField1 + ", testField2=" + testField2 + "]";
	}
}
