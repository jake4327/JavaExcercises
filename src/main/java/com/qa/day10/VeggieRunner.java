package com.qa.day10;

public class VeggieRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Carrot c12 = new Carrot();
        c12.beEaten();
        Vegtable c1 = new Carrot();
        c1.beEaten();
        /*Vegtable v1 = new Vegtable("lettuce");
        v1.beEaten();
        Object bean = new Vegtable("bean");*/

       /* bean.toString();*/
        //Vegtable v5 = (Vegtable) c12.clone();

        /*c12.setColour("pink");
        v5.setColour("red");
        System.out.println(v5.getColour());*/

        System.out.println(c12.toString());
        System.out.println(c1.toString());
        //System.out.println(v1.toString());
        //System.out.println(v5.toString());

        InheritenceProofOfConcept i = new InheritenceProofOfConceptSubClass();
        //System.out.println(i.methodOne(1));
        System.out.println(i.methodTwo(1));
        System.out.println(i.methodThree(1));
    }
}
