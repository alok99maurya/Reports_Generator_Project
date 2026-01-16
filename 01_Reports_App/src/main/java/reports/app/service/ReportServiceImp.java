package reports.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reports.app.entity.CitizenPlan;
import reports.app.repo.CitizenPlanRepo;
import reports.app.request.SearchRequest;

@Service
public class ReportServiceImp implements ReportService {
	
	@Autowired
  private CitizenPlanRepo planRepo;

	@Override
	public List<String> getPlanNames() {
		
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
	
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		
		return planRepo.findAll();
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
