package reports.app.run;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import reports.app.entity.CitizenPlan;
import reports.app.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//cash plan 
		repo.deleteAll();
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("John");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAnt(5000.00);
				
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");   // changed here
		c2.setDenialReason("He has rental income thats why denied cash paln ");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("cathy");
		c3.setGender("FeMale");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenifitAnt(0.00);
		c3.setTerminateDate(LocalDate.now());
		c3.setTerminiationReason("Employed ..");
	
		
		// Food plan
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Alex");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAnt(3000.00);


		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Robert");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Already receiving food benefits from another scheme");


		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("David");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(2));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenifitAnt(0.00);
		c6.setTerminateDate(LocalDate.now());
		c6.setTerminiationReason("Not eligible as per new policy");
		
		// Medical plan
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Rahul");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(12));
		c7.setBenifitAnt(8000.00);


		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Anita");   // Female citizen
		c8.setGender("Female");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Already covered under private medical insurance");


		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Suresh");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(5));
		c9.setPlanEndDate(LocalDate.now().plusMonths(12));
		c9.setBenifitAnt(0.00);
		c9.setTerminateDate(LocalDate.now());
		c9.setTerminiationReason("Policy violation detected");
		
		// Employment plan
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Ramesh");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(9));
		c10.setBenifitAnt(6000.00);


		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Neha");   // Female citizen
		c11.setGender("Female");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Already employed in private sector");


		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Vikram");
		c12.setGender("Male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(3));
		c12.setPlanEndDate(LocalDate.now().plusMonths(9));
		c12.setBenifitAnt(0.00);
		c12.setTerminateDate(LocalDate.now());
		c12.setTerminiationReason("Did not attend mandatory training");
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
		


	}
	

}
