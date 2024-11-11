//Пузырьковая сортировка
class {
	public static void main(String[] args) {
		int[] nums = {34, 353, 521, 24, -242, -10, 583, 32, 122, -44};
		int a, b, t;
		int size;

		size = 10;

		//Отоброжение исходного массива
		System.out.print("исходный массив: ");
		for(int i = 0; i<size; i++)
			System.out.println(" " + nums[i]);
		System.out.println();
		//сортировка
		for(a = 1; a < size; a++) {
			System.out.print("интерация" + a + "внешний цикл");
			vnesh++;
			for(b=size-1; b>=a; b--) {
				System.out.print("интерация" + b + "внутренний цикл");
				vnurt++;
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
				        nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
		//отображение отсортированного массива
		System.out.print("отсортиованный массив ");
		for(int i = 0; i<size; i++)
                        System.out.println(" " +nums[i]);
                System.out.println();
		System.out.println("Количество внешних проходов" + vnesh + "\nколичество внутренних проходов:" + vnutr );
		System.out.println();
			}
	}
}
