package genericlibraryforsp;

import java.util.Random;

public class JavaUtility {
/**
 * This is generic method to get random number
 * @return
 */
public int getRandomNumber()
{
	Random r=new Random();
	int num=r.nextInt(10000);
	return num;
}
}
