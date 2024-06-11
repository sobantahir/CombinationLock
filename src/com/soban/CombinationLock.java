package com.soban;

/**
 * @author Soban Tahir
 * date 27/02/2024 
 * A Java program that acts as a combination lock
 */

/**
 * CombinationLock class represents a lock that can be unlocked using a specific combination.
 */
public class CombinationLock {
	
	// Private instance variables here
	private String combo;
	private int attempts;
	private boolean unlocked;

	/**
	 * Default constructor initializes the lock with a default combination "0000", attempts at 0 and unlocked at false.
	 */
	public CombinationLock() {
		this.combo = "0000";
		this.attempts = 0;
		this.unlocked = false;
	}

	/**
	 * Overloaded constructor initializes the lock with a specified combination.
	 * @param combo The initial combination to set for the lock
	 */
	public CombinationLock(String combo) {
		this.combo = combo;
		this.attempts = 0;
		this.unlocked = false;
	}

	/**
	 * Checks if the lock is currently unlocked. 
	 * @return true if the lock is unlocked, false otherwise
	 */
	public boolean isUnlocked() {
		return unlocked;
	}

	/**
	 * Attempts to unlock the lock with a given combination.
	 * If the correct combination is entered, the lock unlocks; otherwise, it counts failed attempts.
	 * @param combo The combination to attempt unlocking the lock
	 */
	public void attemptUnlock(String combo) {
		// TODO: Implement
		if (combo.equals(combo)) {
			unlocked = true;
			attempts = 0;
			System.out.println("Click.");
		} else {
			attempts += 1;
			if (attempts >= 3) {
				System.out.println("Alarm!");
			}
		}
	}

	/**
	 * Changes the current combination if the lock is unlocked.
	 * @param newCombo The new combination to set for the lock
	 * @return true if the combination was successfully changed, false otherwise
	 */
	public boolean changeCombo(String newCombo) {
		if (unlocked = true) {
			combo = newCombo;
			unlocked = false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Locks the combination lock.
	 */
	public void lock() {
		unlocked = false;
	}

	/**
	 * Main method for testing.
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		CombinationLock lock = new CombinationLock("1234");

        // Test unlocking with correct and incorrect combinations
        lock.attemptUnlock("0000"); // Incorrect
        lock.attemptUnlock("1234"); // Correct
        System.out.println("Lock is unlocked: " + lock.isUnlocked()); // Should print true

        // Test changing the combination
        boolean comboChanged = lock.changeCombo("4321");
        System.out.println("Combination changed successfully: " + comboChanged); // Should print true

        // Lock the combination lock
        lock.lock();
        System.out.println("Lock is unlocked: " + lock.isUnlocked()); // Should print false
	}
}
