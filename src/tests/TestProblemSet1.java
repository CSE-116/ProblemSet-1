package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestProblemSet1 {

    // ----- Uncomment the tests below once you have written all the classes/methods
    // ----- You can uncomment multiple lines by selecting them and pressing ctrl+/
    // ----- (command+/ on mac)

    // @Test
    // public void testDetectCollision() {
    //     Circle c1 = new Circle(new Location(0, 0), 1);
    //     Circle c2 = new Circle(new Location(0, 0), 1);
    //     Circle c3 = new Circle(new Location(0, 0), 10);
    //     Circle c4 = new Circle(new Location(2, 0), 2);
    //     Circle c5 = new Circle(new Location(2, 0), 0.99);
    //     Circle c6 = new Circle(new Location(10, 10), 1);

    //     CircleEngine engine = new CircleEngine();
    //     assertTrue(engine.detectCollision(c1, c1));
    //     assertTrue(engine.detectCollision(c1, c2));
    //     assertTrue(engine.detectCollision(c2, c1));
    //     assertTrue(engine.detectCollision(c1, c3));
    //     assertTrue(engine.detectCollision(c1, c4));
    //     assertTrue(engine.detectCollision(c3, c4));
    //     assertTrue(engine.detectCollision(c3, c5));
    //     assertTrue(engine.detectCollision(c4, c5));

    //     assertFalse(engine.detectCollision(c1, c5));
    //     assertFalse(engine.detectCollision(c5, c1));
    //     assertFalse(engine.detectCollision(c1, c6));
    //     assertFalse(engine.detectCollision(c6, c1));
    //     assertFalse(engine.detectCollision(c6, c1));
    //     assertFalse(engine.detectCollision(c4, c6));
    //     assertFalse(engine.detectCollision(c5, c6));
    // }

    // @Test
    // public void testDoubleRadius() {
    //     ArrayList<Circle> actual = new ArrayList<>(Arrays.asList(new Circle(new Location(1, 2), 1),
    //             new Circle(new Location(3, 4), 3), new Circle(new Location(5, 6), 0.5),
    //             new Circle(new Location(7, 8), 10), new Circle(new Location(9, 10), 1.224)));

    //     CircleEngine engine = new CircleEngine();
    //     engine.doubleRadius(actual);

    //     ArrayList<Circle> expected = new ArrayList<>(Arrays.asList(new Circle(new Location(1, 2), 2),
    //             new Circle(new Location(3, 4), 6), new Circle(new Location(5, 6), 1),
    //             new Circle(new Location(7, 8), 20), new Circle(new Location(9, 10), 2.448)));

    //     assertEquals(expected.size(), actual.size());
    //     for (int i = 0; i < expected.size(); i++) {
    //         Circle expectedCircle = expected.get(i);
    //         Circle actualCircle = actual.get(i);
    //         String failString = String.format("Failed for circle at location (%.0f, %.0f)",
    //                 expectedCircle.getLocation().getX(), expectedCircle.getLocation().getY());
    //         assertEquals(failString, expectedCircle.getRadius(), actualCircle.getRadius(), EPSILON);
    //         assertEquals(failString, expectedCircle.getLocation().getX(), actualCircle.getLocation().getX(), EPSILON);
    //         assertEquals(failString, expectedCircle.getLocation().getY(), actualCircle.getLocation().getY(), EPSILON);
    //     }

    //     actual = new ArrayList<>();
    //     engine.doubleRadius(actual);
    //     assertEquals(0, actual.size());
    // }
    
}
