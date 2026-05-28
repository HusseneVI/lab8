package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("=== Lab 8 - ClassGroup tests ===");

        ClassGroup group = createGroup();

        System.out.println("\nInitial students:");

        printStudents(group);

        System.out.println("\nAverage grade:");
        System.out.println(group.avgGrade());

        System.out.println("\nStudents with grade greater than 14:");
        System.out.println(group.countGrades(14));

        System.out.println("\nStudents sorted by name:" + group.sortByName());


        System.out.println("\nTop 3 students:" + group.top3());


        System.out.println("\nHas students with grade lower than 9.5?");
        System.out.println(group.hasLowerGrade(9.5));

        System.out.println("\nDo all student numbers have 5 digits?");
        System.out.println(group.validNumbers());

        System.out.println("\nNames of the students sorted by name with number of enrollements > 2:");
        System.out.println(group.namesNumberOfEnrolledments(2));

        System.out.println("\nRemove students with more than 2 enrollments using Iterator:");

        ClassGroup groupIterator = createGroup();
        groupIterator.removeByEnrollments(2);
        printStudents(groupIterator);
    }

    private static ClassGroup createGroup() {
        ClassGroup group = new ClassGroup("POO");

        group.add(new Student(12345, "Ana Silva", 18.5, 1));
        group.add(new Student(23456, "Bruno Costa", 12.0, 2));
        group.add(new Student(34567, "Carla Sousa", 16.0, 1));
        group.add(new Student(45678, "Diogo Martins", 9.0, 4));
        group.add(new Student(56789, "Eva Pereira", 14.5, 3));
        group.add(new Student(67890, "Filipe Rocha", 19.0, 1));
        group.add(new Student(78901, "Gabriela Lopes", 11.5, 5));
        group.add(new Student(89012, "Henrique Ramos", 15.0, 2));

        return group;

    }

    private static void printStudents(ClassGroup group) {
        group.getStudents().forEach(System.out::println);
    }
}
