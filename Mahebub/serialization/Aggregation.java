package serialization;

import java.io.*;

class Address implements Serializable {

	int flatNo;
	String streetName;

	public Address(int flatNo, String streetName) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
	}

	public String toString() {
		return "Address [" + "flatNo=" + flatNo + ", streetName=" + streetName + "]";
	}
}

class Customer implements Serializable {

	int customerId;
	String customerName;
	Address address;

	public Customer(int customerId, String customerName, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}

	public String toString() {
		return "Customer [" + "customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ "]";
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Address address = new Address(402, "2nd street");

		Customer serializeCustomer = new Customer(101, "Sam", address);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		Customer deSerializeCustomer = null;

		try {
			fos = new FileOutputStream("CustomerAggregation.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serializeCustomer);
			oos.flush();
			oos.close();

			System.out.println("Serialization: Customer object " + "saved to CustomerAggregation.ser file\n");
			fis = new FileInputStream("CustomerAggregation.ser");
			ois = new ObjectInputStream(fis);
			deSerializeCustomer = (Customer) ois.readObject();
			ois.close();

			System.out.println("De-Serialization: Customer object " + "de-serialized from CustomerAggregation.ser file");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Printing customer values from " + "de-serialized object:\n" + deSerializeCustomer);
	}
}