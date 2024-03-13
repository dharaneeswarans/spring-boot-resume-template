package com.example.resumeCreate.resumecontroller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Controll {

	@GetMapping("/name")
	public String printName(Model model) {
		model.addAttribute("Name","Dharaneeswaran s");
		model.addAttribute("Email","dharanis602@gmail.com");
		model.addAttribute("smallline","|");
		model.addAttribute("phoneNumber","6382567875");
		model.addAttribute("smallline2","|");
		model.addAttribute("native","Alangudi");
		model.addAttribute("Education","EDUCATION");
		model.addAttribute("college","J.J.COLLEGE OF ENGINEERING AND TECHNOLOGY");
		model.addAttribute("course","B.E COMPUTER SCIENCE");
		model.addAttribute("Year","Aug 2019 - June 2023");
		model.addAttribute("collegeplace","TIRUCHIRAPPALLI");
		model.addAttribute("cgpa","Cum. GPA: 7.8");
		model.addAttribute("highschool","ADR MATRIC HR SEC SCHOOL");
		model.addAttribute("hsc","HSC");
		model.addAttribute("schoolplace","KAIKURICHI");
		model.addAttribute("smallline3","|");
		model.addAttribute("percentage","PERCENTAGE: 63");
		model.addAttribute("school","MODERN MATRIC SCHOOL");
		model.addAttribute("ssc","SSC");
		model.addAttribute("smallline4","|");
		model.addAttribute("sscplace","ALANGUDI ");
		model.addAttribute("sscpercentage","PERCENTAGE: 78");
		model.addAttribute("skills","SKILLS");
		model.addAttribute("program","Programming");
		model.addAttribute("java","JAVA");
		model.addAttribute("sql","SQL");
		model.addAttribute("javascript","JAVASCRIPT");
		model.addAttribute("html","HTML");
		model.addAttribute("css","CSS");
		model.addAttribute("bootstrap","BOOTSTRAP");
		model.addAttribute("datastructure","DATA STRUCTURE");
		model.addAttribute("familiar","Familiar");
		model.addAttribute("git","GIT HUB");
		model.addAttribute("figma","FIGMA");
		model.addAttribute("mysql","MYSQL");
		model.addAttribute("links","Links");
		model.addAttribute("gitLink","GIT HUB ");
		model.addAttribute("linkedin","LINKEDIN ");
		model.addAttribute("area","AREA OF INTEREST ");
		model.addAttribute("designation1","FULL STACK DEVELOPER ");
		model.addAttribute("designation2","UI AND UX DESIGNING ");
		model.addAttribute("project","PROJECT ");
		model.addAttribute("projectname","RAILWAY RESERVATION SYSTEM  ");
		model.addAttribute("smallline5","|");
		model.addAttribute("website","Web Site");
		model.addAttribute("projectfinishdate","Completed on June 2022");
		model.addAttribute("smallline6","|");
		model.addAttribute("projectfinishplace","TIRUCHIRAPPALLI");
		model.addAttribute("projectabout1","Proficient in managing and optimizing railway reservation systems to ensure seamless booking processes, improve efficiency, and enhance customer experience.");
		model.addAttribute("projectabout2","Skilled in utilizing Proficient in HTML, CSS, and JavaScript for creating dynamic and\r\n"
				+ "responsive frontend and Proficient in utilizing MySQL and PHP forrobust backend\r\n"
				+ "development and database management .");
		model.addAttribute("projectname2","INVENTORY MANAGEMENT SYSTEM FOR RETAILERS ");
		model.addAttribute("projectfinishdate2","Completed on Nov 2022 ");
		model.addAttribute("smallline7","|");
		model.addAttribute("projectfinishplace2","TIRUCHIRAPPALLI");
		model.addAttribute("projectabout3","Designed and implemented streamlined inventory management systems enhancing\r\n"
				+ "operational efficiency forretail businesses.");
		model.addAttribute("projectabout4"," By managing inventory retailers meet customer demand withoutrunning out of\r\n"
				+ "stock or carrying excess supply.\r\n"
				+ "");
		model.addAttribute("projectname3","ACCURATE PLANT LEAF DISEASE DETECTION AND REMEDIAL\r\n"
				+ "MEASURE USING DEEP LEARNING ALGORITHM\r\n"
				+ " ");
		model.addAttribute("projectname3","ACCURATE PLANT LEAF DISEASE DETECTION AND REMEDIAL\r\n"
				+ "MEASURE USING DEEP LEARNING ALGORITHM ");
		model.addAttribute("projectfinishdate3","Completed on June 2023");
		model.addAttribute("smallline8","|");
		model.addAttribute("projectfinishplace3","TIRUCHIRAPPALLI");
		model.addAttribute("projectabout5","Developed a precise plant leaf disease detection system leveraging deep learning\r\n"
				+ "algorithms and implemented effective remedial measures for agricultural\r\n"
				+ "enhancement. ");
		
		model.addAttribute("projectabout6","Neural Networks for accurate identification and implemented remedial measures\r\n"
				+ "based on deep learning algorithms.");
		
		
		
		
		
		



		return "dharani";	


	}


}
