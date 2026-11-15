package complex_tasks.task_2;

public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

        System.out.println("---------------Valid user------------------");
        User validUser = new User("Anna", "anna@mail.com", 25);
        System.out.println("Name is valid: " + validator.validateName(validUser));
        System.out.println("Age is valid: " + validator.validateAge(validUser));
        System.out.println("Email is valid: " + validator.validateEmail(validUser));

        System.out.println("---------------Invalid name------------------");
        try {
            validator.validateName(new User("anna", "anna@mail.com", 25));
        } catch (InvalidUserException e) {
            System.out.println("Name 'anna': " + e.getMessage());
        }
        try {
            validator.validateName(new User("", "anna@mail.com", 25));
        } catch (InvalidUserException e) {
            System.out.println("Empty name: " + e.getMessage());
        }

        System.out.println("---------------Invalid age------------------");
        try {
            validator.validateAge(new User("Anna", "anna@mail.com", 17));
        } catch (InvalidUserException e) {
            System.out.println("Age 17: " + e.getMessage());
        }
        try {
            validator.validateAge(new User("Anna", "anna@mail.com", 101));
        } catch (InvalidUserException e) {
            System.out.println("Age 101: " + e.getMessage());
        }

        System.out.println("---------------Boundary age------------------");
        System.out.println("Age 18 is valid: " + validator.validateAge(new User("Anna", "anna@mail.com", 18)));
        System.out.println("Age 100 is valid: " + validator.validateAge(new User("Anna", "anna@mail.com", 100)));

        System.out.println("---------------Invalid email------------------");
        try {
            validator.validateEmail(new User("Anna", "anna.mail.com", 25));
        } catch (InvalidUserException e) {
            System.out.println("Email 'anna.mail.com': " + e.getMessage());
        }
        try {
            validator.validateEmail(new User("Anna", "anna@", 25));
        } catch (InvalidUserException e) {
            System.out.println("Email 'anna@': " + e.getMessage());
        }

        System.out.println("---------------Validation disabled------------------");
        User invalidUser = new User("anna", "anna.mail.com", 5);
        validator.setValidation(false);
        System.out.println("Name is valid: " + validator.validateName(invalidUser));
        System.out.println("Age is valid: " + validator.validateAge(invalidUser));
        System.out.println("Email is valid: " + validator.validateEmail(invalidUser));

        System.out.println("---------------Validation enabled again------------------");
        validator.setValidation(true);
        try {
            validator.validateName(invalidUser);
        } catch (InvalidUserException e) {
            System.out.println("Name 'anna': " + e.getMessage());
        }
    }
}
