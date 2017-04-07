import java.util.Scanner;

public class Main {
	
	/*Cumle icindeki harfleri hesaplayan fonksiyon.*/
	public static int harfHesapla(String cumle){
		int counter = 0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) != ' '){
				counter++;
			}
		}
		return counter;
	}
	
	/*Cumle icindeki heceleri hesaplayan fonksiyon.*/
	public static int heceHesapla(String cumle){
		int counter = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) == 'a' || cumle.charAt(i) == 'e' || cumle.charAt(i) == 'i' || cumle.charAt(i) == 'o' ||  cumle.charAt(i) == 'u'){
				counter++;
			}
		}
		return counter;
	}
	
	/*Cumle icindeki kelimeleri hesaplayan fonksiyon.*/
	public static int kelimeHesapla(String cumle){
		int counter = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i)==' '){
				counter++;
			}
		}
		return counter+1;
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
				case 3: cumle += "uc"; break;
				case 4: cumle += "dort"; break;
				case 5: cumle += "bes"; break;
				case 6: cumle += "alti"; break;
				case 7: cumle += "yedi"; break;
				case 8: cumle += "sekiz"; break;
				case 9: cumle += "dokuz"; break;
				}
			}
			if(sayac == 1)
			{
				switch(dizi[sayac])
				{
				case 1: cumle += "on"; break;
				case 2: cumle += "yirmi"; break;
				case 3: cumle += "otuz"; break;
				case 4: cumle += "kirk"; break;
				case 5: cumle += "elli"; break;
				case 6: cumle += "altmis"; break;
				case 7: cumle += "yetmis"; break;
				case 8: cumle += "seksen"; break;
				case 9: cumle += "doksan"; break;
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
	
	/*x,w,q degerlerinin degistirilip degistirilmedigini tutan degiskenler*/
	public static boolean xB = false;
	public static boolean wB = false;
	public static boolean qB = false;
	
	/*harf,hece,kelime degerlerinin eski degerlerini tutan degiskenler*/
	public static String oldHarfSayisi = new String(); 
	public static String oldHeceSayisi = new String();
	public static String oldKelimeSayisi = new String();
	
	/*Harf sayisini yazi olarak guncelleme yapan fonksiyon*/
	public static void harfHesaplaFonk(){
		if(xB==false) //x degeri bulunmusmu ve degistirilmismi diye kontrol ediliyor.
		{
			int harfSayisi = harfHesapla(cumle);
			String deger = kelimeyeCevir(harfSayisi);
			cumle = cumle.replace("x", deger);
			oldHarfSayisi = deger;
			xB = true;
			System.out.println(cumle);
			return;
		}
		else if(xB == true)
		{
			int harfSayisi = harfHesapla(cumle);
			cumle = cumle.replace(oldHarfSayisi, kelimeyeCevir(harfSayisi));
			oldHarfSayisi = kelimeyeCevir(harfSayisi);
			System.out.println(cumle);
			return;
		}
	}
	
	/*Hece sayisini yazi olarak guncelleme yapan fonksiyon*/
	public static void heceHesaplaFonk(){
		if(wB==false) //w degeri bulunmusmu ve degistirilmismi diye kontrol ediliyor.
		{
			int heceSayisi = heceHesapla(cumle);
			String deger = kelimeyeCevir(heceSayisi);
			cumle = cumle.replace("w", deger);
			oldHeceSayisi = deger;
			wB = true;
			System.out.println(cumle);
			return;
		}
		else if(wB == true)
		{
			int heceSayisi = heceHesapla(cumle);
			cumle = cumle.replace(oldHeceSayisi, kelimeyeCevir(heceSayisi));
			oldHeceSayisi = kelimeyeCevir(heceSayisi);
			System.out.println(cumle);
			return;
		}
	}
	
	/*Kelime sayisini yazi olarak guncelleme yapan fonksiyon*/
	public static void kelimeHesaplaFonk(){
		if(qB==false) //q degeri bulunmusmu ve degistirilmismi diye kontrol ediliyor.
		{
			int kelimeSayisi = kelimeHesapla(cumle);
			String deger = kelimeyeCevir(kelimeSayisi);
			cumle = cumle.replace("q", deger);
			oldKelimeSayisi = deger;
			qB = true;
			System.out.println(cumle);
			return;
		}
		else if(qB == true)
		{
			int kelimeSayisi = kelimeHesapla(cumle);
			cumle = cumle.replace(oldKelimeSayisi, kelimeyeCevir(kelimeSayisi));
			oldKelimeSayisi = kelimeyeCevir(kelimeSayisi);
			System.out.println(cumle);
			return;
		}
	}
	
	/*Islemlerin yapildigi ana fonksiyon.(harften kelimeye dogru)*/
	public static void islemYap(){
		while(!oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle))))
		{
			while (!oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle)))) 
			{
					while(!oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle))))
					{
						if(oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle)))){
							break;
						}
						else{
							harfHesaplaFonk();
							islemYap();
						}
					}
					if(oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle)))){
						break;
					}else{
						heceHesaplaFonk();
						islemYap();
				  }		
			  }
			if(oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle)))){
				break;
			}else{
				kelimeHesaplaFonk();
				islemYap();
			}
	    }
	}
	
	/*Kelimeden harf'e dogru islemlerin yapildigi fonksiyon*/
	public static void islemYap2(){
		while(!oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle))))
		{
			while (!oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle)))) 
			{
					while(!oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle))))
					{
						if(oldKelimeSayisi.equals(kelimeyeCevir(kelimeHesapla(cumle)))){
							break;
						}
						else{
							kelimeHesaplaFonk();
							islemYap2();
						}
					}
					if(oldHeceSayisi.equals(kelimeyeCevir(heceHesapla(cumle)))){
						break;
					}else{
						heceHesaplaFonk();
						islemYap2();
				  }		
			  }
			if(oldHarfSayisi.equals(kelimeyeCevir(harfHesapla(cumle)))){
				break;
			}else{
				harfHesaplaFonk();
				islemYap2();
			}
	    }
	}
	
	public static String sabit = new String(" Cumlesinde x tane harf w tane hece q tane kelime vardir.");
	public static String cumle = new String();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Bir cumle giriniz : ");
		cumle = scan.nextLine();
		cumle = cumle + sabit;

		islemYap2();
	}

}
