
import java.io.*;
public class ConviertePal {

	public static void main(String[] args) throws IOException{
		int car, pre = '\n';
		System.out.println("\nEscribir un texto, termina con Ctrl z");
		System.out.flush();
		while((car = System.in.read()) != -1){
			if(car == '\r'){
				car = System.in.read(); //previene el fin de linea: \r\n
			}
			if(pre == ' ' || pre == '\n'){
				car = (car >= 'a' && car <= 'z') ? car+'A'-'a' : car;
			}
			System.out.print((char)car);
			pre = car;
		}
	}

}
