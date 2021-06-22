package ex2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lock {
    private final String password;
    private boolean locked;

    public Lock() {
        password = IntStream.range(0, 4)
                .mapToObj(i -> Integer.toString((int) (Math.random() * 9)))
                .collect(Collectors.joining());
        locked = true;
    }

    public void unlock(String password) {
        if (this.password.equals(password)) {
            locked = false;
        }
    }

    public boolean isLocked() {
        return locked;
    }
}
