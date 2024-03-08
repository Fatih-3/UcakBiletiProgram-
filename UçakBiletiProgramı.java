import java.util.Scanner;

public class UçakBiletiProgramı {
	  Scanner userInput = new Scanner(System.in);
	     
      System.out.println("THY hoşgeldiniz.");
      System.out.println("Nereye uçmak istersiniz?\n 1- İstanbul\n 2- Madrid\n 3-Barcelona\n 4- Amstersdam");
      int nereye = userInput.nextInt();
      int gidisFiyat,donusFiyat,toplamFiyat;
      if (nereye == 1) { // İstanbul
          gidisFiyat = 273;
          donusFiyat = 273;
      } else if (nereye == 2) { // Madrid
          gidisFiyat = 320;
          donusFiyat = 320;
      } else if (nereye == 3) { // Barcelona
          gidisFiyat = 400;
          donusFiyat = 400;
      } else if (nereye == 4) { // Amstersdam
          gidisFiyat = 200;
          donusFiyat = 200;
      } else {
          System.out.println("Geçersiz bir seçim yaptınız.");
          return;
      }
      System.out.println("Uçuşunuz tek yön mü, gidiş dönüş mü olacak?\n 1- Tek Yön\n 2- Gidiş Dönüş");
      int ucusTercihi = userInput.nextInt();

      if (ucusTercihi == 1) {
          toplamFiyat = gidisFiyat;
      } else if (ucusTercihi == 2) {
          toplamFiyat = gidisFiyat + donusFiyat;
      } else {
          System.out.println("Geçersiz bir seçim yaptınız.");
          return;
      }

      System.out.println("Bilet fiyatı: " + toplamFiyat + "$");

      int toplamYolcuFiyati = 0;
      while (true) {
          System.out.println("Yolcu bilgilerini giriniz.");
          System.out.print("Ad: ");
          String ad = userInput.next();
          System.out.print("Soyad: ");
          String soyad = userInput.next();
          System.out.print("Yaş: ");
          int yas = userInput.nextInt();
          int fiyat = toplamFiyat;

          if (yas < 12) {
              fiyat *= 0.5;
              System.out.println("Yolcu 12 yaşından küçük olduğu için %50 indirim \n" + "İndirimli fiyat: " + fiyat + "$");
          } else if (yas >= 12 && yas <= 24) {
              fiyat *= 0.9;
              System.out.println("Yolcu 12-24 yaş arasında olduğu için %10 indirim \n" + "İndirimli fiyat: " + fiyat + "$");
          } else if (yas >= 65) {
              fiyat *= 0.7;
              System.out.println("Yolcu 65 yaş ve üstü olduğu için %30 indirim \n" + "İndirimli fiyat:" + fiyat + "$");
          }

          System.out.println(ad + " " + soyad + " adlı yolcunun bileti oluşturuldu.");

          toplamYolcuFiyati += fiyat;

          System.out.println("Başka bir yolcu eklemek ister misiniz? (Evet/Hayır)");
          String devam = userInput.next();
          
          if (!devam.equalsIgnoreCase("Evet")) {
              break;
          }
      }
      System.out.println("Toplam ödenecek tutar: " + toplamYolcuFiyati + "$");
      System.out.println("1- Satın Al\t\t 2-Çıkış Yap");
      
      int secim=userInput.nextInt();
      if (secim==1) {
			System.out.println("Ödeme başarıyla tamamlandı.\n İyi yolculuklar.");
		} else {
			System.exit(secim);
		}
  }
}
