//Ornek 1 : Verilen iki String List ten birini digerinin icerisine koyunuz.

List<String> altiA = new List <String>{'Ali','Veli','Can'};  
System.debug(altiA);//(Ali, Veli, Can)
List<String> altiB = new List <String>{'Hatice','Mary','Angie','Fatma'};  
    
 altiA.addAll(altiB); 
System.debug(altiA);//(Ali, Veli, Can, Hatice, Mary, Angie, Fatma)
//Burada altiA degisir altiB degismez. Parantez icine yazilan list digerine eklenir.
System.debug(altiB);//(Hatice, Mary, Angie, Fatma)

//Ornek 2 : Asagida verilen string listi kopyalayiniz sonrada tum elemanlarini siliniz

//kopyalama:
List<String> renkler = new List<String>{'Yesil','Mavi','Kirmizi'};
    System.debug(renkler);

List<String> kopya = new List<String>(renkler);
    System.debug('kopya list '+kopya);//kopya list (Yesil, Mavi, Kirmizi)

//Silme;
List<String> renkler = new List<String>{'Yesil','Mavi','Kirmizi'};
    System.debug(renkler);
	renkler.clear();
    System.debug(renkler);
    
//Ornek 3: Verilen bir string list uzerinde asagidaki islemleri yapiniz
/*		a)Elemanlari arasinda 'Yesil' in olup olmadigini kontrol ediniz
		b)Kirmizi nin index ini bulunuz
		c) Index no girerek mavi yi console a yazdiriniz
		d) 1 numarali index e sahip elemani siliniz	
*/

//a)Elemanlari arasinda 'Yesil' in olup olmadigini kontrol ediniz
List<String> renkler = new List<String>{'Yesil','Mavi','Kirmizi'};
System.debug(renkler.contains('Yesil'));//true

//b)Kirmizi nin index ini bulunuz		  0       1       2  	
List<String> renkler = new List<String>{'Yesil','Mavi','Kirmizi'};
System.debug(renkler.indexOf('Kirmizi'));//2

//c) Index no girerek mavi yi console a yazdiriniz
//get() methodu listin icinden index no kullanilarak istenen elemani almak icin kullanilir
List<String> renkler = new List<String>{'Yesil','Mavi','Kirmizi'};
System.debug(renkler.get(1));

//d) 1 numarali index e sahip elemani siliniz	
//remove() methodu index kullanilarak istenilen bir elemani silmek icin kullanilir
List<String> renkler = new List<String>{'Yesil','Mavi','Kirmizi'};
    System.debug(renkler);//Yesil,Mavi,Kirmizi
    System.debug(renkler.remove(1));//Mavi
    System.debug(renkler);//Yesil, Kirmizi

//Ornek 4: Verilen Integer list elemanlarini natural order (Sayilarda kucukten buyuge
// kelimelerde alfabetik siralama) olacak sekilde siralayiniz

List <Integer> myList = new List <Integer>{19,7,1,313,4};
    System.debug(myList);//(19, 7, 1, 313, 4)
    myList.sort();
    System.debug(myList);//(1, 4, 7, 19, 313)

//Ornek 5: Bir integer Listteki en buyuk ve en kucuk elemanlarin farkini bulunuz.
//once sort() methodu ile kucukten buyuge siralariz
//sonra son ve ilk elemani get() methodu ile alarak cikarma islemi yapariz. 

List <Integer> myList = new List <Integer>{19,7,1,313,4};
    myList.sort();
    System.debug(myList);//(1, 4, 7, 19, 313)
	Integer max =myList.get(myList.size()-1);//313
    System.debug(max);

	Integer min = myList.get(0);//1
    System.debug(min);
    System.debug(max-min);//312

// Ornek 6: Bir string list teki uzunlugu 5 den fazla olan elemanlari siliniz.
//for each loop kullandiginizda listlerde eleman sayisini azaltamazsiniz

List <String> myList = new List <String>();
myList.add('Alican');
myList.add('Anjelina');
myList.add('Mary');
myList.add('Kerem');


for(Integer i =0; i<myList.size();	i++){
  
    if(myList.get(i).length()>5){
        myList.remove(i);
        i--; //silme islemi oldugunda indexler azalacagi icin i degerini de azaltmaliyiz
    }
    
}
System.debug(myList);//(Mary, Kerem)
