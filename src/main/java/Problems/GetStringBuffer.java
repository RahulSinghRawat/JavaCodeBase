package Problems;

public class GetStringBuffer {

	private static StringBuffer instance;
	
	private GetStringBuffer(){
		
	}
	
	public static StringBuffer getStringBuffer() {
		
		if(instance == null) {
			synchronized (GetStringBuffer.class) {
				if(instance == null) {
					instance = new StringBuffer();
				}
			}
		}
		return instance;
		
	}
}
