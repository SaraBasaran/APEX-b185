//Loops ==> Donguler
//Loop'lar tekrar eden kodlama islemlerini kolaylastirmak icin kullanilir
//Tum kod parcalarini belirli bir kural dongusu icinde tekrarlamak icin kullanilir

/*
1) for-loop
2) while-loop
3) do-while loop
4) for-each loop
*/

//1. for-loop
//temel olarak bir kod blogunu belirli bir sayida ve ust uste calistirmak icin kullanilir

//Ornek 1: console'a 5 defa Hi yazdirin

//1.yol
System.debug('Hi..!');
System.debug('Hi..!');
System.debug('Hi..!');
System.debug('Hi..!');
System.debug('Hi..!');

//2. yol : kalibini olusturalim
/*
for(Datatype VariableName = Baslangic Degeri ; LoopCalismaKurali ; Artirma/Eksiltme ){
    Calisacak kodlar
}
*/
	Datatype VariableName = Baslangic Degeri ; LoopCalismaKurali ; Artirma/Eksiltme
for(Integer		 i 		  =     1            ;   i<6             ;     i++          ){
   System.debug('Hi..');
}
//i++ ==> i = i+1; ile ayni islevi gorur.
