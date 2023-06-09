//2-Inheritance  (Miras alma)
//OOP nin dort temel ozelliginin ikincisidir.
//Ozellikleri bir class tan diger classlara alan bir kavramdir.

//Mesela siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bircogunu 
//kapsiyor. O zaman yeni olusturacaginiz class'i ozelliklerini kullanmak istediginiz class'a child yapariz

//Bunu child class'ta extends (uzanir) keywordunu kullanarak yapariz. Parent larda da sen parent'sin anlaminda virtual(asıl)
//keywordunu kullaniriz.

//a) Apex Multiple Inheritance i desteklemez. Single inheritance i destekler
//iki parent ta ayni method var. Apex child classtan hangi methodu kullanacagina karar veremez, dolayisiyla desteklemez
//bir cocugun bir ailesi olur

//b)Parent ve birden fazla child ile olusturulan Inheritance yapilanmasina Hierarchical Inheritance denir
//Apex bunu kabul eder. secici olan child dir.

//c) Ama coklu parent lardan yararlanmamak iyi olmadi, Ozelliklerini inherit etmek istedigimiz classlar birden fazla ise
// o durumda Apex bize, apartman tarzi yapilandirmaya izin verir.
//Bu yapi 'Multi Level Inheritance' olarak adlandirilir. Apex bunu kabul eder.

//Not : Child parent in butun ozelliklerini kullanabilir mi?
// Hayir. Access modifier i private olan class uyeliri inherit edilemez.

//Inheritance'in faydalari
//1) Kodun yeniden kullanilmasina yardimci olur. Child class, Parent classta bulunan methodu 
//tekrar yazmaya ihtiyac duymadan kullanabilir
//2) Ana kodun tekrar yazilmasina gerek kalmadigi icin daha az kod yazarak zamandan ve emekten tassarruf saglanir
//3) Kolayca update yapabiliriz
//4) Class lari kuculturuz
//5) Daha az gelistirme ve bakim maliyetlerini saglar

//Dog class tan d objecti olusturduk.
Dog d = new Dog();
d.bark();//Dogs Bark
d.feedWithMilk();//Mammals feed their babies with milk
d.eat();//Animals eat
d.drink();//Animals drink

Bird b = new Bird();
b.eat();//Animals eat
b.feedWithMilk();//Method does not exist or incorrect signature: void feedWithMilk() from the type Bird

//----------------------------------------------------------------------
//3- Polymorphism
//OOP prensiplerinin ucuncusudur. Polymorphism cok bicimlilik demektir
//iki turlu karsimiza cikar. Polymorphism = Method Overloading + Method Overriding
//Bir methodu istedigimiz sonuclari alacak sekilde farkli farkli sekillerde calistirabilmek icin kullanilir

//1-Method Overloading
//Ayni class icinde yapilir
//Method signature  = Method name + parameter
//String.substring(start) ==> tek parametre aliyor 
//String.substring(start, end) ==> ==> iki parametre aliyor

/*
	Method overloading te sadece parametreler degistirilir. Boylelikle method signature degismis olur ve Apex
	bu methodu yeni bir method gibi kabul eder
	Method overloading icin
	a)Parametre sayisini degistirebiliriz
	b)Parametre data tiplerini degistirebilirsiniz
	c)Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz
*/
Mo m = new Mo();
Integer toplam =m.add(2,3);
System.debug(toplam);

Decimal toplam1 =m.add(2.3,5);
System.debug(toplam1);//7.3

//2- Method Overriding (gecersiz kilmak)
//Child classin Parent classtaki methodu degistirerek kullanmasidir.

Dog d = new Dog();
d.eat();//Animals eat
//Dogs eat olsa daha iyi olurdu
//Animal daki eat methodunu kopyalayarak dog classa yapistirdik.
//Animals eat yazisini istegimize gore guncelledik
//Method overriding icin methodun ustune override keywordunu yazdik
//Sonra hata aldik duzeltmek icin Override ettigimiz Animal classtaki eat methodunda public ile void arasina
// override a izin ver diye virtual keywordunu yazdik

Cat c = new Cat();
c.feedWithMilk();//Cats feed their babies with milk

//---------------------------------------
//1.Once Animal class'i olusturalim.

//Yeni data uretmeyen method'larin return type'lari 'void' (bos, gecersiz, hukumsuz)olur.
//Bu methodlar sadece ekrana yazi yazdiracaklar.Yeni data uretmeyecekler.
//public yapiyoruz ki, getter, setter kullanmadan kolaylikla ulasalim.


public virtual class Animal { 
    
    public void eat(){
        System.debug('Animals eat');
    }
    public void drink(){
        System.debug('Animals drink');
    }
      
}
//---------------------------------------
//2.Sonra Mammal class'i olusturalim.
public virtual class Mammal extends Animal {
    
    public void feedWithMilk(){
        System.debug('Mammals feed their babies with milk');
    }

}
//---------------------------------------
//3.Sonra Dog class'i olusturalim.
public class Dog extends Mammal {
    
    public void bark(){
        System.debug('Dogs bark...');
    }

}
//---------------------------------------
//4.Sonra Cat class'i olusturalim.

public class Cat extends Mammal {
    
    public void meow(){
        System.debug('Cats meow...');
    }
    
}

//---------------------------------------
//5.Sonra Bird class'i olusturalim.

public class Bird extends Animal {
    public void tweet(){
        System.debug('Birds tweet...');
        
    }

}
//---------------------------------------


//Resimdeki yapi tamamlanmadi cunku Apex'e kim parent, kim child soylemedik.Simdi bunu yapalim.
//Extends keyword’unu kullanacagiz

//1) Bird Class’a gidelim.Bird’den sonra extends Animal yazalim. Bird’un parent'i Animal yaptik.
//ilk class child, ikinci class parent olur.
//Sonra parent’a gidip, sen parent'sin denmelidir.
// Animal class'a gidip public ile class arasina “virtual" yazilmalidir.

//2. Cat'in parent'i Mammal yapalim. Cat class’a gidelim
//Cat’ten sonra extends Mammals ekleriz
//ONEMLI: Hatanin duzelmesi icin Mammal'i parent (virtual ile) yapmaliyiz.
//public ile class arasina virtual yazmaliyiz 

//3. Mammal'in parent'i Animal yapalim.
//Mammal’dan sonra extends Animal’i ekleriz
//Animal’a tekrar sen parent’sin demeye gerek yoktur 

//4. Dog'un parent'i Mammal yapalim. 
//Dog’dan sonra extends Mammal yazalim
//Mammal’a tekrar virtual ile sen parent’sin demeye gerek yoktur

//-------------------------------------------
//Mo class'ini olusturalim
    
    public class Mo {
    
    public Integer add(Integer a, Integer b){
        return a+b;
        
    }
    public Integer add(Integer a, Integer b, Integer c){ //a) Parametre sayisini degistirebilirsiniz
        return a+b+c;
        
    }
    public Decimal add(Decimal a, Integer b){  //b) Parametre data tiplerini degistirebilirsiniz.
        return a+b;
        
    }
    public Decimal add(Integer a, Decimal b){ //c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
        return a+b;
    }
    //method overloading ayni class icinde yapilir.
}
   
//---------------overriding----------------------------    
public class Dog extends Mammal{
    public void bark(){
        System.debug('Dogs Bark');
    }
    
    Override
    public void eat(){
        System.debug('Dogs eat');   
    }

}
//---------------overriding----------------------------     
public class Cat extends Mammal {
    public void meow(){
        System.debug('Cats meow');
    }
    
    Override
    public void feedWithMilk(){
        System.debug('Cats feed their babies with milk');
    }

}

//---------------overriding----------------------------     

public virtual class  Animal {
    
    public virtual void eat(){
        System.debug('Animals eat');   
    }
    
    public void drink(){
        System.debug('Animals drink');   
    }

}
