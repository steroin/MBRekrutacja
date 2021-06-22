package ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockCrackerTest {

    @Test
    public void lockCrackerTest() {
        // given
        Lock lock = new Lock();

        // when
        lock.unlock(new LockCracker().getLockerPassword(lock));

        // then
        assertFalse(lock.isLocked(), "Lock is still locked");
    }
}