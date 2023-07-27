package HeirarchicalInheritance;

public class Tiramisu extends Android
{
   public Tiramisu(String brand, String slottype) {
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
	return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
}

public Tiramisu(String brand, String slottype, int version) {
	super(brand, slottype);
	this.version = version;
}
   
   
}
