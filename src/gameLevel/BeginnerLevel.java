package gameLevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다");

	}

	@Override
	public void jump() {
		System.out.println("jump할줄 몰라요");

	}

	@Override
	public void turn() {
		System.out.println("턴 못해요");

	}

	@Override
	public void showLevelMessege() {
		System.out.println("초보자 레벨입니다");

	}

}
