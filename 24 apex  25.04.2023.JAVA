//OOP (Object Oriented Programming - Nesne Tabanli Programlama)
//Gercek hayatta gordugumuz bircok Object in bilgisayar ortamina aktarilma seklidir.
//Yani bir objectin rengi, durumu, ismi, uretim yili gibi bircok ozelliklerinin bilgisayar
//ortaminda gosterilmesi buna ornek verilebilir

//Object Yonelimli Programlamanin Faydalari
/*
	1-Object olusturma bir class icerisinde toplanir ve tum projelerde kullanilabilirlige olanak saglar
	2-Class larin 1 kez olusturulmasi sayesinde uzun kodlar tekrardan yazmak yerine kisa kodlamalar ile calistirilabilir
	3-Uzun kodlarin tekrar yazilmasinin engellenmesi sayesinde gelistirme sureci kisalir.
	4-Objectler birbirinden bagimsiz oldugundan bilgi gizliligi konusunda avantaj saglar
	5-Class lar sayesinde tum projelerde degisiklik yapmak yerine tek bir classta degisiklik yapilip tum projelerde calismasi saglanir.
 	Bu zaman kaybini buyuk olcude azaltir.
*/

//Class nedir?
//Variable ve methodlari bir arada saklayan sisteme Class denir.
//Variable lar kullanacagimiz verileri saklar.
//Methodlar bu veriler ile ilgili bazi islemleri yapmayi saglayan bir sistemdir

/*OOP concept 4 temel prensipten olusur
	1-Encapsulation - Kapsulleme
	2-Inheritance   - Miras alma
	3-Polymorphism  - Cok bicimlilik
	4-Abstraction 	- Soyutlama */
//--------------------------------------------------------------------------------------
//1.Encapsulation - Kapsulleme  : Data Hiding (Veri saklama)

//Access Modifiers
//OOP mantiginda class uyelerine erisimi sinirlandirabilirsiniz. Bunu Access Modifier larla yapabilirisiniz

//1-Private: Sadece icinde bulundugu class taki methodlardan o private class uyesine erisilebilir.
//Private Access modifier varsayilandir. Ehliyetim bana private'dir.

//2-Public : Icinde bulundugu proje dahilindeki her yerden o classa ulasilabilir. 

//Ama classa ulasim disinda Access Modifierlar la yapamadigimiz bazi seyleri encapsulation ile yapabiliriz
//1-encapsulation kullanarak read ve write (okuma ve yazma) ozelliklerini birbirinden ayri olarak tanimlayabiliriz
//2-Istedigimize okuma, istedigimize yazma, istedigimize her iki yetkiyi verebiliriz

//----------------------------------------------------------
//Encapsulation nedir? Datayi saklamaktir
//Data nasil saklanir?
//Access modifier larini  private yaparak datayi diger classlardan gorunmez hale getiririm.
//Bu sayede datayi saklarim
//----------------------------------------------------------
//Data'yi sakladin ama okuman gerekirse ne yapacaksin?
//get() methodlar olusturarak saklanmis olan datalari diger classlardan okuyabilirim
//----------------------------------------------------------
//Data'yi sakladin ama datayi degistirmen gerekirse ne yapacaksin?
//set() methodlar olusturarak saklanmis olan datalari diger classlardan degistirebilirim
//-----------------------------------------------------------
//Hem okunabilir hemde yazilabilir olsun diyorsaniz, hem getter hem de setter methodlari ayni anda olusturmaliyiz

//Getter methodu okuma yaptigi icin parametre almaz. Setter methodlar ise private elemanlara deger atamasi yaptigi icin parametre alirlar

//Ornek : Students isminde bir class olusturunuz. Data girislerini yaptiktan sonra getter ve setter methodlarini uygulayiniz

//Students classtan bir object olusturalim
Students std1 = new Students();
//System.debug(std1.name);//Variable is not visible: Students.name
System.debug(std1.getName());//Ali Can
System.debug(std1.getAge());//13
System.debug(std1.isSuccesful());//true

//------------------------------------------
std1.setName('Veli Han');
System.debug(std1.getName());//Veli Han
std1.setAge(25);
System.debug(std1.getAge());//25
std1.setSuccesful(false);
System.debug(std1.isSuccesful());//false

//Ali Can class ta degismedi. cunku kaliptan olusan obje uzerinde set yaptik
//------------------------------------------

std1.setName('Brad Pit');
System.debug(std1.getName());//
std1.setAge(44);
System.debug(std1.getAge());//
std1.setSuccesful(true);
System.debug(std1.isSuccesful());//

//Encapsulation da bir tane object olusturup, set method kullanarak varolan object uzerinden degisiklikler yaparak 
//o object i sanki yeni bir object MIS GIBI kullanabiliriz
//Kaliptan istedigimiz kadar boyle olusturabiliriz. Encapsualtionun guzelligidir
//Memory problemini onler. Bircok object memory doldururdu.
/*
Students aliCan = new Students();
Students veliHan = new Students();
Students bradPitt = new Students();
.......
YUZLERCE OGRENCİ OLABİLİRDİ BUNU YAPMAKTAN KURTULDUK 
*/

//---------------------Class ici kodlar--------

public class Students {//class isimleri buyuk harf ile baslar

    //Eger access modifier koymazsaniz Apex onu varsayilan olarak private kabul eder
    String name = 'Ali Can';
    private Integer age = 13;
    private Boolean succesful = true;
    //boylece access modifier lari private yaparak datalari encapsule etmis olduk
    //Students class disindan bu datalari kimse okuyamaz ve degistiremez
    //----------------------------------------------------------------------
    
    //name, age ve successful datalarini okunabilir yapin
    //method nasil olusturulur hatirlayalim
    //syntax
    //Access modifier + Return Type + Method ismi + () + {}
    public String getName (){
        return this.name;
    }
    //get methodlar public olur
    //get methodun return type i okudugu variable in data tipi ile ayni olur.
    //return typi farkli yaparsaniz Illegal conversion from String to Integer hatasi alirsiniz
	//this keywordu bu classtaki demek
	//get method bir boolean variable icin olusturulduysa eger ismi "is" ile baslar
    public Integer getAge(){
        return this.age;
    }
    public Boolean isSuccesful(){//is soru anlami katiyor. Basarili mi? True yada false 
        return this.succesful;
    }
    //------------------------------------------------------
    //Encapsulation yaptigimiz datayi istersek diger classlardan degistirebilir
    //Nasil degistirebiliriz?
    //"set method" olusturarak Encapsulate ettigimiz datanin degerin degistirebiliriz
    //set methodlar her zaman public olur
    //set methodlar yeni data uretmez, var olan data yi degistirir. Bu yuzden return typelari void olmalidir.
    // get methodlarin diger adi "getter", set methodlarin diger adi "setter" dir
    public void setName (String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setSuccesful(Boolean succesful){
        this.succesful = succesful;
    }
    
    
}
//---------------------------------------------------------------------
