/*
 * @author Brandon Jett
 * Item.java
 * CS 321 Team 9 Fall 2020
 * Creates the Item class
 */
package main.java.my.test;

import java.util.Random;

/**
 * This class creates item objects that modify the players various values or
 * helps them in some way such as a health pack.
 */
public class Item
{

	// Variable Declarations
	private int weaponStrength;
	private static final int HEALTH_INCREASE = 10;

	/**
	 * This function creates the strength modifier on a weapon it takes an input
	 * of the current damage modifier on the current weapon to ensure that this
	 * weapon is better.
	 * @param int current weapons weapon strength value
	 */
	private void setWeaponStrength(int currentStrength)
	{
		Random rand = new Random();
		int n = rand.nextInt(10);                   // Change this number as needed
		weaponStrength = currentStrength + n;   // Current weapon strength + random number
	}

	/**
	 * This function returns the current weapons strength.
	 *
	 * @return weaponStrengh the current weapons strength
	 */
	public int getWeaponStrength()
	{
		return weaponStrength;
	}

	/**
	 * This function returns the amount of health increased by a health pot.
	 *
	 * @return HEALTH_INCREASE int, expected to be 10
	 */
	public int getHealthIncrease()
	{
		return HEALTH_INCREASE;
	}

	/**
	 * This function uses a rng to determine what type of item drops in a given
	 * call.
	 *
	 * @return int 0 = weapon, 1 = armor, 2 = other
	 */
	private int determineItemType()
	{
		Random rand = new Random();
		int n = rand.nextInt(1);            // I cant recall if it indexes from 0, adjust as needed
		return n;                           // This return will be given to a function that generates the item
	}

	/**
	 * This function will create a sword when called. The sword will be created
	 * with the setWeaponStrength function.
	 *
	 *
	 */
	public void createSword()
	{
		setWeaponStrength(weaponStrength);
		// This will be code for GUI
	}

	/**
	 * This function will create a health potion in the GUI when called. The
	 * potion will be determined by HEALTH_INCREASE.
	 *
	 *
	 */
	public void createHealthPot()
	{
		// This will be code for GUI
	}

	/**
	 * This function will create a item based on the results of
	 * determineItemType() and roll the items stats. As of right now it has no
	 * return, I feel like structs would be good here but luckily Java sucks and
	 * doesn't have structs so here we are.
	 *
	 *
	 */
	public void createItem()
	{
		int itemType = determineItemType();

		// If the item is to be a weapon, set its weapon strength
		if (itemType == 0)
		{
			createSword();
			// There will be more here to create the item
		}

		// If the item is to be armor, set its defense
		if (itemType == 1)
		{
			createHealthPot();
			// There will be more here to create the item
		}
	}
}
