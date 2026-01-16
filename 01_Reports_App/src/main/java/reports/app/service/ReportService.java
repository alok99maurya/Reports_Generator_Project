package reports.app.service;

import java.util.List;

import reports.app.entity.CitizenPlan;
import reports.app.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	public boolean exportPdf();

}
