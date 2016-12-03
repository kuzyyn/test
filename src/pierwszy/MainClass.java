package pierwszy;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class MainClass {

	static boolean  stopWaiting = false;
	enum Zwierze {kot,pies};
	private final static char NUL = (char)0; // null message
	private final static char STX = (char)2; // Start of text
	private final static char ETX = (char)3; // end of text
	private final static char BBC = (char)62; // end of text
	
	private ExecutorService pool ;
	
	private void setupExecutor(){
		pool = Executors.newSingleThreadExecutor();
	}
	public static void main(String[] args) {

	MainClass mc = new MainClass();
	mc.setupExecutor();
	CallableTest callable = new CallableTest("ACK","NAK");
	
	
	Future task1 = mc.pool.submit(callable);
	System.out.println("task1 czy pracuje: "+task1.isDone());
	try {
		String message = (String) task1.get(4, TimeUnit.SECONDS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TimeoutException e) {
		System.out.println("OPS timeout");
		e.printStackTrace();
	}
	System.out.println("task1 czy pracuje: "+task1.isDone());
	if (task1.isDone()){
		System.out.println("Jestem w if");
	}
		
		
	/*String message = STX+"uyjjjRG"+ ETX;
	char BBC =  (char)mc.getBBC(message);
	message += BBC;
	System.out.println(mc.isControlMessage(message));
	
	System.out.println("Przed timerem");
	mc.waitForMessage();
	while(!stopWaiting){
		System.out.println("xxx");
		/*try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println("przerwano");
		}*/
	}
	
	/*
	System.out.println("Po timerze");

	}
	public void waitForMessage(){
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			int n=0;
			@Override
			public void run() {
				System.out.println("w timerze no " +n);
					if (++n==5){	
						
						timer.cancel();
						stopWaiting=true;
						System.out.println("Za cancel");
					}			
				}
			
			
		}, 0,1000);
	}
	
	
	private boolean isControlMessage(String lastMessage) {
		boolean isControl = false;
		if (hasGoodFormat(lastMessage) && hasGoodBBC(lastMessage)) {
			String message = lastMessage.substring(1, lastMessage.length()-2);
			System.out.println("IC ascii message  "+getASCII(message));
			
			String pattern = "([IASXJRa-z0-9])+G{1}$";
			
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(message);
			isControl = m.matches();
		}
		if (!isControl) {
			System.out.println("not control message");
		}
		return isControl;
	}
	private boolean hasGoodFormat(String fullMessage){
		boolean formatGood = false;
		if (fullMessage.length() >=3){
			System.out.println("HGF ascii fullMessage "+getASCII(fullMessage));
			String message = fullMessage.substring(0, fullMessage.length()-1);
			System.out.println("HGF ascii message " + getASCII(message));
			String pattern = "^\u0002{1}.{1,255}\u0003$";
			
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(message);
			formatGood = m.matches();
		}
		System.out.println("HGF formatGood: " + formatGood);
		return formatGood;
	}
	private int getBBC(String fullMessage){
		int BBCcount = -1;
		if (fullMessage.length()>=3){
			
			BBCcount = fullMessage.charAt(1);
			for (int i = 2; i<fullMessage.length();i++){
					BBCcount = (BBCcount ^ fullMessage.charAt(i));	
			}
		}
		System.out.println("bbc counted: " + BBCcount);
		return BBCcount;
		
	}
	private  boolean hasGoodBBC(String fullMessage) {
		
		int BBCcount=-1;
		int BBCreceived=-2;
		if (fullMessage.length() >=3){				
			System.out.println("HGBBC ascii fullMessage "+getASCII(fullMessage));
			BBCreceived = fullMessage.charAt(fullMessage.length()-1);
			String message = fullMessage.substring(0, fullMessage.length()-1);
			
			BBCcount = message.charAt(1);
			for (int i = 2; i<message.length();i++){
					BBCcount = (BBCcount ^ message.charAt(i));	
					
			}
			
		}
		System.out.println("bbc received: " + BBCreceived + " and BBC counted: "+BBCcount);
		if (BBCcount == BBCreceived){
			return true;
		} else {
			return false;
		}

	}

		private String getASCII(String fullMessage) {
				String asciiMessage="";
				int ascii;
				for (int i = 0; i<fullMessage.length();i++){
					ascii = (int)fullMessage.charAt(i);
					asciiMessage+= ascii + " "; 
				}
			return asciiMessage;
			}
*/
}
