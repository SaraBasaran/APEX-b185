//Ornek 2: Asagidaki tabloya gore ders notlarini harflerle ifade ediniz.

/*		 0 - 50 (Dahil degil) ==> D
		50 - 60 (Dahil degil) ==> C
		60 - 80 (Dahil degil) ==> B
		80 - 100 (Dahil ) 	  ==> A
*/

// 1 yol

Integer dersNotu = 100;

if(dersNotu>=0 && dersNotu<50){
     System.debug('D');   
}else if(dersNotu>=50 && dersNotu<60){   
    System.debug('C');    
}else if(dersNotu>=60 && dersNotu<80){    
    System.debug('B');       
}else if(dersNotu>=80 && dersNotu<=100){    
    System.debug('A');   
}else {   
     System.debug('Ders notu 0 ile  100 arasinda olmalidir');
}


//2 yol

Integer dersNotu =50;

if(dersNotu<0){
    System.debug('Ders notu negatif olamaz');
}else if(dersNotu<50){
    System.debug('D'); 
}else if(dersNotu<60){
    System.debug('C'); 
}else if(dersNotu<80){
    System.debug('B'); 
}else if(dersNotu<=100){
    System.debug('A'); 
}else{
    System.debug('Ders notu 100 den buyuk olamaz'); 
}

//Ornek 3 : Haftanin gunlerinin sayisi girildiginde, gunun ismini yazan kodu yaziniz
//1 ==> Pazar, 2 ==> Pazartesi...

Integer numOfDay = 0;

if(numOfDay<1){
    System.debug('Gun sayilari 1 den kucuk olamaz');
}else if(numOfDay==1){
    System.debug('Pazar');
}else if(numOfDay==2){
    System.debug('Pazartesi');
}else if(numOfDay==3){
    System.debug('Sali');
}else if(numOfDay==4){
    System.debug('Carsamba');
}else if(numOfDay==5){
    System.debug('Persembe');
}else if(numOfDay==6){
    System.debug('Cuma');
}else if(numOfDay==7){
    System.debug('Cumartesi');
}else{
    System.debug('Gun sayilari 7 den buyuk olamaz');
}

//Ornek 4 : Bas harfleri verilen ay adlarini console a yazdiriniz
//'O' ==> Ocak, 'S'==> Subat,  'M' ==> Mart, Mayis 'N' ==> Nisan 

String aylar = 'o';

if(aylar.equals('O')){
    System.debug('Ocak');
}else if(aylar.equals('S')){
     System.debug('Subat');
}else if(aylar.equals('M')){
     System.debug('Mart, Mayis');
}else if(aylar.equals('N')){
     System.debug('Nisan');
}else{
     System.debug('Tanimli bir ayin bas harfini girmediniz');
}

//-----------------------------------------------------------------------------------
//nested if ==> ic ice gecmis demektir
/*if(){
    
    if(){
    
		}
    
	}
*/
//Ornek 1 : Kisinin cinsiyetine ve yasina bakara uygun mesaji console a yazdiriniz

/*		Kisi erkek ise ;

				a) 16 yasindan kucuk ise calismamali
				b) 16-65 (dahil) arasi calismali
				c) 65 yasindan buyukse emekli olmali

		Kisi kadin ise ;

				a) 18 yasindan kucuk ise calismamali
				b) 18-60 (dahil) arasi calismali
				c) 60 yasindan buyukse emekli olmali
*/

String gender = 'Male';
Integer age = 50;

if(gender.equals('Male')){
    
    if(age<0){
        System.debug('Age negatif olamaz');
    }else if(age<16){
        System.debug('Calismamali');
    }else if(age<=65){
		System.debug('Calismali');        
    }else{
        System.debug('Emekli olmali');
    }      
    
}else if(gender.equals('Female')){
    
    if(age<0){
        System.debug('Age negatif olamaz');
    }else if(age<18){
        System.debug('Calismamali');
    }else if(age<=60){
		System.debug('Calismali');        
    }else{
        System.debug('Emekli olmali');
    }   
    
}else{
    System.debug('Sizin icin farkli bir tanimlama yapilmadi');
}

// Ornek 2 :Kullanicidan alinan password e gore uygun mesajlari yazdiriniz
/*
		Password buyuk harf ile basliyorsa 
				i) 'A' veya 'B' ile baslamali

		Password kucuk harf ile basliyorsa
				i) 'y' veya 'z' ile baslamali

*/

String pwd ='Abc';

if(pwd.charAt(0)>=65 && pwd.charAt(0)<=90 ){//tum buyuk harfleri sectim    
    if(pwd.charAt(0)==65 || pwd.charAt(0)==66){      
        System.debug('Password dogru');       
    }else{       
        System.debug('Password kurallara uygun degil, cunku ilk karakter A veya B degil');
    }
    
}else if(pwd.charAt(0)>=97 && pwd.charAt(0)<=122){//tum kucuk harfleri sectim    
    if(pwd.charAt(0)==121 || pwd.charAt(0)==122){       
        System.debug('Password dogru');      
    }else{       
        System.debug('Password kurallara uygun degil, cunku ilk karakter y veya z degil');
    }
}else{
    System.debug('Password kurallara uygun degil, cunku ilk karakter harf degil');
}
//----------------------------------------------------------------------------------------------
//tavsiye edilen
//bir methodu tekrar tekrar kullanmak istiyorsaniz onu bir degiskene atayarak kullanmak daha makul bir yöntemdir

String pwd ='Abc';
Integer firstChar = pwd.charAt(0);

if(firstChar>=65 && firstChar<=90 ){//tum buyuk harfleri sectim    
    if(firstChar==65 || firstChar==66){      
        System.debug('Password dogru');       
    }else{       
        System.debug('Password kurallara uygun degil, cunku ilk karakter A veya B degil');
    }   
}else if(firstChar>=97 && firstChar<=122){//tum kucuk harfleri sectim    
    if(firstChar==121 || firstChar==122){       
        System.debug('Password dogru');      
    }else{       
        System.debug('Password kurallara uygun degil, cunku ilk karakter y veya z degil');
    }
}else{
    System.debug('Password kurallara uygun degil, cunku ilk karakter harf degil');
}
//______________________________________________________________________________________________
//Ternary Statement
//if else'in ayni mantiga sahiptir, sadece syntax farklidir
//				true			false
//condition ? ilk cikti  :  ikinci cikti
//condition dogru ise ? den sonraki kisim, yanlis ise : den sonraki kisim calisir

//Ornek 1: Sayi 10 dan kucuk ise console kucuk yazdirin degil ise kucuk degil yazidirin.
//--------if else cozumu----
Integer num = 2;
if(num<10){
    System.debug('Kucuk');
}else{
    System.debug('Kucuk degil');
}

//----------ternary cozumu----

Integer num = 10;

				//condition   ?  	ilk cikti  	:  	ikinci cikti
String sonuc=		num<10    ?		'Kucuk'		:	'Kucuk degil';	

System.debug(sonuc);//Kucuk


//Ornek 2: Sayi cift ise console'a cift yazdirin, tek ise tek yazdirin

Integer num = 3;		

						   //condition   ?  	ilk cikti  	:  	ikinci cikti
String sonuc=	Math.mod(num, 2)==0	     ?		'Cift'		:	'Tek';	

System.debug(sonuc);