package reports.app.request;

import java.time.LocalDate;
import java.util.Objects;

public class SearchRequest {
	
	private String planName;
	private String planStatus;
	private String gender;
	
	private String startDate;
	private String endDate;
	public SearchRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchRequest(String planName, String planStatus, String gender,  String startDate, String endDate) {
		super();
		this.planName = planName;
		this.planStatus = planStatus;
		this.gender = gender;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "SearchRequest [planName=" + planName + ", planStatus=" + planStatus + ", gender=" + gender
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(endDate, gender, planName, planStatus, startDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchRequest other = (SearchRequest) obj;
		return Objects.equals(endDate, other.endDate) && Objects.equals(gender, other.gender)
				&& Objects.equals(planName, other.planName) && Objects.equals(planStatus, other.planStatus)
				&& Objects.equals(startDate, other.startDate);
	}
	
	

}
