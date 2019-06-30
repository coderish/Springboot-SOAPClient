package com.rish.tutorial.springboot.soap.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rish.tutorial.springboot.soap.client.adatper.SOAPConnector;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.StudentDetailsRequest;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.StudentDetailsResponse;

@RestController
@RequestMapping("/")
public class StudentSoapController {

	@Autowired
	private SOAPConnector soapConnector;

//	@GetMapping
//	public StudentDetailsResponse response(@RequestParam String code) {
//
//		StudentDetailsRequest request = new StudentDetailsRequest();
//
//		ObjectFactory objectFactory = new ObjectFactory();
//		GetBankType type = new GetBankType();
//		type.setBlz(code);
//		GetBankResponseType response = soapConnector.getBank("http://www.thomas-bayer.com/axis2/services/BLZService",
//				objectFactory.createGetBank(type));
//		return response;
//	}

	@GetMapping("/{name}")
	public StudentDetailsResponse response(@PathVariable("name") String name) {

		StudentDetailsRequest request = new StudentDetailsRequest();
		request.setName(name);
		StudentDetailsResponse response = (StudentDetailsResponse) soapConnector
				.callWebService("http://localhost:8080/service/student-details", request, "");

		System.out.println("Got Response As below ========= : ");
		System.out.println("Name : " + response.getStudent().getName());
		System.out.println("Standard : " + response.getStudent().getStandard());
		System.out.println("Address : " + response.getStudent().getAddress());
		return response;
	}
}
