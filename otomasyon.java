import java.util.*;
import java.io.*;

public class otomasyon {         
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int a=0,ogr=0,ogrtm=0,mem=0,ogrs=0,ogrtms=0,mems=0;
        dosyaislemleri();
        while(a!=4){
        System.out.println("Secim yapiniz  \n1:Ogrenci\n2:Ogretmen\n3:Idari Memur\n4:Otomasyondan cikis");
        a = x.nextInt();
        switch(a){
            case(1):
                System.out.println("Ogrenci sistemine hosgeldiniz");
                ogrenci obj1 = new ogrenci();
                try{
                while(ogr!=3){
        System.out.println("Islem seciniz \n1:Uye ol\n2:Giris yap\n3:Cikis yap");
        ogr = x.nextInt();
                    switch(ogr){
                    case(1):
                        obj1.uyeol();
                        obj1.kaydet();
                        break;
                    case(2):
                        if(obj1.girisyap()==1){        
                            System.out.println("Secim yapiniz  \n1:Secilebilecek dersleri goruntule\n2:Not goruntule"
                + "\n3:Harf notu goruntule\n4:Ders secme\n5:Kisisel bilgileri goruntule"
                + "\n6:Goruntuleme diger\n7:Ders programi goruntule\n8:Cikis");
                            while(ogrs!=8){
        System.out.println("9:Yapilabilecek islemleri tekrar goruntule");
        ogrs = x.nextInt();
                            switch(ogrs){
                        case(1):
                            ogrenci.derslerigoruntule();
                            break;
                            case(2):
                                obj1.notgoruntule();
                            break;
                            case(3):
                                obj1.harfnotugoruntule();
                            break;
                            case(4):
                                obj1.derssecme();
                            break;
                            case(5):
                                obj1.kisiselbilgiler();
                            break;
                            case(6):
                                obj1.goruntulemedigerleri();
                            break;
                            case(7):
                                ogrenci.dersprogramigoruntule();
                            break;
                            case(8):
                                System.out.println("Cikis yapildi");
                                break;
                                case(9):
                                    System.out.println("Secim yapiniz  \n1:Secilebilecek dersleri goruntule\n2:Not goruntule"
                + "\n3:Harf notu goruntule\n4:Ders secme\n5:Kisisel bilgileri goruntule"
                + "\n6:Goruntuleme diger\n7:Ders programi goruntule\n8:Cikis");
                                    break;
                            default:
                                System.out.println("yanlis giris yaptiniz");
                                        break;
                                }
                            }
                        }
                        break;
                    case(3):
                        obj1.cikisyap();
                        break;
                    default:
                        System.out.println("Yanlis giris yaptiniz");
                        break;
                }
                }}catch(Exception e){}
                break;
            case(2):
                System.out.println("Ogretmen sistemine hosgeldiniz");
                System.out.println("Ogretmenler yalnizca kendi dersleriyle ilgili islemleri yapabilirler");
                ogretmen obj2 = new ogretmen();
                try{
                while(ogrtm!=3){
        System.out.println("Islem seciniz \n1:Uye ol\n2:Giris yap\n3:Cikis yap\n4:Ogretmeni olunabilecek dersleri goruntule");
        ogrtm = x.nextInt();
                    switch(ogrtm){
                    case(1):
                        obj2.uyeol();
                        obj2.kaydet();
                        break;
                    case(2):
                        if(obj2.girisyap()==1){
                        System.out.println("Secim yapiniz  \n1:Harf notu belirle\n2:Not gir"
                + "\n3:Harf notu goruntule\n4:Not goruntule\n5:Yoklama al"
                + "\n6:Yokalama goruntule\n7:Ders programi hazirla\n8:Ders programi goruntule"
                                + "\n9:Kisisel bilgileri goruntule\n10:Goruntuleme diger\n11:Cikis");
                            while(ogrtms!=11){
        System.out.println("12:Yapilabilecek islemleri tekrar goruntule");
        ogrtms = x.nextInt();
                            switch(ogrtms){
                        case(1):
                            obj2.harfnotubelirle();
                            break;
                            case(2):
                                obj2.notgir();
                            break;
                            case(3):
                                obj2.harfnotugoruntule();
                            break;
                            case(4):
                                obj2.notgoruntule();
                            break;
                            case(5):
                                obj2.yoklamaal();
                            break;
                            case(6):
                                obj2.yoklamagoruntule();
                            break;
                            case(7):
                                ogretmen.dersprogramihazirla();
                            break;
                            case(8):
                                ogretmen.dersprogramigoruntule();
                            break;
                            case(9):
                                obj2.kisiselbilgiler();
                            break;
                            case(10):
                                obj2.goruntulemedigerleri();
                            break;
                            case(11):
                                System.out.println("Cikis yapildi");
                                break;
                                case(12):
                             System.out.println("Secim yapiniz  \n1:Harf notu belirle\n2:Not gir"
                + "\n3:Harf notu goruntule\n4:Not goruntule\n5:Yoklama al"
                + "\n6:Yokalama goruntule\n7:Ders programi hazirla\n8:Ders programi goruntule"
                                + "\n9:Kisisel bilgileri goruntule\n10:Goruntuleme diger\n11:Cikis");
                               break;
                            default:
                                System.out.println("yanlis giris yaptiniz");
                                        break;
                                }
                            }
                        }
                        break;
                    case(3):
                        obj2.cikisyap();
                        break;
                        case(4):
                        ogretmen.derslerigoruntule();
                        break;
                    default:
                        System.out.println("Yanlis giris yaptiniz");
                        break;
                }
                }}catch(Exception e){}
                break;
            case(3):
                System.out.println("Idari memur sistemine hosgeldiniz");
                System.out.println("Memur sistemi arsiv gibidir daha once girilmis tum "
                        + "verileri yazdirir en son girilen yoklama yada notu goruntulek icin "
                        + "ya ogretmenden ya ogrenciden goruntulenmelidir yada dosyada en son yazana bakilmalidir");
                memur obj3 = new memur();
                try{
                while(mem!=3){
        System.out.println("Islem seciniz \n1:Uye ol\n2:Giris yap\n3:Cikis yap");
        mem = x.nextInt();
                    switch(mem){
                    case(1):
                        obj3.uyeol();
                        obj3.kaydet();
                        break;
                    case(2):
                        if(obj3.girisyap()==1){
                        System.out.println("Secim yapiniz  \n1:Ders ekle\n2:Not gir"
                + "\n3:Not goruntule\n4:Su ana kadar girilmis tum notlari goruntule\n5:Harf notu goruntule"
                + "\n6:Yokalama al\n7:Su ana kadar girilmis tum yoklama goruntule\n8:Dersleri goruntule\n9:Ders programi hazirla\n10:Ders programi goruntule"
                                + "\n11:Kisisel bilgileri goruntule\n12:Goruntuleme diger\n13:Cikis");
                            while(mems!=13){
        System.out.println("14:Yapilabilecek islemleri tekrar goruntule");
        mems = x.nextInt();
                            switch(mems){
                        case(1):
                            obj3.dersekle();
                            break;
                            case(2):
                                obj3.notgir();
                            break;
                            case(3):
                                obj3.notgoruntule();
                            break;
                            case(4):
                                obj3.notlar();
                            break;
                            case(5):
                                obj3.harfnotugoruntule();
                            break;
                            case(6):
                            obj3.yoklamaal();
                             break;
                                case(7):
                                obj3.yoklamagoruntule();
                                break;
                            case(8):
                                memur.derslerigoruntule();
                            break;
                            case(9):
                                memur.dersprogramihazirla();
                            break;
                            case(10):
                                memur.dersprogramigoruntule();
                                break;
                                case(11):
                                    obj3.kisiselbilgiler();
                                    break;
                                    case(12):
                                    obj3.goruntulemedigerleri();
                                    break;
                                    case(13):
                                    System.out.println("Cikis");
                                    break;
                                    case(14):
                                    System.out.println("Secim yapiniz  \n1:Ders ekle\n2:Not gir"
                + "\n3:Not goruntule\n4:Su ana kadar girilmis tum notlari goruntule\n5:Harf notu goruntule"
                + "\n6:Yokalama al\n7:Su ana kadar girilmis tum yoklama goruntule\n8:Dersleri goruntule\n9:Ders programi hazirla\n10:Ders programi goruntule"
                                + "\n11:Kisisel bilgileri goruntule\n12:Goruntuleme diger\n13:Cikis");
                                    break;
                            default:
                                System.out.println("yanlis giris yaptiniz");
                                        break;
                                }
                            }
                        }
                        break;
                    case(3):
                        obj3.cikisyap();
                        break;
                    default:
                        System.out.println("Yanlis giris yaptiniz");
                        break;
                }
                }}catch(Exception e){}
                break;
            case(4):
                System.out.println("Hoscakalin");
                break;
            default:
                System.out.println("Yanlis girdiniz tekrar giriniz");
                break;
            }
        }
    }
    private static void dosyaislemleri(){
        try {
      File dosya = new File("ogrenci.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
        try {
      File dosya = new File("ogretmen.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
        try {
      File dosya = new File("memur.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
       try {
      File dosya = new File("dersler.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
try {
      File dosya = new File("alinandersler.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
try {
      File dosya = new File("dersprogrami.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
try {
      File dosya = new File("notlar2.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
try {
      File dosya = new File("harfnotlari.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
try {
      File dosya = new File("yoklama.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
try {
      File dosya = new File("numaralar.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olusturuldu: " + dosya.getName());
      }
    } catch (IOException e) {
      System.out.println("Hata olustu");
    }
    }
}

class ogrenci extends goruntulemeislemleri implements giriscikis,bilgilerigoruntule{
    private String numara,isimalici,soyadalici,numaraalici;
    private File dosya = new File("dersler.txt");
    private File dosya2 = new File("alinandersler.txt");
    private File dosya3 = new File("ogrenci.txt");
    private File dosya4 = new File("notlar2.txt");
    private File dosya5 = new File("ogretmen.txt");
    private File dosya6 = new File("numaralar.txt");
    private String numder,der;
    private int sayar=0,sayar2=0,say=0;
    private Scanner x= new Scanner(System.in);
    void derssecme(){
    System.out.println("Almak istediginiz bir tane dersi yaziniz");
    try {
    Scanner dosyaarar = new Scanner(dosya);
        String ara= x.nextLine();
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(ara)) { 
            System.out.println("Ders bulundu: " +ara);
                BufferedWriter dersyazici = new BufferedWriter(new FileWriter("alinandersler.txt",true));
    dersyazici.append(numara);
     dersyazici.append(' ');
     dersyazici.append(ara);
     dersyazici.append("\n");
     dersyazici.close();
     break;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Ders bulunamadi");
        }
    }
} catch(Exception e) {System.out.println("bir hata olustu");}
        } 
    void notgoruntule(){
    System.out.println("Not goruntulemek istediginiz dersi giriniz");
    der=x.nextLine();
    numder=numara+" "+der;
    try {
    Scanner dosyaarar = new Scanner(dosya4);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayar2++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
    try {
    Scanner dosyaarar = new Scanner(dosya4);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            say++;
            if(say==sayar2){
            System.out.println("Ogrenci bulundu");
            line = dosyaarar.nextLine();
                System.out.println("Vize: " + line);
                line = dosyaarar.nextLine();
                System.out.println("Final: " + line);
     break;
            }
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi almiyorsunuz veya notunuz girilmemis");
        }
    }
} catch(IOException e) {System.out.println("bir hata olustu");}
    }
    void harfnotugoruntule(){
        System.out.println("Harf notunu goruntulemek istediginiz dersi giriniz");
        der=x.nextLine();
        harfnotubelirlehesap(numara,der);
    }
    void kaydet()throws Exception{
        System.out.println("numaranizi giriniz");
        numara=x.nextLine();
    Scanner dosyaarar = new Scanner(dosya6);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numara)) {
            System.out.println("Ayni numarada iki ogrenci olamaz"); 
            break;
        }
            }if(!dosyaarar.hasNextLine()){
        BufferedWriter kaydeder = new BufferedWriter(new FileWriter(dosya3,true));
     kaydeder.append(isim);
     kaydeder.append(' ');
     kaydeder.append(soyisim);
     kaydeder.append(' ');
     kaydeder.append(numara);
     kaydeder.append("\n");
     kaydeder.close();
     BufferedWriter kaydeder2 = new BufferedWriter(new FileWriter(dosya6,true));
     kaydeder2.append(numara);
     kaydeder2.append("\n");
     kaydeder2.close();
        }          
    }                                
    public int  girisyap(){
    System.out.println("isminizi giriniz");
    isimalici = x.nextLine();
    System.out.println("soyadinizi giriniz");
    soyadalici = x.nextLine();
    System.out.println("numaranizi giriniz");
    numaraalici = x.nextLine();
    String bakar = isimalici+" "+soyadalici+" "+numaraalici;
    try {
    Scanner dosyaarar = new Scanner(dosya3);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(bakar)) { 
            System.out.println("Hosgeldiniz " +isimalici+" "+soyadalici);
                isim=isimalici;
                soyisim=soyadalici;
                numara=numaraalici;
            return 1;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Ogrenci bulunamadi");
        }
    }
} catch(FileNotFoundException e) {System.out.println("bir hata olustu");}
    return 0;    
    }
    public void cikisyap(){
        System.out.println("Ogrenci sisteminden cikildi");
    }
    public void kisiselbilgiler(){
    System.out.println(isim + " " + soyisim + " " + numara +" OGRENCI");
    } 
    public void goruntulemedigerleri(){
    System.out.println("Ogretmenler:");
        try{
      Scanner okuyucu = new Scanner(dosya5); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
    }
}

class ogretmen extends memur implements giriscikis,bilgilerigoruntule,yoklama{
   private File dosya = new File("ogretmen.txt");
   private File dosya2 = new File("alinandersler.txt");
   private File dosya3 = new File("notlar2.txt");
   private File dosya4 = new File("harfnotlari.txt");
   private File dosya5 = new File("ogrenci.txt");
   private File dosya6 = new File("yoklama.txt");
   private String isimalici,soyadalici,dersalici,nu,yok,numder,vizenot,finalnot;
   private String hangiders,ff,dd,dc,cc,cb,bb,ba,aa;
   private int sayar=0,sayar2=0,say=0,sayar3=0,sayy=0;
   private Scanner x= new Scanner(System.in);
    void harfnotubelirle() throws Exception{
    System.out.println(hangiders + "dersinin harf notu araligini belirleyiniz");
    System.out.println("FF hangi nota kadar(Sadece bir sayi giriniz) 0-FF");
    ff=x.nextLine();
    System.out.println("DD hangi nota kadar(Sadece bir sayi giriniz) FF-DD");
    dd=x.nextLine();
    System.out.println("DC hangi nota kadar(Sadece bir sayi giriniz) DD-DC");
    dc=x.nextLine();
    System.out.println("CC hangi nota kadar(Sadece bir sayi giriniz) DC-CC");
    cc=x.nextLine();
    System.out.println("CB hangi nota kadar(Sadece bir sayi giriniz) CB-BB");
    cb=x.nextLine();
    System.out.println("BB hangi nota kadar(Sadece bir sayi giriniz) BB-BA");
    bb=x.nextLine();
    System.out.println("BA hangi nota kadar(Sadece bir sayi giriniz) BA-AA");
    ba=x.nextLine();
    System.out.println("AA 100 ve BA araligindadir");
    aa="100";
    BufferedWriter kaydeder = new BufferedWriter(new FileWriter(dosya4,true));
    kaydeder.append(hangiders);
     kaydeder.append("\n");
     kaydeder.append(ff);
     kaydeder.append("\n");
     kaydeder.append(dd);
     kaydeder.append("\n");
     kaydeder.append(dc);
     kaydeder.append("\n");
     kaydeder.append(cc);
     kaydeder.append("\n");
     kaydeder.append(cb);
     kaydeder.append("\n");
     kaydeder.append(bb);
     kaydeder.append("\n");
     kaydeder.append(ba);
     kaydeder.append("\n");
     kaydeder.append(aa);
     kaydeder.append("\n");
     kaydeder.close();
    
    }
    void notgoruntule(){
        System.out.println("Not goruntulemek istediginiz ogrencinin numarasini giriniz");
    nu=x.nextLine();
    numder=nu+" "+hangiders;
    try {
    Scanner dosyaarar = new Scanner(dosya3);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayar2++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
    try {
    Scanner dosyaarar = new Scanner(dosya3);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            say++;
            if(say==sayar2){
            System.out.println("Ogrenci bulundu");
            line = dosyaarar.nextLine();
                System.out.println("Vize: " + line);
                line = dosyaarar.nextLine();
                System.out.println("Final: " + line);
     break;
            }
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi alan ogrenci yok");
        }
    }
} catch(IOException e) {System.out.println("bir hata olustu");}
    }
    void harfnotugoruntule(){
    System.out.println("Harf notunu goruntulemek istediginiz ogrencinin numarasini giriniz");
    nu=x.nextLine();
    harfnotubelirlehesap(nu,hangiders);
    }
    void kaydet()throws Exception{
                    System.out.println("hangi dersin ogretmeni oldugunuzu giriniz");
            hangiders = x.nextLine(); 
    BufferedWriter kaydeder = new BufferedWriter(new FileWriter("ogretmen.txt",true));
    kaydeder.append(isim);
     kaydeder.append(' ');
     kaydeder.append(soyisim);
     kaydeder.append(' ');
     kaydeder.append(hangiders);
     kaydeder.append("\n");
     kaydeder.close();
    } 
    public void notgir(){
    System.out.println("Not girmek istediginiz ogrencinin numarasini giriniz");
        nu=x.nextLine();
        String numder=nu+" "+hangiders;
    try {
    Scanner dosyaarar = new Scanner(dosya2);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            System.out.println("Ogrenci bulundu");
        System.out.println("Vize notunu giriniz");
        vizenot=x.nextLine();
        System.out.println("Final notunu giriniz");
        finalnot=x.nextLine();
         BufferedWriter kaydeder = new BufferedWriter(new FileWriter("notlar2.txt",true));
    kaydeder.write(numder);
     kaydeder.append("\n");
     kaydeder.append(vizenot);
     kaydeder.append("\n");
     kaydeder.append(finalnot);
     kaydeder.append("\n");
     kaydeder.close();
        break;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi alan ogrenci yok");
        }
    }
} catch(Exception e) {System.out.println("bir hata olustu");}
        }
    public int girisyap(){
      System.out.println("isminizi giriniz");
    isimalici = x.nextLine();
    System.out.println("soyadinizi giriniz");
    soyadalici = x.nextLine();
    System.out.println("verdiginiz dersi giriniz");
    dersalici = x.nextLine();
    String bakar = isimalici+" "+soyadalici+" "+dersalici;
    try {
    Scanner dosyaarar = new Scanner(dosya);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(bakar)) { 
            System.out.println("Hosgeldiniz " +isimalici+" "+soyadalici);
                isim=isimalici;
                soyisim=soyadalici;
                hangiders=dersalici;
            return 1;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Ogretmen bulunamadi");
        }
    }
} catch(FileNotFoundException e) {System.out.println("bir hata olustu");}
return 0;
    }
    public void cikisyap(){
        System.out.println("Ogretmen sisteminden cikildi");
    }
    public void kisiselbilgiler(){
    System.out.println(isim + " " + soyisim + " " +hangiders + " OGRETMEN");
    }
    public void goruntulemedigerleri(){
        System.out.println("Ogretmenler:");
        try{
      Scanner okuyucu = new Scanner(dosya); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
        
        System.out.println("Ogrenciler:");
        try{
      Scanner okuyucu = new Scanner(dosya5); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
    }
    public void yoklamagoruntule(){
        System.out.println("Yoklamasina bakmak istediginiz ogrencinin numarasini giriniz");
                nu=x.nextLine();
                numder=nu+" "+hangiders;
    try {
    Scanner dosyaarar = new Scanner(dosya6);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayar3++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
                try {
    Scanner dosyaarar = new Scanner(dosya6);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayy++;
            if(sayy==sayar3){
            System.out.println("Yoklamasi: ");
            System.out.println("Numarasi ve Ders " + line);
            line = dosyaarar.nextLine();
                System.out.println("Geldigi dersler: " + line);
     break;
            }
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi alan ogrenci yok");
        }
    }
} catch(IOException e) {System.out.println("bir hata olustu");}
    }
    public void yoklamaal(){
    System.out.println("Yoklama almak istediginiz ogrencinin numarasini giriniz");
    nu=x.nextLine();
    numder=nu+" "+hangiders;
    try {
    Scanner dosyaarar = new Scanner(dosya2);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            System.out.println("Kac derse geldi");
        yok=x.nextLine();
         BufferedWriter kaydeder = new BufferedWriter(new FileWriter("yoklama.txt",true));
    kaydeder.write(numder);
     kaydeder.append("\n");
     kaydeder.append(yok);
     kaydeder.append("\n");
     kaydeder.close();
        break;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("ogrenci bu dersi almiyor");
        }}}catch(IOException e) {System.out.println("bir hata olustu");}
    }}


class memur extends idariislemler implements giriscikis,bilgilerigoruntule,yoklama{
   private File dosya = new File("alinandersler.txt");
   private File dosya2 = new File("notlar2.txt");
   private File dosya3 = new File("ogrenci.txt");
   private File dosya4 = new File("ogretmen.txt");
   private File dosya5 = new File("memur.txt");
   private File dosya6 = new File("yoklama.txt");
   protected String dersismi,isimalici,soyadalici,yok;
   private int sayar=0,say=0,sayar2=0,sayar3=0,sayy=0;
   private String nu,de,vizenot,finalnot,numder;
   private Scanner x= new Scanner(System.in);
    void dersekle() throws Exception{
        BufferedWriter dersekler = new BufferedWriter(new FileWriter("dersler.txt",true));
        System.out.println("Eklenecek dersin ismini giriniz");
        dersismi=x.nextLine();
     dersekler.append(dersismi);
     dersekler.append("\n");
     dersekler.close();
    }
    void notlar(){
    System.out.println("Ogrenci notlari:");
        try{
      Scanner okuyucu = new Scanner(dosya2); 
        while (okuyucu.hasNextLine()){
            if(sayar==0)
                System.out.print("Numara ve Ders: ");
        if(sayar==1)
                System.out.print("Vize: ");
        if(sayar==2)
                System.out.print("Final: ");
            System.out.println(okuyucu.nextLine());
            sayar++;
            if(sayar == 3)
                sayar =0;
        }
        }catch(Exception e){System.out.println("Bir hata olustu");}
    }
    void notgoruntule(){
    System.out.println("Not goruntulemek istediginiz ogrencinin numarasini giriniz");
    nu=x.nextLine();
    System.out.println("Not goruntulemek istediginiz dersin adini giriniz");
    de=x.nextLine();
    numder=nu+" "+de;
    try {
    Scanner dosyaarar = new Scanner(dosya2);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayar2++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
    try {
    Scanner dosyaarar = new Scanner(dosya2);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            say++;
            if(say==sayar2){
            System.out.println("Ogrenci bulundu");
            line = dosyaarar.nextLine();
                System.out.println("Vize: " + line);
                line = dosyaarar.nextLine();
                System.out.println("Final: " + line);
     break;
            }
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi alan ogrenci yok");
        }
    }
} catch(IOException e) {System.out.println("bir hata olustu");}  
    }
    void harfnotugoruntule(){
    System.out.println("Harf notunu goruntulemek istediginiz ogrencinin numarasini giriniz");
    nu=x.nextLine();
    System.out.println("Goruntulemek istedigniz dersi giriniz");
    de=x.nextLine();
    harfnotubelirlehesap(nu,de);
    }
    void kaydet()throws Exception{
    BufferedWriter kaydeder = new BufferedWriter(new FileWriter("memur.txt",true));
    kaydeder.append(isim);
     kaydeder.append(' ');
     kaydeder.append(soyisim);
     kaydeder.append("\n");
     kaydeder.close();
    }
    public void notgir(){
        System.out.println("Not girmek istediginiz ogrencinin numarasini giriniz");
        nu=x.nextLine();
        System.out.println("Not girmek istediginiz dersin adini giriniz");
        de=x.nextLine();
        numder=nu+" "+de;
    try {
    Scanner dosyaarar = new Scanner(dosya);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            System.out.println("Ogrenci bulundu");
        System.out.println("Vize notunu giriniz");
        vizenot=x.nextLine();
        System.out.println("Final notunu giriniz");
        finalnot=x.nextLine();
         BufferedWriter kaydeder = new BufferedWriter(new FileWriter("notlar2.txt",true));
    kaydeder.write(numder);
     kaydeder.append("\n");
     kaydeder.append(vizenot);
     kaydeder.append("\n");
     kaydeder.append(finalnot);
     kaydeder.append("\n");
     kaydeder.close();
     break;
        }
    }if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi alan ogrenci yok");
        }
} catch(IOException e) {System.out.println("bir hata olustu");}
}
    public int girisyap(){
    System.out.println("isminizi giriniz");
    isimalici = x.nextLine();
    System.out.println("soyadinizi giriniz");
    soyadalici = x.nextLine();
    String bakar = isimalici+" "+soyadalici;
    try {
    Scanner dosyaarar = new Scanner(dosya5);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(bakar)) { 
            System.out.println("Hosgeldiniz " +isimalici+" "+soyadalici);
                isim=isimalici;
                soyisim=soyadalici;
                return 1;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("Idari memur bulunamadi");
        }
    }
} catch(FileNotFoundException e) {System.out.println("bir hata olustu");}
 return 0;
    }
    public void cikisyap(){
        System.out.println("Idari memur sisteminden cikildi");
    }
    public void kisiselbilgiler(){
    System.out.println(isim + " " + soyisim + " IDARI MEMUR");
    }
    public void goruntulemedigerleri(){
    System.out.println("Ogretmenler:");
        try{
      Scanner okuyucu = new Scanner(dosya4); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
            System.out.println("Ogrenciler:");
        try{
      Scanner okuyucu = new Scanner(dosya3); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
    System.out.println("Idari memurlar:");
        try{
      Scanner okuyucu = new Scanner(dosya5); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
    }
    public void yoklamagoruntule(){
            System.out.println("Alinan yoklamalar:");
        try{
      Scanner okuyucu = new Scanner(dosya6); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
    }
    public void yoklamaal(){
        System.out.println("Yoklama almak istediginiz ogrencinin numarasini giriniz");
    nu=x.nextLine();
    System.out.println("Yoklama almak istediginiz dersi giriniz giriniz");
    de=x.nextLine();
    numder=nu+" "+de;
    try {
    Scanner dosyaarar = new Scanner(dosya2);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            System.out.println("Kac derse geldi");
        yok=x.nextLine();
         BufferedWriter kaydeder = new BufferedWriter(new FileWriter("yoklama.txt",true));
    kaydeder.write(numder);
     kaydeder.append("\n");
     kaydeder.append(yok);
     kaydeder.append("\n");
     kaydeder.close();
        break;
        }else if(!dosyaarar.hasNextLine()){
            System.out.println("ogrenci bu dersi almiyor");
        }}}catch(IOException e) {System.out.println("bir hata olustu");}
}                                                                               
}

abstract class idariislemler extends goruntulemeislemleri{
    static String girilendersler="";
    static File dosyadersler = new File("dersler.txt");
    static File dosyadersprogrami = new File("dersprogrami.txt");
    static Scanner dersprogramialici= new Scanner(System.in);
    public static void dersprogramihazirla() {
            try{
                System.out.println("Ders programi hazirlamaya hosgelndiniz: ");
           BufferedWriter dersprogramikaydeder = new BufferedWriter(new FileWriter(dosyadersprogrami));
           System.out.println("Pazartesi gunku dersleri giriniz: ");
           girilendersler = dersprogramialici.nextLine();
           dersprogramikaydeder.append("Pazartesi: " + girilendersler);
           System.out.println("Sali gunku dersleri giriniz: ");
           girilendersler = dersprogramialici.nextLine();
           dersprogramikaydeder.append("\nSali: " + girilendersler);
           System.out.println("Carsamba gunku dersleri giriniz: ");
           girilendersler = dersprogramialici.nextLine();
           dersprogramikaydeder.append("\nCarsamba: " + girilendersler);
           System.out.println("Persembe gunku dersleri giriniz: ");
           girilendersler = dersprogramialici.nextLine();
           dersprogramikaydeder.append("\nPersembe: " + girilendersler);
           System.out.println("Cuma gunku dersleri giriniz: ");
           girilendersler = dersprogramialici.nextLine();
           dersprogramikaydeder.append("\nCuma: " + girilendersler);
           dersprogramikaydeder.close();
        }catch(Exception e){}      
}
    public abstract void notgir();
}

abstract class goruntulemeislemleri extends hesapla{
    private static File dosyadersler = new File("dersler.txt");
    private static File dosyadersprogrami = new File("dersprogrami.txt");    
    public static void derslerigoruntule(){
        System.out.println("Secilebilecek dersler:");
        try{
      Scanner okuyucu = new Scanner(dosyadersler); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
        }
    public static void dersprogramigoruntule(){
     System.out.println("Ders Programi:");
        try{
      Scanner okuyucu = new Scanner(dosyadersprogrami); 
        while (okuyucu.hasNextLine()) 
            System.out.println(okuyucu.nextLine());
        }catch(Exception e){System.out.println("Bir hata olustu");}
        }
    abstract void harfnotugoruntule();
    abstract void notgoruntule();
}

abstract class hesapla extends uyelik{
    File dosya = new File("notlar2.txt");
    File dosya3 = new File("harfnotlari.txt");
    File dosya2 = new File("yoklama.txt");
    String der,numder,nuu,viz,fin;
    int sayar2=0,say=0,sayar3=0,sayy=0,sayar4=0,sayyy=0;
    float ortfloat,tut;    
    void harfnotubelirlehesap(String nu,String de){
            nuu = nu;
        der=de;
    numder=nuu+" "+der;
    try {
    Scanner dosyaarar = new Scanner(dosya2);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayar2++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
    try{
    Scanner dosya1 = new Scanner(dosya2);
    while(dosya1.hasNextLine()){
    String line = dosya1.nextLine();
if(line.equals(numder)) {
            say++;
            if(say==sayar2){
line=dosya1.nextLine();
tut=Integer.parseInt(line);
if(tut<10){
    System.out.println("12 dersin 10 tanesinden aza geldigi icin kaldi");
            System.exit(0); 
}
}}    
    }
    }catch(Exception e){System.out.println("Bir hata olustu");}
    try {
    Scanner dosyaarar = new Scanner(dosya);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayar3++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
    try {
    Scanner dosyaarar = new Scanner(dosya);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(numder)) {
            sayy++;
            if(sayy==sayar3){
            line = dosyaarar.nextLine();
                viz=line;
                line = dosyaarar.nextLine();
                fin=line;
                ortfloat = (Float.parseFloat(viz) + Float.parseFloat(fin))/2;    
     break;
            }else if(!dosyaarar.hasNextLine()){
            System.out.println("Gecersiz islem dersi alınmamis veya not girilmemis");
        }
        }
    }
} catch(IOException e) {System.out.println("bir hata olustu");}
    String[] harfn = {"ff","dd","dc","cc","cb","bb","ba","aa"};
    int hafns=0;
        try {
    Scanner dosyaarar = new Scanner(dosya3);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
        if(line.equals(der)) {
            sayar4++;
    }
}} catch(IOException e) {System.out.println("bir hata olustu");}
    
    try {
    Scanner dosyaarar = new Scanner(dosya3);
    while (dosyaarar.hasNextLine()) {
        String line = dosyaarar.nextLine();
if(line.equals(der)) {
    sayyy++;
    if(sayyy==sayar4){
     while(hafns<8){
         line = dosyaarar.nextLine();
            if(ortfloat<=Float.parseFloat(line)){
                System.out.println(harfn[hafns]);
                break;
            }
            hafns++;
        }
     break;
        }
}
    }
} catch(IOException e) {System.out.println("bir hata olustu");}
    }
}

abstract class uyelik{                                                          
    Scanner x= new Scanner(System.in);
    protected String isim;
    protected String soyisim;
        public void uyeol(){
            System.out.println("isminizi giriniz");
            isim = x.nextLine();
            System.out.println("soyadinizi giriniz");
            soyisim = x.nextLine();
        }
        abstract void kaydet() throws Exception;
}

interface bilgilerigoruntule{                                                   
    void kisiselbilgiler();
    void goruntulemedigerleri();
}

interface giriscikis{
    int girisyap();
    void cikisyap();
}

interface yoklama{
    void yoklamagoruntule();
    void yoklamaal();
}