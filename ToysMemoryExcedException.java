 class ToysMemoryExcedException extends RuntimeException
 {
	 ToysMemoryExcedException()
	 {
		 System.out.println("Default Constructor");
	 }
	 ToysMemoryExcedException(String message)
	 {
		 super(message);
	 }
 }