package com.pnc.webservices.jaxb;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@XmlRootElement
@XmlType(propOrder={"bookName", "bookDesc"})
@JsonPropertyOrder({"bookName", "bookDesc"})
public class Dictionary {
	
	private String bookName;
	private String bookDesc;
	
	public Dictionary(){
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
}
