package CevreAlanHesapla;

import java.util.Scanner;

public class Sekiller {
	Scanner obj=new Scanner(System.in);
	int kenar1,kenar2,taban,yukseklik;
	Alan_Hesap a=new Alan_Hesap();
	public Sekiller()
	{
		System.out.println("[1]Kare\n[2]Dikd�rtgen\n[3]�cgen\n�ekli Se�iniz : ");
		int secim=obj.nextInt();
		switch(secim)
		{
		case 1:
			System.out.println("Karenin kenar�n� giriniz : ");
			kenar1=obj.nextInt();
			a.hesapla(kenar1);
			System.out.println("ALAN = "+a.getAlan());
			System.out.println("�evre = "+a.getCevre());
			break;
		case 2:
			System.out.println("Dikd�rtgenin kenarlar�n� giriniz : ");
			kenar1=obj.nextInt();
			kenar2=obj.nextInt();
			a.hesapla(kenar1,kenar2);
			System.out.println("ALAN = "+a.getAlan());
			System.out.println("�evre = "+a.getCevre());
			break;
		case 3:
			System.out.println("�cgenin 2 kenar�n� ard�ndan taban�n� ve y�ksekli�ini giriniz : ");
			kenar1=obj.nextInt();
			kenar2=obj.nextInt();
			taban=obj.nextInt();
			yukseklik=obj.nextInt();
			a.hesapla(kenar1,kenar2,taban,yukseklik);
			System.out.println("ALAN = "+a.getAlan());
			System.out.println("�evre = "+a.getCevre());
			break;
		}
	}
	
}
