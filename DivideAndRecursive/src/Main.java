import java.util.Scanner;

public class Main {
	
	/*Cumle icindeki harfleri hesaplayan fonksiyon.*/
	public static int harfHesapla(String cumle){
		int counter = 0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) != ' ' && cumle.charAt(i) != '.' && cumle.charAt(i) != ','){
				counter++;
			}
		}
		return counter;
	}
	
	/*Cumle icindeki heceleri hesaplayan fonksiyon.*/
	public static int heceHesapla(String cumle){
		int counter = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) == 'a' || cumle.charAt(i) == 'e' || cumle.charAt(i) == 'i' || cumle.charAt(i) == 'o' ||  cumle.charAt(i) == 'u' ||  cumle.charAt(i) == 'ü' ||  cumle.charAt(i) == 'ö' ||  cumle.charAt(i) == 'ı'){
				counter++;
			}
		}
		return counter;
	}
	
	/*Cumle icindeki kelimeleri hesaplayan fonksiyon.*/
	public static int kelimeHesapla(String cumle){
		int counter = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i)==' ' && cumle.charAt(i+1) != ' ' && cumle.charAt(i+2) != ' '){
				counter++;
			}
		}
		return (counter+1);
	}
	
	/*Integer verilen degerin String karsiligini donduren fonksiyon.*/
	public static String kelimeyeCevir(int sayi){
		int sayi2 = sayi;
		int basamak,sayac=0;
		String cumle="";
		
		/*Girilen sayinin kac basamakli oldugu bulunuyor.*/
		while(sayi2>0)
		{
			basamak = sayi2 % 10;
			sayi2 = sayi2 / 10;
			sayac++;
		}
		
		/*Basamak sayisi buyuklugunde dizi olusturuluyor.*/
		int [] dizi = new int[sayac];
		
		sayac = 0; //Sayaac tekrar kullanilmak uzere sifirlaniyor.
		
		/*Her basamak degeri tek tek bulunup dizi'ye atiliyor.*/
		while(sayi>0)
		{
			basamak = sayi % 10;
			dizi[sayac] = basamak;
			sayi = sayi / 10;
			sayac++;
		}
		
		sayac = sayac -1;
		
		while(sayac>=0)
		{
			if(sayac == 0)
			{
				switch(dizi[sayac])
				{
				case 1: cumle += "bir"; break;
				case 2: cumle += "iki"; break;
				case 3: cumle += "üç"; break;
				case 4: cumle += "dört"; break;
				case 5: cumle += "beş"; break;
				case 6: cumle += "altı"; break;
				case 7: cumle += "yedi"; break;
				case 8: cumle += "sekiz"; break;
				case 9: cumle += "dokuz"; break;
				}
			}
			if(sayac == 1)
			{
				switch(dizi[sayac])
				{
				case 1: cumle += "on "; break;
				case 2: cumle += "yirmi "; break;
				case 3: cumle += "otuz "; break;
				case 4: cumle += "kirk "; break;
				case 5: cumle += "elli "; break;
				case 6: cumle += "altmis "; break;
				case 7: cumle += "yetmis "; break;
				case 8: cumle += "seksen "; break;
				case 9: cumle += "doksan "; break;
				}
			}
			if(sayac == 2)
			{
				switch(dizi[sayac])
				{
				case 1: cumle += "yuz"; break;
				case 2: cumle += "ikiyuz"; break;
				case 3: cumle += "ucyuz"; break;
				case 4: cumle += "dortyuz"; break;
				case 5: cumle += "besyuz"; break;
				case 6: cumle += "altiyuz"; break;
				case 7: cumle += "yediyuz"; break;
				case 8: cumle += "sekizyuz"; break;
				case 9: cumle += "dokuzyuz"; break;
				}
			}
			sayac--;
		}
		return cumle;
	}
	
	/*Girilen cumlede X,Y,Z nin olup olmadigini tutan degiskenler.*/
	public static boolean xVar = false;
	public static boolean yVar = false;
	public static boolean zVar = false;
	
	/*x,y,z degerlerinin degistirilip degistirilmedigini tutan degiskenler*/
	public static boolean xB = false;
	public static boolean yB = false;
	public static boolean zB = false;
	
	/*harf,hece,kelime degerlerinin eski degerlerini tutan degiskenler*/
	public static String oldHarfSayisi = new String(); 
	public static String oldHeceSayisi = new String();
	public static String oldKelimeSayisi = new String();
	
	/*Harf sayisini yazi olarak guncelleme yapan fonksiyon*/
	public static void harfHesaplaFonk(){
		if(zB==false) //Z degeri bulunmusmu ve degistirilmismi diye kontrol ediliyor.
		{
			int harfSayisi = harfHesapla(cumle);
			String deger = kelimeyeCevir(harfSayisi);
			cumle = cumle.replaceFirst("Z", deger);
			oldHarfSayisi = deger;
			zB = true;
			System.out.println(cumle);
			return;
		}
		else if(zB == true)
		{
			int harfSayisi = harfHesapla(cumle);
			cumle = cumle.replaceFirst(oldHarfSayisi, kelimeyeCevir(harfSayisi));
			oldHarfSayisi = kelimeyeCevir(harfSayisi);
			System.out.println(cumle);
			return;
		}
	}
	
	/*Hece sayisini yazi olarak guncelleme yapan fonksiyon*/
	public static void heceHesaplaFonk(){
		if(yB==false) //Y degeri bulunmusmu ve degistirilmismi diye kontrol ediliyor.
		{
			int heceSayisi = heceHesapla(cumle);
			String deger = kelimeyeCevir(heceSayisi);
			cumle = cumle.replaceFirst("Y", deger);
			oldHeceSayisi = deger;
			yB = true;
			System.out.println(cumle);
			return;
		}
		else if(yB == true)
		{
			int heceSayisi = heceHesapla(cumle);
			cumle = cumle.replaceFirst(oldHeceSayisi, kelimeyeCevir(heceSayisi));
			oldHeceSayisi = kelimeyeCevir(heceSayisi);
			System.out.println(cumle);
			return;
		}
	}
	
	/*Kelime sayisini yazi olarak guncelleme yapan fonksiyon*/
	public static void kelimeHesaplaFonk(){
		if(xB==false) //X degeri bulunmusmu ve degistirilmismi diye kontrol ediliyor.
		{
			int kelimeSayisi = kelimeHesapla(cumle);
			String deger = kelimeyeCevir(kelimeSayisi);
			cumle = cumle.replaceFirst("X", deger);
			oldKelimeSayisi = deger;
			xB = true;
			System.out.println(cumle);
			return;
		}
		else if(xB == true)
		{
			int kelimeSayisi = kelimeHesapla(cumle);
			cumle = cumle.replaceFirst(oldKelimeSayisi, kelimeyeCevir(kelimeSayisi));
			oldKelimeSayisi = kelimeyeCevir(kelimeSayisi);
			System.out.println(cumle);
			return;
		}
	}
	
	/*Girilenc cumlede X,Y,Z olup olmadigini bulan fonksiyon.*/
	public static void tara(){
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) == 'X') xVar = true;
			else if(cumle.charAt(i) == 'Y') yVar = true;
			else if (cumle.charAt(i) == 'Z') zVar = true;
		}
	}
	
	
	/*Kelimeden harf'e dogru islemlerin yapildigi fonksiyon*/
	public static void islemYap(){
		tara();
		System.out.println(cumle);
		if(xVar == true && yVar == true && zVar == true) XYZ();
		else if(xVar == true && yVar == true) XY();
		else if(xVar == true && zVar == true) XZ();
		else if(yVar == true && zVar == true) YZ();
		else if(xVar == true) X();
		else if(yVar == true) Y();
		else if(zVar == true) Z();
	}
	
	/*Sadece kelime varsa islem yapacak fonksyion*/
	public static void X(){
		while(!oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle))))
		{
			kelimeHesaplaFonk();
			X();
		}
	}
	
	/*Sadece hece varsa islem yapacak fonksyion*/
	public static void Y(){
		while(!oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle))))
		{
			heceHesaplaFonk();
			Y();
		}
	}
	
	/*Sadece harf varsa islem yapacak fonksiyon*/
	public static void Z(){
		while(!oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle))))
		{
			harfHesaplaFonk();
			Z();
		}
	}
	
	
	public static void XY()
	{
		while(!oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle))) && !oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle))))
		{
			kelimeHesaplaFonk();
			XY();
			heceHesaplaFonk();
			XY();
		}
	}
	
	public static void XZ()
	{
		while(!oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle))) && !oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle))))
		{
			kelimeHesaplaFonk();
			XZ();
			harfHesaplaFonk();
			XZ();
		}
	}
	
	public static void YZ()
	{
		while(!oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle))) && !oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle))))
		{
			heceHesaplaFonk();
			YZ();
			harfHesaplaFonk();
			YZ();
		}
	}
	
	
	public static void XYZ()
	{
		while(!oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle))) && !oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle))) &&!oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle))))
		{
			kelimeHesaplaFonk();
			XYZ();
			heceHesaplaFonk();
			XYZ();
			harfHesaplaFonk();
			XYZ();
		}
	}
	
	public static String cumle = new String();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Bir cumle giriniz : ");
		cumle = scan.nextLine();
		
		islemYap(); //Kelimeden harfe dogru sirada hesaplama yapan fonksiyon
	}

}
