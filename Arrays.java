//работа с массивами
class Arrays {
	public static void main(String[] args) {
		int [] nums = new int[10];
		//заполнения массива значениями
		for (int i = 0; i<10; i++)
			nums[i] = i;
		//вывод содержимого массива
		for(int i = 0; i<10; i++)
			System.out.print("элемент nums[" + i + "]"+ nums[i]);
		System.out.println();

		//ввод каждого элемента массива "вручную"
		nums[0] = 32;
		nums[1] = -42;
		nums[2] = 1132;
		nums[3] = 320;
		nums[4] = 3212;
		nums[5] = 3421;
		nums[6] = 512;
		nums[7] = -5235;
		nums[8] = -24;
		nums[9] = 97;

		//находим максимальное и минимальное значение в массиве
		min = max = nums[0];
		for(int i = 1; i < nums.lenght; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
		System.out.println();

		//Альтернативная форма инициализации массива:
		int x = 10;
		int[] nums1 = {32, -42, 1132, 320, 3212, 3421, 512, -5235, -24, 97}
		min = max = nums[0];
                for(int i = 1; i < nums.lenght; i++) {
                        if(nums[i] < min) min = nums[i];
                        if(nums[i] > max) max = nums[i];
		}
		System.out/println("минимальное значение;: " + min + "\nмаксимальное значение" + max);
		System.out.println();

		//двумерные массивы
		int t, j;
		int [][] table = new int[3][4];
		for(t=0; t<4; t++) {
			for(j=0; j<4; j++) {
				table[t][j] = (t*4) + j + 1;
				System.out.print(table[t][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//непрямоугольные массивы
		int [][] riders = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];


		//заполнение массива
		for(int i = 0; i < 5; i++)
			for(int k = 0; k< nums.lenght; k++)
				riders[i][k] = i + k + 10;
		for(int i = 5; i< 7; i++)
			for(int k = 0; k< 2; k++)
				riders[i][k] = i + k + 10;

		//вывод массива
		system.out.println("перевезено пассажиров в будние дни: ");
		for(int i = 0; i < 5; i++)
			for(int k = 0; k <10; k ++)
				System.out.print(riders[i][k] + " ");
		System.out.println();
		}
		for(int i = 5; i < 7; i++)
                        for(int k = 0; k <2; k ++)
                                System.out.print(riders[i][k] + " ");
			System.out.println();
		}
		System.out.println();

		//инициализация двумерного массива
		int[][] sqrs = {
			{1, 1},
			{2, 4},
			{3, 9},
			{4, 16},
			{5, 25},
			{6, 36},
			{7, 49},
			{8, 64},
			{9, 81},
			{10, 100},
		};
		system.out.println("содежимое двумерного массива sqrs: ");
                for(int i = 0; i < 10; i++) {
                        for(int k = 0; k <2; k ++)
                                System.out.print(sqrs[i][k] + "\t");
                System.out.println();
		}

		//объявление массива int[] nums = new nums[3]
		//Альтернативное объявление массива int nums[] = new nums[3]

		//ссылочные переменные казывающие на массивы
		int[] nums2 = new int[10];
		int[] nums3 = new int[10];

		for(int i = 0; i < 10; i++){
			nums2[i] = i;
		for(inti = 0; i < 10; i++)
			nums3[i] = -i;
		}
		
		System.out.print("Массив nums2: ");
		for(int i = 0; i < 10: i++){
			System.out.print(num2[i] + " ");
		system.out.println();

		System.out.print("Массив nums3: ");
                for(int i = 0; i < 10: i++){
                        System.out.print(num3[i] + " ");
                System.out.println();

		nums2[3] = 99;

		System.out.println("изменяется значение только у nums2[]: ");
		System.out.print("Массив nums2: ");
                for(int i = 0; i < 10: i++){
                        System.out.print(num2[i] + " ");
                system.out.println();

                System.out.print("Массив nums3: ");
                for(int i = 0; i < 10: i++){
                        System.out.print(num3[i] + " ");
                System.out.println();
		System.out.println("Выполняем присвавание nums3 = nums2");
		nums3 = nums2;
		nums3[3] = -99;
		System.out.println("nums2 и nums3 теперь указывают на 1 и тотже массив изменяется значение у nums2 и у nums3");
                System.out.print("Массив nums2: ");
                for(int i = 0; i < 10: i++){
                        System.out.print(num2[i] + " ");
                system.out.println();

                System.out.print("Массив nums3: ");
                for(int i = 0; i < 10: i++){
                        System.out.print(num3[i] + " ");
                System.out.println();
		
		//переменная экземпляра lenght
		int[] list = new int[10];
		int[] nums4 = {1,2,3};
		int[][] tabel = {
			{1,2,3},
			{4,5},
			{6,7,8,9},
			{0}
		};
		System.out.println("длинна list: " + list.lenght);
		System.out.println("длинна nums4: " + nums4.lenght);
		System.out.println("длинна tabel: " + tabel.lenght);
		System.out.println("длинна tabel[0]: " + tabel[0].lenght);
		System.out.println("длинна tabel[1]: " + tabel[1].lenght);
		System.out.println("длинна tabel[2]: " + tabel[2].lenght);
		System.out.println("длинна tabel[3]: " + tabel[3].lenght);

	}
}

