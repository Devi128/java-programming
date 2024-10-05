class JavaLangExample {
    public static void main(String[] args) {
        
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Objects are equal: " + obj1.equals(obj2));
        
        String str = "Hello, World!";
        System.out.println("String Length: " + str.length());
        System.out.println("Substring: " + str.substring(7, 12));
        
        double num = 16;
        System.out.println("Square root of 16: " + Math.sqrt(num));
        System.out.println("2 raised to the power 3: " + Math.pow(2, 3));
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());
        
        System.out.println("Current time in milliseconds: " + System.currentTimeMillis());
        
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running...");
            }
        });
        thread.start();
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors: " + runtime.availableProcessors());
        System.out.println("Free memory in JVM: " + runtime.freeMemory());
    }
}
