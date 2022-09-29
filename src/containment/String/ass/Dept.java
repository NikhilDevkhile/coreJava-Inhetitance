package containment.String.ass;

public class Dept 

{
	private int dipid;
	private String dipname;

	public String getDipname() {
		return dipname;
	}

	public void setDipname(String dipname) {
		this.dipname = dipname;
	}

	public int getDipid() {
		return dipid;
	}

	public void setDipid(int dipid) {
		this.dipid = dipid;
	}

	
	public String toString() {
		return "Dept [dipid=" + dipid + ", dipname=" + dipname + "]";
	}

}
