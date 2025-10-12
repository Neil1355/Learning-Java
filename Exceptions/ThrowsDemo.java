class ThrowsDemo {
	static void ThrowOne() throws IllegalAccessException {
		System.out.println("Inside ThrowOne.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {
		try {
			ThrowOne();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		
		}
	}
}
