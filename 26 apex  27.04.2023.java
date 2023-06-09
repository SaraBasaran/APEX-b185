//Soru 1: Private method'lar override edilebilir mi?
//cavap 1: Private methodlar override edilemezler cunku; override edebilmek icin o methoda baska bir classtan ulasabilmek gerekir
//Ama private methodlara baska classlardan ulasilamaz.

//Soru 2: Private methodlar overload edilebilir mi?
//cevap 2: Private methodlar overload edilebilirler. Cunku overload islemi tek class icinde yapilir, private methodlar ayni classin icinden
//ulasilabilir oldugundan overloada engel degildir.

//Soru 3: Static methodlar override edilebilir mi?
//Cevap 3:Static methodlarin override edilemezler cunku static variable veya methodlar tum objeler icin ortaktir. Apex static methodlarin
//override edilmesine musade etmez

//Soru 4 :Static methodlar overload edilebilir mi?
//cevap 4:static methodlar overload edilebilir cunku esasinda overloading te biz yeni methodlar olustururuz.

//---------------------------------------------------------------------
//Abstraction
//iki bolumden olusur
//1) Abstract Class:
//Kendisinden object olusturulamaz. Bazi class'lari object olusturmak amaciyla degil, objectleri gruplara ayirmak ve genel ozelliklerini 
//belirlemek icin kullaniriz, Baslangic degil, sonuctur.

/*
1)Abstract methodlarin body si olmaz {suslu parantez kismi}. Size ne yaptigini soyler, nasil yapilacagini soylemez
2)Body si olan methodlara non-abstract yada concrete (somut) method denir
3)Abstract methodlar tum child classlar tarafindan override edilmelidir yani kullanilmalidir.
4)Abstract methodlar ancak abstract classlar icinde olusturulabilirler.
5)Abstract classlar hem abstract method hem de concrete method icerebilirler
6)Concrete methodlar child classlar tarafindan ISTENIRSE override edilebilirler
*/
//-------------honda class ici--------
public abstract class Honda {
    //Abstract methodlar ancak abstract classlar icinde olusturulabilirler.
	//O yuzden hatayi giderebilmek icin classi abstract yapmaliyiz
    public void music(){
        System.debug('Pro');
    }
    
    public abstract void engine();
    //hatayi gidermek icin methodun abstract oldugunu belirtmemiz lazim

}

//------------Civic class ici---------------------------------------
public class Civic extends Honda {
//3)Abstract methodlar tum child classlar tarafindan override edilmelidir yani kullanilmalidir.

    Override
    public void engine(){
        System.debug('Gas 1.6 Eco');
    }
    //override edilen method artik concrete methoda dondugu icin body ekledik
}

//--------------Accord class ici-----------------------------
public class Accord extends Honda{
    
    //1.Hondanin childi yapildi (extends)
    //2.Override edilecek method alinir.
    //3.Abstract kelimesi silinir,
    //4.body eklenerek istenen kodlar yazilir
    //5.override keywordu method ustune yazilir

    override
    public  void engine(){
        System.debug('Gas 2.0 Turbo');
    }
}
// calistirmasi 

Honda h = new Honda();
System.debug(h);
//Abstract classes cannot be constructed: Honda
//Abstract classlardan object olusturulamaz
//Sadece siniflandirma icin olusturuldu.

Civic c = new Civic();
c.engine();//Gas 1.6 Eco

Accord a = new Accord();
a.engine();//Gas 2.0 Turbo

//Virtual classlardan object olusturulabilir ama abstract classlardan object olusturulamaz
//Abstract classlardaki tum abstract methodlar abstract olmayan child classlar tarafindan override edilmelidir
//Dolayisiyla child classlar icin bir methodu zorunlu yapmak istiyorsak parent classi abstract yapariz
//----------------------------------------------------------------------------

//2 Interface 
/*Apex multiple inheritance i desteklemediginden ikinci yapi classlar arasinda olusturulamaz
Ama bizim bu yapilanmaya ihtiyacimiz var. Bu yuzden Apex "Interface" adli yeni bir yapi olusturdu
ve bu yapiyi multiple inheritance acik hale getirdi
Yani bir child birden fazla parenti bu sayede kullanabilir*/

//Interface icinde sadece abstract method olabilir
//Abstract classlar icinde hem abstract hemde concrete methodlar olabilir
//Bu yuzden abstract classlara yari abstract anlaminda semi-abstract denir
//interface lere ise tam abstract anlaminda fully-abstract denir

//---------- motor interface ici-----------------
public interface Motor {
    //interface icindeki methodlar otomatik olarak public dir. bu yuzden 
    //interfacelerde method olustururken access modifier yazilmaz.
    //interface icindeki methodlar otomatik olarak abstractdir. bu yuzden 
    //abstract keywordunu ve method body yazmayiz
    
    void eco();
    void turbo();
    void gas();

}
//----------klima interface ici---------

public interface Klima {
    
    void analog();
	void digital();    

}
//----------Fren interface ici---------

public interface Fren {
    
    void abs();
    void esp();

}

// calistirmasi

A4 a = new A4();
a.eco();//A4 ekonomik motor kullanir
a.turbo();//A4 turbo motor kullanir
a.gas();//A4 benzinli motor kullanir
a.analog();//A4 analog klima kullanir
a.digital();//A4 digital klima kullanir
a.abs();//A4 abs fren sistemi kullanir
a.esp();//A4 esp fren sistemi kullanir

S5 b= new S5();
b.eco();
b.turbo();
b.gas();
b.analog();
b.digital();
b.abs();
b.esp();

Klima k = new Klima();
//Interfacelerden object olusturamazsiniz
//Interfaceler yapilmasi sart olan seyleri depolamak icin olusturulur.
