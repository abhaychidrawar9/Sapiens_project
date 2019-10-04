package com.abhay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abhay.dao.AddressDao;
import com.abhay.dao.EmployeeDao;
import com.abhay.dao.ProjectDao;
import com.abhay.model.Address;
import com.abhay.model.Employee;
import com.abhay.model.Project;

@Controller
public class EmpController {

	private static final String Testing = null;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private ProjectDao projectDao;

	private Employee employee;

	@RequestMapping(value = "/empreg")
	public String reg(ModelMap model) {
		Employee e = new Employee();
		model.addAttribute("employee", e);
		return "empreg";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmp(@ModelAttribute("employee") Employee e, Model model) {
		System.out.println("Employeed Details Saved!!");
		String x = employeeDao.add(e);
		Address address = new Address();
		model.addAttribute("address", address);
		return "addreg";
	}

	@RequestMapping(value = "/saveadd", method = RequestMethod.POST)
	public String saveAdd(@ModelAttribute("address") Address a, Model model) {
		System.out.println("Address Details Saved!!");
		a.setEmployee(employee);
		addressDao.add(a);
		Project project = new Project();
		model.addAttribute("project", project);
		return "projectreg";
	}

	@RequestMapping(value = "/savepro", method = RequestMethod.POST)
	public String savePro(@ModelAttribute("project") Project p, Model model) {
		System.out.println("Project Details Saved!!");
		p.setEmployee(employee);
		projectDao.add(p);
		return "projectreg";
	}

	@RequestMapping(value = "/index")
	public String index() {
		Employee e = new Employee();
		e.setFirstName("abhay");
		e.setLastName("chidrawar");
		e.setAge(24);

		Address a = new Address();
		a.setEmployee(e);
		a.setContactNo((long) 992304752);
		a.setPresentAddress("banglore");

		Project p = new Project();
		p.setDuration(5);
		p.setEmployee(e);

		p.setCurrentStatus(Testing);
		employeeDao.add(e);
		addressDao.add(a);
		projectDao.add(p);
		return "index";

	}

	@RequestMapping("view")
	public String model(Model model) {
		List<Employee> employees = addressDao.view();
		for (Object e : employees) {
			Address a = (Address) e;
			System.out.println(e);
			Employee ee = a.getEmployee();
			System.out.println(e);
		}
		model.addAttribute("eList", employees);
		return "view";
	}

	@RequestMapping(value = "/view_page")
	public String viewEmp() {
		return "view";
	}

	@RequestMapping("/delete/{Id}",meth)
	public String delete() {
		
		return "view";
	}

}
