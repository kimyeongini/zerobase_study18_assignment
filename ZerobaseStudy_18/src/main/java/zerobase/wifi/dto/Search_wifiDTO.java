package zerobase.wifi.dto;

public class Search_wifiDTO {
	
	private int id;
	private String lat;
	private String lnt;
	private String searchDttm;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLnt() {
		return lnt;
	}
	public void setLnt(String lnt) {
		this.lnt = lnt;
	}
	public String getSearchDttm() {
		return searchDttm;
	}
	public void setSearchDttm(String searchDttm) {
		this.searchDttm = searchDttm;
	}
	@Override
	public String toString() {
		return "Search_wifiDTO [id=" + id + ", lat=" + lat + ", lnt=" + lnt + ", searchDttm=" + searchDttm + "]";
	}

}
