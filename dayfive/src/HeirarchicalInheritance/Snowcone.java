package HeirarchicalInheritance;
// child class to 
public class Snowcone extends Android
{

	public Snowcone(String brand, String slottype) {
		super(brand, slottype);
		// TODO Auto-generated constructor stub
	}
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Snowcone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	public Snowcone(String brand, String slottype, int version) {
		super(brand, slottype);
		this.version = version;
	}
}
