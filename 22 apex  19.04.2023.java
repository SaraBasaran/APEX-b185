//Ornek 7: Bir Integer Listteki tum elemanlari tekrarsiz (unique) olup olmadigini kontrol edinizz

List<Integer> myList = new List <Integer>{12, 84,    12,    132};
Integer counter =0;

for(Integer w : myList ){
    
    for(Integer k : myList){       
        if(w==k){
            counter++;
        }       
    }   
}
if(counter==myList.size()){
    System.debug('Tum elemanlar tekrarsiz');
}else{
    System.debug('En az bir eleman tekrarli');
}
//--------------------------------------------------------------------
//Set
//Setler tekrarsiz (unique) datalari depolamak icin kullanilir
//Id, email, telefon no, Tc No, SSN, plaka

//Set nasil olusturulur?
Set<Integer> mySet = new Set <Integer>();

//Set e eleman nasil eklenir?

mySet.add(11);
mySet.add(13);
mySet.add(19);
mySet.add(11);//tekrarli eleman hata vermez, tekarli eleman ustune yazar, dolayisiyla 1 kez gorulur
System.debug(mySet);//{11, 13, 19}
//-----------------------------

//Setin eleman sayisi nasil alinir?
//size() method kac farkli eleman oldugunu verir. Tekrarlilari saymaz.

Integer elemanSayisi =mySet.size();
System.debug(elemanSayisi);//3
//-----------------------------

//String bir set olusturalim
Set<String> s1 = new Set <String>();
s1.add('Ali Can');
s1.add('Veli Han');
s1.add('Ali Can');
s1.add('ali Can');

System.debug(s1);//{Ali Can, Veli Han, ali Can}

// Seti kopyalamak
Set<String> s2 = new Set <String>(s1);
System.debug(s2);//{Ali Can, Veli Han, ali Can}
//-----------------------------------------------
//List ten Set nasil olusturulur?

List<Integer> myList = new List <Integer>{24,35,12,24,35};
System.debug(myList);//(24, 35, 12, 24, 35)

Set<Integer> mySet = new Set <Integer>(myList);
System.debug(mySet);//{12, 24, 35}
//Tekrarli elemanlarin ustune yazdi, kolaylikla tekrarlilari silmis olduk

//Ornek 1: Size verilen bir listin tekrarli eleman icerip icermedigini kontrol eden kodu yaziniz

List<Integer> myList = new List <Integer>{12,24,35};
Set<Integer> mySet = new Set <Integer>(myList);
System.debug(mySet);//{12, 24, 35}

if(myList.size()>mySet.size()){
    System.debug('Listte tekrarli eleman var');
}else{
    System.debug('Listte tekrarli eleman yok');
}


//Ornek 2 Bir Set in bir list ile ortak elemanlarini listeleyiniz?
//retainAll() methodu Set-List arasinda veya Set-Set arasinda ortak elemanlari verir.
//retainAll() methodu boolean return eder, Listlerde yoktur. Setlerde kullanilir


Set<Integer> mySet = new Set <Integer>{11,12,35};
List<Integer> myList = new List <Integer>{24,35,12,24,35}; 
mySet.retainAll(myList);
System.debug(mySet);//12,35
//ortaklari verdi, mylist ile mySet yer degistiremez cunku retainAll() methodu setlerde kullanilir

//Ornek 3: Iki set te ortak eleman olup olmadigini kontrol eden kodu yaziniz.
Set<Integer> mySet = new Set <Integer>{11,8,23};
Set<Integer> yourSet = new Set <Integer>{12,8,23,35}; 
   mySet.retainAll(yourSet); 
 System.debug(mySet); 

if(mySet.size()==0){
    System.debug('Ortak eleman yok');
}else{
   System.debug('Ortak eleman var');
}

//Ornek 4: Bir String setten uzunluklari 5 den buyuk olan elemanlari siliniz.


Set<String> mySet = new Set <String>{'Ayhan','Beyhan','Ceyhan','Ramazan'};
    
                for(String w : mySet){
                     if(w.length()>5){
                        mySet.remove(w);
                    }
                }

System.debug(mySet);


