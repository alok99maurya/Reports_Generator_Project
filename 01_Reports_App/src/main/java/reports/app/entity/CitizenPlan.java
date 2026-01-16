package reports.app.entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CITIZEN_PLANS_INFO")
public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benifitAnt;
	private String denialReason;
	private  LocalDate terminateDate;
	private String terminiationReason;
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Double getBenifitAnt() {
		return benifitAnt;
	}
	public void setBenifitAnt(Double benifitAnt) {
		this.benifitAnt = benifitAnt;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public LocalDate getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(LocalDate terminateDate) {
		this.terminateDate = terminateDate;
	}
	public String getTerminiationReason() {
		return terminiationReason;
	}
	public void setTerminiationReason(String terminiationReason) {
		this.terminiationReason = terminiationReason;
	}
	public CitizenPlan(Integer citizenId, String citizenName, String gender, String planName, String planStatus,
			LocalDate planStartDate, LocalDate planEndDate, Double benifitAnt, String denialReason,
			LocalDate terminateDate, String terminiationReason) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.gender = gender;
		this.planName = planName;
		this.planStatus = planStatus;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.benifitAnt = benifitAnt;
		this.denialReason = denialReason;
		this.terminateDate = terminateDate;
		this.terminiationReason = terminiationReason;
	}
	@Override
	public String toString() {
		return "CitizenPlan [citizenId=" + citizenId + ", citizenName=" + citizenName + ", gender=" + gender
				+ ", planName=" + planName + ", planStatus=" + planStatus + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + ", benifitAnt=" + benifitAnt + ", denialReason=" + denialReason
				+ ", terminateDate=" + terminateDate + ", terminiationReason=" + terminiationReason + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(benifitAnt, citizenId, citizenName, denialReason, gender, planEndDate, planName,
				planStartDate, planStatus, terminateDate, terminiationReason);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CitizenPlan other = (CitizenPlan) obj;
		return Objects.equals(benifitAnt, other.benifitAnt) && Objects.equals(citizenId, other.citizenId)
				&& Objects.equals(citizenName, other.citizenName) && Objects.equals(denialReason, other.denialReason)
				&& Objects.equals(gender, other.gender) && Objects.equals(planEndDate, other.planEndDate)
				&& Objects.equals(planName, other.planName) && Objects.equals(planStartDate, other.planStartDate)
				&& Objects.equals(planStatus, other.planStatus) && Objects.equals(terminateDate, other.terminateDate)
				&& Objects.equals(terminiationReason, other.terminiationReason);
	}
	public CitizenPlan() {
		super();
	
	}
	
	
	

}
