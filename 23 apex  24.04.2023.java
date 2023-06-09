//Ornek: String bir Set ten string bir list ile ortak elemanlari siliniz(Yani farklilari ver)
//removeAll() method u ortak elemanlari siler, farkliliklari verir

Set<String> mySet = new Set<String>{'Ayhan','Beyhan','Ceyhan','Ali','Ramazan'};
List<String> myList = new List<String>{'Ayhan','Beyhan','Kemal'};  
    mySet.removeAll(myList);
System.debug(mySet);//Ali, Ceyhan, Ramazan

//Ornek: Integer bir Setten Integer bir list ile ortak elemanlari siliniz.  

Set<Integer> mySet = new Set<Integer>{11,12,35};
List<Integer> myList = new List<Integer>{24,35,12,24,35};
    mySet.removeAll(myList);
System.debug(mySet);//11

//-----------------------------------------------------------------------------
//Map  
//Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir=>ornegin Ali =13
//key kismi tekrarsiz, value kismi tekrarli olabilir
//Maplerde elemanlara entry denir.
//Elemanlarin tamamina entrySet denilir
//Key ve value lar ayri ayri data tiplerinde olabilirler
//Key tarafi icin Set value tarafi icinde list kullanilir

//Map nasil olusturulur?
Map<String,Integer> myMap = new Map<String,Integer>();

//Maplere eleman nasil eklenir?
//Maplere eleman eklemek icin put() methodu kullanilir
myMap.put('Ali Can',13);
myMap.put('Veli Han',13);
myMap.put('Ali Can',313);//key tekrarli kullanilirsa son value aktif olur (override) ustune yazar
System.debug(myMap);//{Ali Can=313, Veli Han=13}

//--------------------------------------
//Sadece key degerleri nasil alinir?
//Bunun icin keySet() methodu kullanilir.
Set<String> keyTarafi = myMap.keySet();
System.debug(keyTarafi);//{Ali Can, Veli Han}

//Sadece value degerleri nasil alinir?
//Bunun icin values() methodu kullanilir.

List<Integer> valueTarafi =   myMap.values();
System.debug(valueTarafi);//313,13

//Bir map olusturunuz ve icine 1=Ali Can,  2=Veli Han koyunuz.
Map<Integer, String> myMap = new Map <Integer, String>();
myMap.put(1,'Ali Can');
myMap.put(2,'Veli Han');
System.debug(myMap);//{1=Ali Can, 2=Veli Han}
//------------------------------------------------
//Map kopyalama
Map<Integer, String> myMap = new Map <Integer, String>();
myMap.put(1,'Ali Can');
myMap.put(2,'Veli Han');
System.debug(myMap);//{1=Ali Can, 2=Veli Han}

Map<Integer, String> copyMap = new Map <Integer, String>(myMap);
System.debug(copyMap);//{1=Ali Can, 2=Veli Han}

//Ornek : Verilen Mapte keylerin toplam karakter sayisini bulunuz.

Map<String,Integer> myMap = new Map<String,Integer>();
myMap.put('Ali Can',13);
myMap.put('Veli Han',13);
myMap.put('Mary Star',313);
System.debug(myMap);//{Ali Can=13, Mary Star=313, Veli Han=13}

Set<String> myKeys = myMap.keySet();
System.debug(myKeys);//{Ali Can, Mary Star, Veli Han}

Integer sum = 0;
for(String each : myKeys ){
  sum = sum + each.deleteWhitespace().length();
}
System.debug(sum);//21

//Ornek : Verilen Map te value bolumunde tekrarli data olup olmadigini kontrol eden kodu yaziniz

Map<String,Integer> myMap = new Map<String,Integer>();
myMap.put('Ali Can',13);
myMap.put('Veli Han',13);
myMap.put('Mary Star',313);
System.debug(myMap);

List<Integer> myList = myMap.values();
System.debug(myList);
//List i Set e gonderirsek tekrarlilari yok eder, sonrada size()lara bakariz
Set<Integer> mySet = new Set<Integer>(myList);
System.debug(mySet);

if(mySet.size()  <  myList.size()){
    System.debug('Tekrali value var');
}else{
    System.debug('Tekrali value yok');
}

//Ornek: Kisileri ve yasadigi ulkeleri gosteren bir map olusturunuz,
//isim ve soyisimlerin ilk harflerini console a yazdiriniz
//Ali Can = Fransa ==> AC

Map<String, String> myMap = new Map<String, String>();
//         0123456
myMap.put('Ali Can', 'Fransa');
myMap.put('Veli Han', 'Almanya');
myMap.put('Mary Star', 'Kanada');
myMap.put('Brad Pitt', 'Ingiltere');
System.debug(myMap);

Set<String> keys = myMap.keySet();
System.debug(keys);
					//{Ali Can, Brad Pitt, Mary Star, Veli Han}
for( String w : keys){
     String isminIlkHarfi    = w.substring(0,1);    
    String soyisminIlkHarfi = w.split(' ')[1].substring(0,1);
     System.debug(isminIlkHarfi+soyisminIlkHarfi);
}
//-----------------------------------------
//maplerde get() methodu kullanimi

Map<String, String> myMap = new Map<String, String>();

myMap.put('Ali Can', 'Fransa');
myMap.put('Veli Han', 'Almanya');

System.debug(myMap.get('Ali Can'));//Fransa
System.debug(myMap.get('Veli Han'));//Almanya
System.debug(myMap.get('mehmet'));//null

//Maplerde get() methoduna parantez icine key yazilarak value elde edilir.
//eger istenen key Map icinde yok ise get() methodu null return eder.
//-------------------------------------------------

//Ornek Size verilen bir String deki her kelimenin, kac defa kullanildigini gosteren kodu yaziniz
//(case insensitive - buyuk/kucuk harfe duyarsiz)

//Ali nasilsin Ali. ===> ali=2, nasilsin=1
//Regex yontemiyle \\p{Punct} tum noktalama isaretlerini ifade eder 

String s = 'Ali nasilsin Ali.';
s = s.replaceAll('\\p{Punct}','').toLowerCase();
System.debug(s);//ali nasilsin ali
String[] kelimeler =  s.split(' ');
System.debug(kelimeler);//(ali, nasilsin, ali)

Map<String, Integer> myMap = new Map <String, Integer>();

						//(ali, nasilsin, ali)
for(String w : kelimeler){
   
   Integer gorunum = myMap.get(w);    
    if(gorunum==null){      
        myMap.put(w,1);//mep te yoksa w den yani ali den 1 tane koy
    }else{        
        myMap.put(w,gorunum+1);
    }   
}
System.debug(myMap);//{ali=2, nasilsin=1}

//homework
// Size verilen bir string deki her harfin o string de kac defa kullanildigini gosteren kodu yaziniz
// Hello ===> H=1, e=1, l=2, o=1
