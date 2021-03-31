package za.ca.cput.calculator;

/*
* author: Melven Booysen
*
 */
public class Division
{
    /*
     *Return result of integer division
     *
     */
    public static int intergerDivision (int numerator, int denominator)
    {
        if (denominator < 1) return 0;
        return numerator / denominator;
    }


}
