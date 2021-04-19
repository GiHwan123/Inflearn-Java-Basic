package ver2_lec05.fileIO05.training02;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Calendar;

public class IOManyFunction16 {
	
	public static void main(String[] args) {
		
		
		try {
			
			PipedInputStream pis = new PipedInputStream();
			PipedOutputStream pos = new PipedOutputStream(pis);
			
			Thread thread1 = new Thread() {
				public void run() {
					try {
						while(true) {
							try {
								Thread.sleep(1000);
							}catch (Exception e) {
								e.printStackTrace();
								// TODO: handle exception
							}
							String time = Calendar.getInstance().getTime().toString();
							pos.write(time.getBytes());
						}
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			};
			thread1.start();
			
			Thread thread2 = new Thread() {
				public void run() {
					byte[] byteBowl = new byte[1024];
					while(true) {
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
							// TODO: handle exception
						}
						
						try {
							int read = pis.read(byteBowl);
							System.out.println(new String(byteBowl, 0, read));
						} catch (Exception e) {
							e.printStackTrace();
							// TODO: handle exception
						}
					}
				}
			};
			thread2.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
