package template;

public abstract class Car {

		public abstract void drive();
		public abstract void stop();
		
		public abstract void wiper();
		
		public void washCar() {}
		
		public void startCar() {
			System.out.println("�õ��� �մϴ�");
		}
		
		public void turnoff() {
			System.out.println("�õ��� ���ϴ�");
		}
		
		
		
		public final void run() {
			startCar();
			drive();
			wiper();
			stop();
			washCar();
			turnoff();
		}
		
}
