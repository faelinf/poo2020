package atividade1.poo;

import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class ExercicioCinco {
    private GTree tree;

    /** * Initialization */
    @Before
    public void setUp() {
        Person john= new Person("John", null, null);
        Person ann=  new Person("Ann", null, null);
        Person paul= new Person("Paul", john, ann);
        Person steve= new Person("Steve", paul, null);

        tree = new GTree();
        tree.add(john);
        tree.add(ann);
        tree.add(paul);
        tree.add(steve);
    }

    /** * Test case for fatherOf */
    @Test
    public void testFatherOf() {
        assertEquals("John", tree.fatherOf("Paul"));
    }

    /** * Test case for ancestorsOf */
    @Test
    public void testAncestorsOf() {
        Set<String> ancestors = Set.of("John", "Ann", "Paul");
        assertEquals(ancestors, tree.ancestorsOf("Steve"));
    }
}