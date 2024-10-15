class ArrayDemo
{
	public static void main(String[] args)
	{
		int age1 = 10;
		int age2 = 12;
		int age3 = 15;
		int age4 = 11;
		int age5 = 15;
		int age6 = 16;
		int age7 = 13;
		int age8 = 10;
		int age9 = 14;
		int age10 = 16;
		
		//data_type[] array_name;
		int[] age = new int[10];//new is an operator in Java that allocates memory.
		age[0] = 10;
		age[1] = 12;
		age[2] = 15;
		age[3] = 11;
		age[4] = 15;
		age[5] = 16;
		age[6] = 13;
		age[7] = 10;
		age[8] = 14;
		age[9] = 16;
		
		int[] ages = {10,12,15,11,15,16,13,10,14,16};
		System.out.println(ages[7]);//
		System.out.println("No. of elements in the array = " + ages.length);
	}
}