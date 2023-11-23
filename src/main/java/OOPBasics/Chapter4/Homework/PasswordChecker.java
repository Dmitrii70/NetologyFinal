package OOPBasics.Chapter4.Homework;

public class PasswordChecker {
    private int minLength;
    private int maxRepeats;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Недопустимое значение пароля. Число символов должно быть больше 0");
        }
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException
                    ("Недопустимое значение пароля. Число повторений символов должно быть 1 и более раз");
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if (password.length() <= minLength) {
            return false;
        }
        int counterRepeats = 0;
        char previousLetter = ' ';
        for (char letter : password.toCharArray()) {
            if (letter == previousLetter) {
                counterRepeats++;
            } else {
                counterRepeats = 0;
            }

            if (counterRepeats == maxRepeats) {
                return false;
            }
            previousLetter = letter;
        }

        return true;
    }
}
