package org.composition.main;

import java.util.ArrayList;
import java.util.List;

import org.composition.laptop.Laptop;
import org.composition.laptop.components.GraphicsCard;
import org.composition.laptop.components.Processor;

public class Hello {

	public static void main(String[] args) {
		
		List<Laptop> abc=new ArrayList<>();
		Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17f, processor,
				"DDR4", "2TB", graphicsCard, null, "backlit");

		abc.add(gamingLaptop);
		types(abc);
	}
	public static void types(List<Laptop> abc) {
		for(Laptop laptop:abc) {
			System.out.println(laptop.showInfo());
		}
		
	}

}
