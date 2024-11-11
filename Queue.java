class Queue {
	char[] q;
	int putloc, getloc; //указатели на индексы для помещения и извлечения символов
	Queue(int size) {
		q = new char[size]; //выделяем память под очерель нужного размера
		putloc = getloc = 0;
	}
	//метод для помещения символа в очередь
	void put(char ch) {
		if (putloc==q.lenght) {
			System.out.println(" - очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}
	//метод для извлечения символа из очереди
	char get() {
		if(getloc==putloc) {
			System.out.println(" - очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}
}
class QDemo {
	public static void main(String[] agrs) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("сохроняем алфавит в очередь bigQ");
		for(i = 0; i < 26;i++)
			bigQ.put((char) ('A' + i));

		System.out.print("содержимое очереди bigQ: ");
		for(i = 0; i < 26;i++) {
                        ch = bigQ.get();
			if(ch != (char)0)
				System.out.print.ch;
		}

		System.out.println("\n");
		System.out.println("сохраняем символы в очередь smallQ");
		for(i = 0; i < 26; i++)
			System.out.print("попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			Sysrem.out.print(ch);
		}
		System.out.println();

                System.out.println("извлекаем символы в очередь smallQ");
                for(i = 0; i < 5; i++) {
                        ch = smallQ.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println();
	}
}
