package main.pl.kuzyyn.powtorka2;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<String> {
	private String positive,negative;
	public CallableTest(String positive, String negative){
		this.positive=positive;
		this.negative=negative;
	}

	@Override
	public String call() throws Exception {
		String message=positive;
		
		for (int i=0;i<5;i++){
			System.out.println("Callable Test: "+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		}
		// TODO Auto-generated method stub
		return message;
	}

}
