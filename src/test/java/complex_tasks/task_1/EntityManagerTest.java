package complex_tasks.task_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Add el in empty list
 * Add el in not empty list
 * Remove el from empty list
 * Remove el from not empty list
 * GetAll elements -> check that initial list does not change
 *
 */
public class EntityManagerTest {
    public EntityManager<Student> manager;

    @BeforeEach
    public void setUp() {
         manager = new EntityManager<>();
    }

    @Test
    public void addOneElementInEmptyListTest() {
        Student expectedStudent = new Student("Yulia", 35, true);
        manager.add(expectedStudent);

        assertEquals(1, manager.getAll().size());
        assertTrue(manager.getAll().contains(expectedStudent));
    }

    @Test
    public void addOneElementInNotEmptyListTest() {
        Student firstStudent = new Student("Yulia", 35, true);
        manager.add(firstStudent);

        Student secondStudent = new Student("Sophie", 20, false);
        manager.add(secondStudent);

        assertEquals(2, manager.getAll().size());
        assertTrue(manager.getAll().contains(secondStudent));
    }

    @Test
    public void addTwoEqualElementsTest() {
        Student firstStudent = new Student("Yulia", 35, true);
        Student secondStudent = new Student("Yulia", 35, true);

        manager.add(firstStudent);
        manager.add(secondStudent);

        assertEquals(2, manager.getAll().size());
    }

    @Test
    public void removeElementFromEmptyListTest() {
        Student student = new Student("Yulia", 33, true);
        assertFalse(manager.remove(student));
    }

    @Test
    public void removeExistingElementFromListTest() {
        Student student = new Student("Yulia", 33, true);
        manager.add(student);

        assertTrue(manager.remove(student));
        assertEquals(0, manager.getAll().size());
        assertFalse(manager.getAll().contains(student));
    }

    @Test
    public void removeNotExistingElementFromListTest() {
        Student student = new Student("Yulia", 33, true);
        manager.add(student);
        Student student2 = new Student("Anna", 22, true);

        assertFalse(manager.remove(student2));

        assertEquals(1, manager.getAll().size());
        assertFalse(manager.getAll().contains(student2));
    }

    @Test
    public void getAllReturnsAllAddedEntitiesInOrderTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Anna", 22, true);

        manager.add(student1);
        manager.add(student2);

        List<Student> expectedList = List.of(student1, student2);
        List<Student> actualList = manager.getAll();
        assertEquals(expectedList, actualList);
    }

    @Test
    public void getAllListDoesNotChangeInitialList() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Anna", 22, true);

        manager.add(student1);
        manager.add(student2);
        int expectedSize = manager.getAll().size();

        assertThrows(UnsupportedOperationException.class, () -> {
            manager.getAll().remove(student1);
        }, "Not possible to change initial list through getAll");
        assertEquals(expectedSize, manager.getAll().size());
    }

    @Test
    public void getAllReturnsIndependentCopyTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Anna", 23, true);
        manager.add(student1);
        List<Student> snapshotList = manager.getAll();

        manager.add(student2);

        assertEquals(1, snapshotList.size());
        assertFalse(snapshotList.contains(student2));
        assertEquals(2, manager.getAll().size());
    }

    @Test
    public void getAllReturnsEmptyListTest() {
        assertTrue(manager.getAll().isEmpty());
    }

    @Test
    public void filterByExistingNameTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, true);
        Student student4 = new Student("Sophie", 18, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        List<Student> expected = List.of(student1, student2);

        List<Student> actual = manager.filterByName("Yulia");

        assertEquals(expected, actual);
    }

    @Test
    public void filterByNonExistingNameTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, true);
        Student student4 = new Student("Sophie", 18, true);
        String nonExistingName = "Alex";

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        assertTrue(manager.filterByName(nonExistingName).isEmpty());
    }

    @Test
    public void filterByExistingAgeExactBoundariesTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, true);
        Student student4 = new Student("Sophie", 18, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        List<Student> expected = List.of(student1, student3);

        List<Student> actual = manager.filterByAge(33, 38);

        assertEquals(expected, actual);
    }

    @Test
    public void filterByExistingAgeBoundariesTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, true);
        Student student4 = new Student("Sophie", 18, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        List<Student> expected = List.of(student1, student3);

        List<Student> actual = manager.filterByAge(25, 45);

        assertEquals(expected, actual);
    }

    @Test
    public void filterByNonExistingAgeBoundariesTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, true);
        Student student4 = new Student("Sophie", 18, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        List<Student> actual = manager.filterByAge(40, 50);

        assertTrue(actual.isEmpty());
    }

    @Test
    public void filterByIsActiveTrueTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, false);
        Student student4 = new Student("Sophie", 18, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        List<Student> expected = List.of(student1, student2, student4);

        List<Student> actual = manager.filterByActive(true);

        assertEquals(expected, actual);
    }

    @Test
    public void filterByIsActiveFalseTest() {
        Student student1 = new Student("Yulia", 33, true);
        Student student2 = new Student("Yulia", 16, true);
        Student student3 = new Student("Andrey", 38, false);
        Student student4 = new Student("Sophie", 18, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        List<Student> expected = List.of(student3);

        List<Student> actual = manager.filterByActive(false);

        assertEquals(expected, actual);
    }
}

