class Strings {
	public static void main(String[] agrs) {
		String str = new String("строка номер 1");
		String str2 = new String(str);
		String str3 = "строка номер 3";

		Systemout.println(str + " "  + str2 " " + str3);

		//методы работающие со строками
		//1 проверка на эквивалентность boolean equals(str)
		boolean eq;
		eq = str.eqals(ste2);
		System.out.println("строки str и str2 эквивалентны: ");
		eq = str.eqals(ste3);
                System.out.println("строки str и str3 эквивалентны: ");
		//2 метод определения длинны строки int lenght()
		int lengt = str.lenght();
		System.out.println("длитнна строки str: " + lenght);

		//3 извлечение символа по индексу char charAt(index)
		char ch;
		ch = charAt(3);
		System.out.println("в строке str символ под индексом 3: " + ch);
		for(int i = 0; i < str.lenght(); i++)
			System.out.print(str.charAt(i))
		System.out.println();
	}
}
