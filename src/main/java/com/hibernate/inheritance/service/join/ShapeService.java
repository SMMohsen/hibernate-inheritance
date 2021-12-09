package com.hibernate.inheritance.service.join;

import com.hibernate.inheritance.model.join.Circle;
import com.hibernate.inheritance.model.join.Rectangle;
import com.hibernate.inheritance.model.join.Shape;
import com.hibernate.inheritance.repository.join.RectangleRepository;
import com.hibernate.inheritance.repository.join.ShapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeService {

    /*
    * pitfalls of this method is that in case of retrieve data select statement will join tables to get data
    * in case of get data with parent table will join all tables
    * in case of get sub-class data will join parent table
     */

    @Autowired
    private ShapeRepository shapeRepository;

    @Autowired
    private RectangleRepository rectangleRepository;


    public void addShape(Shape shape) {

        shapeRepository.save(shape);

    }

    public void addRectangle(Rectangle rectangle) {

        shapeRepository.save(rectangle);

    }

    public void addCircle(Circle circle) {

        shapeRepository.save(circle);

    }

    public List<Shape> getAllShapes() {

        return shapeRepository.findAll();

    }

    public List<Rectangle> getAllRectangles() {

        return rectangleRepository.findAll();
    }
}
