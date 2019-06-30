package com.rish.tutorial.springboot.soap.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rish.tutorial.springboot.soap.client.adatper.SOAPConnector;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.AddSDMBatch;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.AddSDMBatchResponse;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.ArrayOfShipmentInfo;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.ResAWB;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.ResAWBResponse;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.ShipInfo;
import com.rish.tutorial.springboot.soap.client.wsdl.generated.models.ShipmentInfo;

@RestController
@RequestMapping("/smsa")
public class SmsaSoapController {

	@Autowired
	private SOAPConnector soapConnector;

	@GetMapping("/getResAWBResponse/{passkey}/{count}")
	public ResAWBResponse getResAWBResponse(@PathVariable("passkey") String passkey, @PathVariable("count") int count) {

		ResAWB request = new ResAWB();
		request.setPassKey(passkey);
		request.setCount(count);
		ResAWBResponse response = (ResAWBResponse) soapConnector.callWebService(
				"http://track.smsaexpress.com/sdmservice/sdmwebservice.asmx", request,
				"http://track.smsaexpress.com/SDMService/resAWB");

		System.out.println("Got ResAWBResponse As below ========= : ");
		System.out.println("ResAWBResult : " + response.getResAWBResult());
		return response;
	}

	@GetMapping("/getAddSDMBatchResponse/{passkey}")
	public AddSDMBatchResponse getAddSDMBatchResponse(@PathVariable("passkey") String passkey) {
//			, @RequestBody String shipmentInfoRequest) {

		AddSDMBatch request = new AddSDMBatch();
		request.setPassKey(passkey);
		ShipmentInfo shipmentInfo = new ShipmentInfo();
		shipmentInfo.setAwbNo("106190630500001");
		shipmentInfo.setRefNo("P4533345");
		shipmentInfo.setSentDate("6/27/2019");
		shipmentInfo.setIdNo("4782047279");
		shipmentInfo.setCName("MR TEST TEST");
		shipmentInfo.setCntry("SA");
		shipmentInfo.setCCity("Jeddah");
		shipmentInfo.setCZip("000214547");
		shipmentInfo.setCPOBox("Jeddah");
		shipmentInfo.setCMobile("0507275548");
		shipmentInfo.setCTel1("0507275548");
		shipmentInfo.setCTel2("2525888");
		shipmentInfo.setCAddr1("Jeddah");
		shipmentInfo.setCAddr2("Sharqiah");
		shipmentInfo.setPCs("1");
		shipmentInfo.setCEmail("@");
		shipmentInfo.setWeight("0.5");
		shipmentInfo.setItemDesc("Other pin description");

		ArrayOfShipmentInfo shipmentInfoItems = new ArrayOfShipmentInfo();
		shipmentInfoItems.getShipmentInfo().add(shipmentInfo);

		ShipInfo shipInfo = new ShipInfo();
		shipInfo.setShipInfoItem(shipmentInfoItems);
		request.setShipInfor(shipInfo);

		AddSDMBatchResponse response = (AddSDMBatchResponse) soapConnector.callWebService(
				"http://track.smsaexpress.com/sdmservice/sdmwebservice.asmx", request,
				"http://track.smsaexpress.com/SDMService/addSDMBatch");
		System.out.println("Got AddSDMBatchResponse As below ========= : ");
		System.out.println(
				"AwbNo : " + response.getAddSDMBatchResult().getShipInforesu().getShipInfoRes().get(0).getAwbNo());
		System.out.println(
				"Status : " + response.getAddSDMBatchResult().getShipInforesu().getShipInfoRes().get(0).getStatus());

		return response;
	}
}
