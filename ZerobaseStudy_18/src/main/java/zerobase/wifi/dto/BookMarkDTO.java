 package zerobase.wifi.dto;



public class BookMarkDTO {
	private int id;
	private int groupNo;
	private String mgrNo;
	private String register_dttms;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	public String getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}
	public String getRegister_dttms() {
		return register_dttms;
	}
	public void setRegister_dttms(String register_dttms) {
		this.register_dttms = register_dttms;
	}
	@Override
	public String toString() {
		return "BookMarkDTO [id=" + id + ", groupNo=" + groupNo + ", mgrNo=" + mgrNo + ", register_dttms="
				+ register_dttms + "]";
	}
}
