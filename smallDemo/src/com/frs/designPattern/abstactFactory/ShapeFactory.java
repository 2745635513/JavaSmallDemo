package com.frs.designPattern.abstactFactory;

/**
 * 拓展了抽象工厂类，基于给定信息生成特定的实体类对象
 * 这是个类型的实例
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape==null) return null;
        if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
