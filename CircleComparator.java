package nov;

public class CircleComparator implements Comparable<CircleComparator> {
	private int radius;
	int x;
	public CircleComparator(int x) {
		this.x = x;
	}
	@Override
	public int compareTo(CircleComparator o) {
		// TODO Auto-generated method stub
		return this.x - o.radius;
	}
	
	public String toString() {
		return "Radius " + x;
	}

}