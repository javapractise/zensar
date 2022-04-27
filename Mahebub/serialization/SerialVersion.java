package serialization;

import java.io.*;

public class SerialVersion implements Serializable {

	private static final long serialVersionUID = 1L;

	int employeeId;
	String employeeName;
	String department;
	public SerialVersion(int employeeId, String employeeName, String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
}