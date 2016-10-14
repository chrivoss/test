package com.airport;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.webservicex.airport.*;
import net.webservicex.convert.*;
import java.io.StringReader;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * Servlet implementation class Airport
 */
@WebServlet("/Airport")
public class AirSOAP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AirSOAP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		Airport airport = new Airport();
		AirportSoap airportSOAP = airport.getAirportSoap();

		HashMap<String, String> values = new HashMap<String, String>();
		String xmlString = airportSOAP.getAirportInformationByAirportCode(request.getParameter("airportCode"));
		Document xml = convertStringToDocument(xmlString);
		String ff = xml.getFirstChild().getChildNodes().item(1).getTextContent();
		NodeList childs = xml.getFirstChild().getChildNodes().item(1).getChildNodes();
		for (int i = 0; i < childs.getLength(); i++) {
			Node child = childs.item(i);
			values.put(child.getNodeName(), child.getTextContent());
		}

		double l = Double.parseDouble(values.get("RunwayLengthFeet"));
		LengthUnit lu = new LengthUnit();
		LengthUnitSoap lus = lu.getLengthUnitSoap();
		double length = lus.changeLengthUnit(l, Lengths.FEET, Lengths.METERS);
		String result = values.get("AirportCode") + "#" + values.get("CityOrAirportName") + "#"  + length;

		PrintWriter out = response.getWriter();
		out.print(result);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static Document convertStringToDocument(String xmlStr) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
