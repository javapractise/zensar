package com.zensar.interfaces;

public interface Computer {
	void processor();
}

interface Desktop extends Computer {
	void generation();
}

class Processor implements Desktop {

	public void processor() {
		System.out.println("Speed of the Desktop Computers are depends on the processor.");
	}

	public void generation() {
		System.out.println("Usually latest generation processor are faster than other.");
	}
}

class Test3 {
	public static void main(String[] args) {
		Processor p = new Processor();
		p.processor();
		p.generation();
	}
}
