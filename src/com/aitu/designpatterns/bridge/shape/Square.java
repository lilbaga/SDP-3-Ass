package com.aitu.designpatterns.bridge.shape;

import com.aitu.designpatterns.bridge.renderer.Renderer;

public class Square extends Shape {
    private float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}