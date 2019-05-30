import java.util.Scanner;

public class Condicionales{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		int numa = 15, numb, sum, res, mul;
		float div = 0;
		

		System.out.println("Ingrese operacion: 1-Suma 2-Resta 3-Multiplicacion 4-Division");
		op = in.nextInt();

		

		if (op < 5) {
			System.out.println("Ingrese numero uno: ");
			numa = in.nextInt();

			System.out.println("Ingrese numero dos: ");
			numb = in.nextInt();

			switch (op) {
				case 1: System.out.println("La suma es --> "+(numa+numb));
					break;
				case 2: System.out.println("La resta es --> "+(numa-numb));
					break;
				case 3: System.out.println("La multiplicacion es --> "+(numa*numb));
					break;
				case 4: System.out.println("La division es --> "+(numa/numb));
					break;
			}
		} else {
			System.out.println("Opcion ingresada incorrecta");
		}
	}
}