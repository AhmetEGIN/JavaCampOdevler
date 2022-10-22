package MemoryLeak;



public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(0);
		stack.push(1);
		System.out.println("------------------");
		Object result = stack.pop();
		System.out.println(result);
		System.out.println("------------");
		stack.push(2);
		stack.push(3);
		Object result2 = stack.pop();
		System.out.println(result2);
		
		
	}

}
