// Ornek 3 :Dogru password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden ve
//kullaniciya uygun mesaj veren kodu yaziniz.
// (c) ? (t) : (f);
String pwd = 'pwd123!';
String sonuc = pwd.equals('pwd123') ? 'Password Dogru' : 'Password Yanlis' ;
System.debug(sonuc);
//Ornek 4 :Asagidaki ornege gore 'ali' ve 'aLi' isimleri icin ciktiyi bulunuz.
// (c) ? (t) : (f);
String adi = 'ali';
String game = adi.equals('ali') ? 'ali' : 'ALI';
System.debug(game);
//nested ternary
//Ornek 1: Asagidaki ornege gore 'Ali', 'Veli', 'Ayse' isimleri icin ciktiyi bulunuz
// (c) ? ( (c) ? (t) : (f)) : (f);
String name = 'Ali';
String sonuc = (name.length()>3) ? name.contains('l') ? 'Merhaba Veli' : 'Merhaba Ayse'  : 'Merhaba Ali' ;
System.debug(sonuc);
//Ornek 2: Verilen yilin 'Leap Year' olup olmadigini kontrol eden kodu yaziniz.
//365 yerine 366 gunu olan yildir.
/*Leap year;
            i) 100 e bolunen yil 400'e de bolunuyorsa "Leap Year" dir
            ii)100 e bolunemeyen yil, 4'e bolunuyorsa "Leap year" dir. 
*/
// (c) ? ( (c) ? (t) : (f) ) : ( (c) ? (t) : (f));
Integer year =1800;
String result =  (Math.mod(year,100)==0) ? ( (Math.mod(year,400)==0) ? ('Leap Year') : ('Leap Year degil') ) : ( (Math.mod(year, 4)==0) ? ('Leap Year') : ('Leap Year Degil'));
System.debug(result);
//Ornek 3: Verilen passwordu asagidaki kurallara gore kontrol eden kodu yaziniz
        //i) Password'de 8 karakter varsa ilk karakter 'i' olmali ve password gecerli yazmali 
        //ii) Password'de 8 karakter yoksa ilk karakter '!' olmali ve password gecerli yazmali 
String pwd = 'i1234567';
String sonuc =   (pwd.length()==8) ? ( (pwd.startsWith('i')) ? ('password gecerli') : ('password gecersiz') ) 
                                   : ( (pwd.startsWith('!')) ? ('password gecerli') : ('password gecersiz') );
System.debug(sonuc);
//----------------------------------------------------------------------------
//switch on statement 
//switch on ifadesi farkli kosullara dayali olarak farkli eylemleri gerceklestirmek icin kullanilir
//genel kullanimda 3 ten fazla durum varsa switch on kullanilir.
/* kalibi olusturalim
switch on variable {
    when data {
        
    }
    when data {
        
    }
    when data {
        
    }
    when else {
        
    } 
}
*/
//Ornek 1: Girilen cinsiyet degerlerine gore console a uygun cumleleri yaziniz.
String gender = 'Male';
switch on gender {
    when 'Male'{
        System.debug('This is a boy');
    }
    when 'Female'{
        System.debug('This is a girl');
    }
    when else{
        System.debug('Invalid Input');
    }
}
// Ornek 2 : Ay numarasina gore ayin ismini goseteren kodu yaziniz
//1 yol if - else if cozumu
Integer ayNumarasi = 4;
if(ayNumarasi==1){
    System.debug('Ocak');
}else if(ayNumarasi==2){
     System.debug('Subat');
}else if(ayNumarasi==3){
     System.debug('Mart');
}else if(ayNumarasi==4){
     System.debug('Nisan');
}else if(ayNumarasi==5){
     System.debug('Mayis');
}else if(ayNumarasi==6){
     System.debug('Haziran');
}else if(ayNumarasi==7){
     System.debug('Temmuz');
}else if(ayNumarasi==8){
     System.debug('Agustos');
}else if(ayNumarasi==9){
     System.debug('Eylul');
}else if(ayNumarasi==10){
     System.debug('Ekim');
}else if(ayNumarasi==11){
     System.debug('Kasim');
}else if(ayNumarasi==12){
     System.debug('Aralik');
}else{
     System.debug('Gecerli bir ay numarasi giriniz');
}
//2 yol switch on
Integer ayNumarasi = 4;
switch on ayNumarasi{
    when 1{
        System.debug('Ocak');
    }
    when 2{
        System.debug('Subat');
    }
    when 3{
        System.debug('Mart');
    }
    when 4{
        System.debug('Nisan');
    }
    when 5{
        System.debug('Mayis');
    }
    when 6{
        System.debug('Haziran');
    }
    when 7{
        System.debug('Temmuz');
    }
    when 8{
        System.debug('Agustos');
    }
    when 9{
        System.debug('Eylul');
    }
    when 10{
        System.debug('Ekim');
    }
    when 11{
        System.debug('Kasim');
    }
    when 12{
        System.debug('Aralik');
    } 
    when else{
        System.debug('Gecerli bir ay numarasi giriniz');
    }  
}
//Ornek 3 : Asagidaki kurallara gore harfe karsilik gelen notu console a yazdiriniz
//A==>81-100  B ==> 71-80  C==>61-70 D==>50-60  E==>0-49
//1 yol
String dersNotu = 'c';
switch on dersNotu.toUpperCase() {
    when 'A'{
       System.debug('81-100'); 
    }
    when 'B'{
       System.debug('71-80'); 
    }
    when 'C'{
       System.debug('61-70'); 
    }
    when 'D'{
       System.debug('50-60'); 
    }    
    when 'E'{
       System.debug('0-49'); 
    }
    when else{
       System.debug('Gecerli bir harf giriniz'); 
    }    
}
//2. yol
String dersNotu = 'e';
switch on dersNotu {
    when 'A','a'{
       System.debug('81-100'); 
    }
    when 'B','b'{
       System.debug('71-80'); 
    }
    when 'C','c'{
       System.debug('61-70'); 
    }
    when 'D','d'{
       System.debug('50-60'); 
    }    
    when 'E','e'{
       System.debug('0-49'); 
    }
    when else{
       System.debug('Gecerli bir harf giriniz'); 
    }    
}
//Ornek 4 : Verilen karakter A,E,I,O,U,a,e,i,o,u dan birisi ise "Sesli harf"
            //verilen karakter yukaridaki harflerden farkli ise 'Sessiz Harf'
            //verilen karakter 0,1,2,3,4,5,6,7,8,9 dan birisi ise 'Rakam' 
            //Verilen karakter harf veya rakam degilse 'sembol' yazdiriniz
String karakter = '?';
switch on karakter.toUpperCase(){
    when 'A','E','I','O','U'{
        System.debug('Sesli Harf');
    }
    when 'B','C','D','F','G','H','J','K','L','M','N','P','R','S','T','V','W','X','Y','Z'{
        System.debug('Sessiz Harf');
    }
    when '0','1','2','3','4','5','6','7','8','9'{
        System.debug('Rakam');
    }
    when else{
        System.debug('Sembol');
    }
}

