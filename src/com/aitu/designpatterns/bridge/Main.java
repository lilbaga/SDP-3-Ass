package com.aitu.designpatterns.bridge;

import com.aitu.designpatterns.bridge.renderer.RasterRenderer;
import com.aitu.designpatterns.bridge.renderer.Renderer;
import com.aitu.designpatterns.bridge.renderer.VectorRenderer;
import com.aitu.designpatterns.bridge.shape.Circle;
import com.aitu.designpatterns.bridge.shape.Shape;
import com.aitu.designpatterns.bridge.shape.Square;

public class Main {
    public static void main(String[] args) {
        printHeader("1. Initializing renderers");
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        printHeader("2. Creating shapes with specific renderers");
        Shape vectorCircle = new Circle(vector, 5.0f);
        Shape rasterSquare = new Square(raster, 10.0f);

        vectorCircle.draw();
        rasterSquare.draw();

        printHeader("3. Demonstrating runtime implementation switching");
        System.out.println("Switching vectorCircle to raster renderer...");
        vectorCircle.setRenderer(raster);
        vectorCircle.draw();
    }

    private static void printHeader(String title) {
        System.out.println("\n--- " + title + " ---");
    }
}