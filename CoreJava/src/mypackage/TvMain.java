package mypackage;

public class TvMain extends Remote implements Tv {

	public static void main(String[] args) {
		Remote r = new Remote();
		r.watching();
//		Remote r1 = new Remote(false, "sun network");
//		r1.watching();
	}
}
