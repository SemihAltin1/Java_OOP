package CevreAlanHesapla;

public class Alan_Hesap {
	private int alan,cevre;
	
	public void hesapla(int kenar1)
	{
		this.alan=kenar1*kenar1;
		this.cevre=kenar1*4;
	}
	public void hesapla(int kenar1,int kenar2)
	{
		this.alan=kenar1*kenar2;
		this.cevre=2*(kenar1+kenar2);
	}
	public void hesapla(int kenar1,int kenar2,int taban,int yukseklik)
	{
		this.alan=taban*yukseklik/2;
		this.cevre=kenar1+kenar2+taban;
	}
	
	
	public int getAlan()
	{
		return alan;
	}
	public int getCevre()
	{
		return cevre;
	}
	
}
