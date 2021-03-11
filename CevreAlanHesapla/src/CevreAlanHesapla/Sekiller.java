package CevreAlanHesapla;

import java.util.Scanner;

public class Sekiller {
	Scanner obj=new Scanner(System.in);
	int kenar1,kenar2,taban,yukseklik;
	Alan_Hesap a=new Alan_Hesap();
	public Sekiller()
	{
		System.out.println("[1]Kare\n[2]Dikdörtgen\n[3]Ücgen\nÞekli Seçiniz : ");
		int secim=obj.nextInt();
		switch(secim)
		{
		case 1:
			System.out.println("Karenin kenarýný giriniz : ");
			kenar1=obj.nextInt();
			a.hesapla(kenar1);
			System.out.println("ALAN = "+a.getAlan());
			System.out.println("Çevre = "+a.getCevre());
			break;
		case 2:
			System.out.println("Dikdörtgenin kenarlarýný giriniz : ");
			kenar1=obj.nextInt();
			kenar2=obj.nextInt();
			a.hesapla(kenar1,kenar2);
			System.out.println("ALAN = "+a.getAlan());
			System.out.println("Çevre = "+a.getCevre());
			break;
		case 3:
			System.out.println("Ücgenin 2 kenarýný ardýndan tabanýný ve yüksekliðini giriniz : ");
			kenar1=obj.nextInt();
			kenar2=obj.nextInt();
			taban=obj.nextInt();
			yukseklik=obj.nextInt();
			a.hesapla(kenar1,kenar2,taban,yukseklik);
			System.out.println("ALAN = "+a.getAlan());
			System.out.println("Çevre = "+a.getCevre());
			break;
		}
	}
	
}
