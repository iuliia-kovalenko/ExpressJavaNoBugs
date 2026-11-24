package complex_tasks.task_2;

/**
 * Описание:
 * Разработайте систему валидации для модели данных пользователя,
 * которая проверяет корректность имени, возраста и электронной почты.
 * Валидация должна управляться через глобальный флаг validationEnabled,
 * который может быть включен или выключен.
 * Если данные не проходят валидацию,
 * должно выбрасываться специализированное исключение InvalidUserException.
 *
 * Модель данных:
 * User: Класс пользователя с атрибутами для имени, возраста и электронной почты.
 * Класс валидатора:
 * UserValidator: Сервис, который предоставляет методы для проверки объектов
 * User на соответствие определенным правилам.
 * Функциональные требования:
 * Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
 * Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
 * Проверка email: Email должен соответствовать стандартному формату электронной почты.
 * Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
 * Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.
 */
public class UserValidator {
    private static boolean validationEnabled = true;


    public void setValidation(boolean flag) {
        validationEnabled = flag;
    }

    public boolean validateName(User user) {
        if (!validationEnabled) {
            System.out.println("Validation is disabled");
            return true;
        }
        if (user.getName() == null || user.getName().isEmpty() || !Character.isUpperCase(user.getName().charAt(0))) {
            throw new InvalidUserException("Name must not be empty and must start with an uppercase letter");
        }
        return true;
    }

    public boolean validateAge(User user) {
        if (!validationEnabled) {
            System.out.println("Validation is disabled");
            return true;
        }
        if (user.getAge() < 18 || user.getAge() > 100) {
            throw new InvalidUserException("Age must not be less than 18 and more than 100");
        }
        return true;
    }

    public boolean validateEmail(User user) {
        if (!validationEnabled) {
            System.out.println("Validation is disabled");
            return true;
        }
        if (user.getEmail() == null || user.getEmail().isEmpty() || !user.getEmail().matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new InvalidUserException("Email is not valid");
        }
        return true;
    }
}
