package ver2_lec02;

public class ProgramInterfaceImpl implements ProgramInterface{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 시작합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 멈춥니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 실행합니다.");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("프로그램실행을 멈춥니다.");
	}

	
}
