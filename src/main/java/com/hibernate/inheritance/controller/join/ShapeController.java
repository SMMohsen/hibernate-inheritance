package com.hibernate.inheritance.controller.join;

import com.hibernate.inheritance.model.join.Circle;
import com.hibernate.inheritance.model.join.Rectangle;
import com.hibernate.inheritance.model.join.Shape;
import com.hibernate.inheritance.service.join.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shapes")
public class ShapeController {

    @Autowired
    private ShapeService shapeService;


    @PostMapping
    public void addShape(@RequestBody Shape shape) {

        shapeService.addShape(shape);

    }


    @PostMapping("/rectangle")
    public void addRectangle(@RequestBody Rectangle rectangle) {

        shapeService.addRectangle(rectangle);

    }


    @PostMapping("/circle")
    public void addCircle(@RequestBody Circle circle) {

        shapeService.addCircle(circle);

    }


    @GetMapping
    public List<Shape> getAllShapes() {

        return shapeService.getAllShapes();

    }

    @GetMapping("/rectangles")
    public List<Rectangle> getAllRectangles() {

        return shapeService.getAllRectangles();

    }
}
