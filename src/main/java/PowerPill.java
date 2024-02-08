
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill {
    private static int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;

    // constructors

    /**
     * \* Initializes this power pill to a default power value
     * \* and sets the name of the pill to name.
     * \* @param name the name of this power pill.
     */
    public PowerPill(String name)
    {
        setName(name);
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     *
     * @param name  the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power)
    {
        setName(name);
        setPower(power);
    }


    // accessor methods

    /**
     * @return Returns the name of the PowerPill as a String
     */
    public String getName() {
        return name;
    }

    /**
     * @return Returns the power of the PowerPill as an int
     */
    public int getPower() {
        return power;
    }

    // mutator methods

    /**
     * @param name A string that will replace what is
     *             currently occupying the name variable
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param power An int that will replace what is
     *              currently occupying the power variable
     */
    public void setPower(int power) {
        this.power = power;
    }
    // toString method

    public String toString()
    {
        return "PowerPill " + name + " = " + power;
    }



}