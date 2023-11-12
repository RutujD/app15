package app15.com.test;

public class ActAsDeputyManager2 {
	 public static void main(String[] args) {
	        Management deputyManager = () -> System.out.println("係長代理です。");
	        deputyManager.manage();
	    }
}
