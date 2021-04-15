package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceComposite extends CompositeProperty {

	List<Property> properties = new ArrayList<>();

	public PriceComposite(Property... priceSum) {
		super(0);
		this.add(priceSum);
	}

	@Override
	public float getPrice() {
		float totalPrice = 0;
		for (Property prop : this.properties) {
			totalPrice += prop.getPrice();
		}
		this.setPrice(totalPrice);
		return this.price;
	}

	public void add(Property property) {
		this.properties.add(property);
	}

	public void add(Property... priceSum) {
		this.properties.addAll(Arrays.asList(priceSum));
	}

	public void remove(Property property) {
		this.properties.remove(property);
	}

}
