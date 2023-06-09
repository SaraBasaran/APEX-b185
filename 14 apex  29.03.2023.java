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

for(Integer i  =  1; i<6 ;   i++ ){     
    	System.debug('Hi..');
}

//Ornek 2: 20 (dahil) den 3(dahil) e kadar tum Integerlari console'a yazdiriniz.
					 	
for(Integer i = 20 ;	 i>2  ; 	i--  ){
    
    System.debug(i);
    
}

//Ornek 3: 3'den 20 (dahil)ye kadar tum cift sayilari console a yazdiriniz

//Increment artirma ==> i++;
//Decrement azaltma ==> i--;

for(Integer i =3; i<21 ;					 i++ ){
     
    if(Math.mod(i,2)==0){
         System.debug(i);      
    } 
}

//Ornek 4: 40 (dahil) dan 3(dahil) e kadar tum tek sayilari console'a yazdiriniz.

for(Integer i=40 ; i>2   ; i-- ){
    
    if(Math.mod(i,2)!=0){
        System.debug(i);
    }  
}

//Ornek 5: 1 den 9 a kadar sayilari ekrana yazdirirken degiskenin degeri 6 oldugunda donguyu
//kiran kodu yaziniz (1 ve 9 dahil)

//Break keywordunu Apex okudugu an loopun calismasini durdurur ve loopun disina cikar

for(Integer i=1; i<5;	 i++ ){    
    System.debug(i);
     
    if(i==3){   
        Break;       
    } 
}

//Ornek 6: 6 dan 10 a kadar tum Integerlarin toplamini console'a yazdiriniz(6 ve 10 dahil)
//6+7+8+9+10==>40
//Not: Bu tarz sorularda ilk hamlemiz, memory de toplami depolayabilecegimiz bir alan olusturmaktir

Integer toplam = 0;//toplama yaptigim icin etkisiz elemani koydum

for(Integer i =6; i<11  ; i++ ){   
    toplam = toplam + i;     
}
System.debug(toplam);

