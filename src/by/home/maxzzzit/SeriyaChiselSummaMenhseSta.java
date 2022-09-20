package by.home.maxzzzit;


// Напишите класс, который генерирует серию однозначных положительных чисел до тех пор, пока сумма значений серии остается меньше 100.
// Класс должен выводить на экран количество значений в сгенерированной серии и их сумму.
public class SeriyaChiselSummaMenhseSta {
	public static void main(String []args) {
		int chislo, sum=0, kolvo=0;
		while (sum<=100) {
			chislo = (int)(Math.random()*10);
			sum+=chislo;
			if (sum>100) break;
			kolvo++;	
			System.out.println("Количество значений в сумме = "+kolvo+" их сумма = "+sum);
		}

	}
}
