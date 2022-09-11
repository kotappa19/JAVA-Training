
public class School {
	String principal,Sname;
	int NoofStaffs;
	public School(String principal, String sname) {
		super();
		this.principal = principal;
		Sname = sname;
	}
	public School(String principal, String sname, int noofStaffs) {
		this(principal,sname);
		this.NoofStaffs = noofStaffs;
	}
	public int getNoofStaffs() {
		return NoofStaffs;
	}
	public void setNoofStaffs(int noofStaffs) {
		NoofStaffs = noofStaffs;
	}
	public String getPrincipal() {
		return principal;
	}
	public String getSname() {
		return Sname;
	}
	
}
