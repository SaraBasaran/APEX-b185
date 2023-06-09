  //Ornek 2: Sayi cift ise console'a 'cift' tek ise 'tek' yazdirin.

Integer num = 13;
 
if(Math.mod(num, 2)==0){   
    System.debug('Cift');  
}

if(Math.mod(num, 2)!=0){     
    System.debug('Tek');   
}

// Ornek 3: Girilen sayi -1 ile  10 arasinda ise (degerler haric) ekrana rakam yazdiriniz

Integer num = 19;

    if(num>-1 && num<10){    
        System.debug('rakam');        
    }    

//Ornek 4: Dogru password 'pwd123!' oldugunda verilen passwordun dogru olup olmadigini kontrol eden ve
//kullaniciya uygun mesaj veren kodu yaziniz
//equals()

String pwd ='1234';

if(pwd.equals('pwd123!')){
    System.debug('Password u dogru girdiniz, tebrikler ...');
}

if(!pwd.equals('pwd123!')){
    System.debug('Password u yanlis girdiniz, tekrar deneyiniz ...');
}

//if else statements
//else degilse, aksi halde demektir
//condition dogru ise (true) if blogu, condition yanlis ise (false) ise else blogu calisir
//if else iki durumlu senaryolarda kullanilabilir
//if else de sadece birisi calisabilir

/* ----------if else kalibi------
if(condition){
    
}else{
    
}
*/

//Ornek 1: Sayi 10 dan kucuk ise console'a kucuk yazdirin degil ise kucuk degil yazdirin

Integer num = 13;
if(num<10){  
    System.debug('Kucuk');   
}else{   
    System.debug('Kucuk degil');     
}

//Ornek 2: Sayi cift ise console'a 'cift' tek ise 'tek' yazdirin.

//---------if cozumu----------------
Integer num = 13;							//kontrol edilen condition sayisi : 2
if(Math.mod(num, 2)==0){   
    System.debug('Cift');  
}
if(Math.mod(num, 2)!=0){     
    System.debug('Tek');   
}
//---------------------------------

Integer num = 13;
											//kontrol edilen condition sayisi : 1
if(Math.mod(num, 2)==0){
    
     System.debug('Cift'); 
    
}else{    
     System.debug('Tek');   
}

//Ornek 3: Dogru password 'pwd123!' oldugunda verilen passwordun dogru olup olmadigini kontrol eden ve
//kullaniciya uygun mesaj veren kodu yaziniz
//stringlerle esitlik kontrolu yapılmasi gerektiginde equals() methodu kullanilir cunku stringlerde == operatoru calismaz

String pwd ='1234';

if(pwd.equals('pwd123!')){    
    System.debug('Password u dogru girdiniz, tebrikler ...');
    
}else{   
    System.debug('Password u yanlis girdiniz, tekrar deneyiniz ...');
}

//if - else if .... else statements
//daha fazla durumlu senaryolarda kullanilir. gerektigi kadar else if eklenebilir
/*
if(){
    
}else if(){
    
}else{
    
}
*/
//Ornek 1: Verilen herhangi bir sayinin pozitif, negatif veya notr olup olmadigini kontrol eden kodu yaziniz
Integer x =-5;

if(x>0){
    
    System.debug(x +' pozitiftir');
    
}else if(x<0){
    
     System.debug(x +' negatiftir');
}else{
    
     System.debug(x +' noturdur');
}

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
