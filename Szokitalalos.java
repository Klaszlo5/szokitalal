import java.util.Scanner;
import java.lang.Math;
import java.lang.StringBuilder;

public class Szokitalalos {

	static String[] szavak = {"macska", "eper", "iphone"};
        StringBuilder str = new StringBuilder("Helyettes�t�");
	static String kivalasztott = szavak[(int) (Math.random() * szavak.length)];
	static String hosszbetux = new String(new char[kivalasztott.length()]).replace("\0", "^");
	static int index = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (index < 10 && hosszbetux.contains("*")) {
			System.out.println("Tal�ld ki a bet�t, a sz�ban.");
			System.out.println(hosszbetux);
			String talalat = sc.next();
			kiv(talalat);
		}
	}
	static void kiv(String talalat) {
		String helyettesit = "";
		for (int i = 0; i < kivalasztott.length(); i++) {
			if (kivalasztott.charAt(i) == talalat.charAt(0)) {
				helyettesit += talalat.charAt(0);
			} else if (hosszbetux.charAt(i) != '^') {
				helyettesit += kivalasztott.charAt(i);
			} else {
				helyettesit += "^";
			}
		}

		if (hosszbetux.equals(helyettesit)) {
			index++;
			probalkozasok();
		} else {
			hosszbetux = helyettesit;
		}
		if (hosszbetux.equals(kivalasztott)) {
			System.out.println("Megnyerted. a sz� " + kivalasztott + "volt.");
		}
	}

	public static void probalkozasok() {
                if(index == 1 || index == 2 || index == 3 || index == 4 
                    || index == 5 || index == 6 || index == 7 || index == 8 
                    || index == 9) 
                { 
                    System.out.println("Pr�b�lkozz m�g.");
                    index--;
                } 
                else if((index == 10))
                {
                    System.out.println("Kifogytak a tal�lgat�si lehet�s�gek");
                    System.out.println("A sz�: " + kivalasztott + "volt.");
                } 
	}
}