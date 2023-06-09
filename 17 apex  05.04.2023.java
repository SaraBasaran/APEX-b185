//Ornek 5: Bir stringdeki tekrarsiz karakterleri console'a yazidiriniz
  012345678910	
//kertenkelle ==> rtn

//indexOf('r')		==> 2   ayni, tekrarsiz
//lastindexOf('r')	==> 2 
      
//indexOf('k')		==> 0   farkli, tekrarli
//lastindexOf('k')	==> 6      
      
//1 yol:
String s =  'kertenkelle';
String sonuc= '';
Integer i = 0;

while(i<s.length()){
   
    String harf = s.substring(i,i+1); 
    if(s.indexOf(harf)==s.lastindexof(harf)){       
        sonuc=sonuc+ harf;                               
    }
    i++;     
}
System.debug(sonuc);

//2. yol : countMatches() method'u bir karakterin bir String de kac kere kullanildigini verir
//tekrarsiz karakterler 1 kere kullanilmis olur
			 012345678910	
String s =  'kertenkelle';

Integer i=0;

while(i<s.length()){
     String harf = s.substring(i,i+1); 
    if(s.countMatches(harf)==1){
        System.debug(harf);
    }
    i++;
}
//----------------------------------------------------------
//3. do-while loop
//----------------------------------------------------------

//while 
 
Baslangic degeri   
    while(Loop Calisma Kurali){
        calismasini istedigimiz kodlar
            artirma / azaltma
    }
//----------------------------------------------------------
// do-while

Baslangic degeri
    do{
       calismasini istedigimiz kodlar
       artirma / azaltma 
    }while();
//----------------------------------------------------------

//Ornek 1: Console'a 5 kere 'Hi!' yazdiriniz
Integer i =1;
do{
    System.debug('Hi!');   
    i++;
}while(i<6);

//Ornek 2: 5 (dahil) den 3(dahil) e kadar integer lari console a yazdiriniz.

Integer i =5;
do{
    System.debug(i);  
    i--;                  
}while(i>2);

//while loop ile do while loop arasindaki fark nedir?
//while loop da loopun basta kirilmasi mumkundur. cunku once kural kontrol edilir.
Integer i=1;
while(i<1){
    System.debug('Ben while loop um');
    i++;
}


//do while loop da loop'un basta kirilmasi mumkun degildir. loop en az 1 kere calisir.
Integer k =1;

do{  
    System.debug('Ben do while loop um'); //Ben do while loop um  
    k++;   
}while(k<1);
//----------------------------------------------------------------------------------
//Array (dizi, sira)
/*
1) Coklu data saklamaya izin veren yapilardir. ornegin==> siniftaki ogrenci isimleri
2) Array'ler tek data tipi depolayabilirler.
3) Array olusturmak icin a)Data Tipi  b) Data sayisi soylenmelidir
4) Array'ler diger collectionlardan hizlidir(List, Set, Map)
5) Array'ler diger collectionlardan daha az memory kullanirlar
6) Arrayler degisme ihtimali olmayan datalarda kullanilir.
7) Arrayler icine primitive data tipleri(Integer, String...), sObjectler(Account, Contact) konabilir
*/
//Array  olusturalim

DataType[] variable = new DataType[DataSayis]; 
Integer[]   arr     = new Integer[2];
System.debug( arr );//(null, null)
//null hicbir ozelligi olmayan object demektir. Ici bos demektir

//Ornek: 5 elemanli notlar adinda, Integer bir array olusturunuz ve console a yazdiriniz
Integer[] notlar = new Integer[5];
System.debug(notlar);//(null, null, null, null, null)

//Ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console a yazdiriniz.
String[] isimler = new String[3];
					//	  0      1    2	
System.debug(isimler);//(null, null, null)

//Array'e eleman eklemek
//index mantigi ile eleman ekleniyor.   0      1    2
String[] isimler = new String[3];	//(null, null, null)
isimler[0] = 'Ali Can';
//System.debug(isimler);
isimler[2] = 'Ayse Han';
//System.debug(isimler);//(Ali Can, null, Ayse Han)
isimler[1] = 'Veli Can';
System.debug(isimler);//(Ali Can, Veli Can, Ayse Han)
