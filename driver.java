class driver
{
public static void main(String args[])
{
	int age=31;
	String marital_sta="un married";
	String gen="male";
	if(marital_sta=="married")
	System.out.println("company insures when the person got married");
	else if((marital_sta=="un married") && (gen=="male")&& (age>30))
	System.out.println("company insures when the person is unmarried and gender is male");
	else if((marital_sta=="un married") && (gen=="female")&& (age>25))
	System.out.println("company insures when the person is ummarried and gender is female");
}
}