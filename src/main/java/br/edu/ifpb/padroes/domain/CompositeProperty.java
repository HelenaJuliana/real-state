package br.edu.ifpb.padroes.domain;

public abstract class CompositeProperty implements Property{
    public float price;

    public CompositeProperty(float price){
        this.price = price;
    }
    @Override
    public float getPrice() {
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }
}
