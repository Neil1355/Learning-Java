package DataStructures_Collections;

	class Stack_ 
	{
		int arr[] = new int[5];
		int total=arr.length;
		int top=-1;
	

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack overflow");
			System.exit(1);

		}
		System.out.println("Intersecting" + x);
		arr[++top] = x;

	}

	public int pop() {
	if(isEmpty()) {
	System.out.println("Stack Empty");
	System.exit(1);
}
return arr[top--];

}

public int getsize() {
	return top+1;
	
}

public boolean isEmpty() {
return top==-1;

}

public boolean isFull() {
	return top==total-1;
	
}

public void printstack() {
	for(int i=0;i<=top;i++) {
		System.out.println("arr[i]+"+ arr[i]) ;
				
	}
	System.out.println("");
}
}

public class AL_Generic {
	public static void main(String[] args) {
		Stack_ st = new Stack_();
		st.push(11);
		st.push(23);
		st.push(34);
		st.printstack();
		st.pop();
		st.printstack();
		st.push(55);
		st.push(77);
		st.push(99);
		st.push(44);
		st.printstack();
	}
}