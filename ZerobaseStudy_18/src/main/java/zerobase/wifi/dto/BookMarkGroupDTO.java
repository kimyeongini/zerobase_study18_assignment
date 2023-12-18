package zerobase.wifi.dto;

public class BookMarkGroupDTO {
	private int id;
	private String name;
	private int sequence;
	private String register_dttm;
	private String update_dttm;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getRegister_dttm() {
		return register_dttm;
	}
	public void setRegister_dttm(String register_dttm) {
		this.register_dttm = register_dttm;
	}
	public String getUpdate_dttm() {
		return update_dttm;
	}
	public void setUpdate_dttm(String update_dttm) {
		this.update_dttm = update_dttm;
	}
	@Override
	public String toString() {
		return "BookMarkGroupDTO [id=" + id + ", name=" + name + ", sequence=" + sequence + ", register_dttm="
				+ register_dttm + ", update_dttm=" + update_dttm + "]";
	}
}
