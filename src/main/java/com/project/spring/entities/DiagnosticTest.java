package com.project.spring.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
public class DiagnosticTest {
	@Column(name = "test_id")
	 private Long id ; 
	 private String testname; 
	 private Double price;
	 private Double normalValue;
	 private String units;

	 @Embedded
	 private TestResults testResults;
	 
	 

	public DiagnosticTest() {
		super();
	}



	public DiagnosticTest(Long id, String testname, Double price, Double normalValue, String units,
			TestResults testResults) {
		super();
		this.id = id;
		this.testname = testname;
		this.price = price;
		this.normalValue = normalValue;
		this.units = units;
		this.testResults = testResults;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTestname() {
		return testname;
	}



	public void setTestname(String testname) {
		this.testname = testname;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Double getNormalValue() {
		return normalValue;
	}



	public void setNormalValue(Double normalValue) {
		this.normalValue = normalValue;
	}



	public String getUnits() {
		return units;
	}



	public void setUnits(String units) {
		this.units = units;
	}



	public TestResults getTestResults() {
		return testResults;
	}



	public void setTestResults(TestResults testResults) {
		this.testResults = testResults;
	}



	@Override
	public String toString() {
		return "DiagnosticTest [id=" + id + ", testname=" + testname + ", price=" + price + ", normalValue="
				+ normalValue + ", units=" + units + ", testResults=" + testResults + "]";
	}
	 
	
	 
}
