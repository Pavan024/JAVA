package mypackage;

public class Remote implements Tv {
	boolean powerOn;
	String dishConnect;
	String channel;

	Remote() {
		powerOn = false;
		dishConnect = "watch Tv";
	}

	Remote(boolean power, String dishConnect) {
		this.powerOn = power;
		this.dishConnect = dishConnect;
	}

	public boolean isPowerOff() {
		return powerOn;
	}

	@Override
	public void watching() {
		if (isPowerOff()) {
			dishConnect = "sun network";
			channel = "any channel";
			System.out.println("my network is connected to:" + dishConnect);
			System.out.println(channel);
		} else {
			System.out.println("Tv is off");
			powerOn = true;
			watching();
		}

	}

}