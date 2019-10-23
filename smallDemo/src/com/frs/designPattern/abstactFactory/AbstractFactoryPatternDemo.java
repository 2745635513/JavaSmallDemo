package com.frs.designPattern.abstactFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
        Shape shape=shapeFactory.getShape("SQUARE");
        shape.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();
    }
}
