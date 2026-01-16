package reports.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import reports.app.entity.CitizenPlan;
import reports.app.repo.CitizenPlanRepo;
import reports.app.request.SearchRequest;
import reports.app.service.ReportService;
import reports.app.service.ReportServiceImp;

@Controller
public class ReportsController {

    private final CitizenPlanRepo citizenPlanRepo;

    private final ReportServiceImp reportServiceImp;
	
	@Autowired
	private ReportService service;

    ReportsController(ReportServiceImp reportServiceImp, CitizenPlanRepo citizenPlanRepo) {
        this.reportServiceImp = reportServiceImp;
        this.citizenPlanRepo = citizenPlanRepo;
    }
	
	@PostMapping("/search")
	public String handleSearch(SearchRequest request , Model model) {
	
		 System.out.println(request);
		 List<CitizenPlan> plans= service.search(request);
		 model.addAttribute("planss", plans);
		 init(model);
		return "index";
	}
	
	@GetMapping("/")
	public String indexPage(Model model) 
	
	{
		 init(model);
//		SearchRequest searchObj = new SearchRequest();
//		  model.addAttribute("Search", searchObj);
//		  model.addAttribute("names", service.getPlanNames());
//		  model.addAttribute("status", service.getPlanStatus());
		return "index";
	}
	private void init(Model model) {
		SearchRequest searchObj = new SearchRequest();
		  model.addAttribute("Search", searchObj);
		  model.addAttribute("names", service.getPlanNames());
		  model.addAttribute("status", service.getPlanStatus());
	}

}
