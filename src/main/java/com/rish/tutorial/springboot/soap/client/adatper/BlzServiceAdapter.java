//package com.rish.tutorial.springboot.soap.client.adatper;
//
//import javax.xml.bind.JAXBElement;
//
//import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
//
//public class BlzServiceAdapter extends WebServiceGatewaySupport {
//
//	public GetBankResponseType getBank(String url, Object request) {
//		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
//		return res.getValue();
//	}
//}
