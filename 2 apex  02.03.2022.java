//data type  +  variable name + atama operatoru + data + noktali virgul 
 Integer          age               =             13        ;   

Integer age;
/*
1) Variable adi, variable ile ilgli olmalidir.
*Ornegin bir ögrenci yasi icin bir variable olusturuyorsaniz variable adinda yas ve ogrenci kelimelir bulunmalidir
*Variable lar her zaman kucuk harf ile baslar. Eger variable isminde birden fazla kelime kullanilmasi gerekiyorsa
ilk harf disinda diger kelimelerin ilk harfleri buyuk harf olmalidir
*Bu adlandiram kuralina camelCase adi varilir
*ornegin ==> ageOfStudent, nameOfSchool , ogrenciYasi, okulAdi

2) '=' esittir isareti apex te atama operatorudur
==> sagdaki degeri alir ve soldaki sepete koyar

3) Bir variable olusturdugumuzda cogu zaman ona bir deger atariz. Eger atama yapmaz isek Apex
o variable a default value(==>varsayilan deger) olarak null koyar
**null demek 0 demek degildir, 0 da coding te bir degerdir
null ici bos obje demektir
**yani icinde variable yada method bulunmayan obje demektir

4) Apexte her code satirinin sonunda ';' kullanilir
** bu ifade dilbilgisinde cumlenin sonuna konulan nokta '.' gibidir

*/

//Ornek : String data tipinde ismi name olan bir variable olusturarak icine Ali Can datasini yukleyiniz

//data type  +  variable name + atama operatoru + data + noktali virgul 
//String lerde deger atamasi yaparken tek tirnak arasina almaliyiz

String  name = 'Ali Can';//Unexpected token 'name'.

//Ornek : Integer data tipinde variable isimleri yas, boy, agirlik olan 3 tane variable olusturunuz
//ve sirasiyla 13, 353, 19 degerlerini atayiniz

//1 yol
Integer yas = 13;
Integer boy = 353;
Integer agirlik = 19;

Integer yas = 15;//Duplicate field: yas
System.debug(yas);

Integer ağirlik = 33;//Invalid character in identifier: ağirlik

//2. Yol // tavsiye edilen yöntem, tekrar yok
//eger data tipleri ayni ise ve birden fazla variable icin bu yol tavsiye edilir
Integer yas = 13, boy = 353, agirlik = 19;
System.debug(boy);

//Apex te data tipleri

//1) Integer : Tam sayi demektir. Ondalik icermez. Memory de 32 bit yer kaplar
//Deger araligi -2.147.483.648 den baslar ve max degeri 2.147.483.647 ye kadardir.

//Ornek 1: Okula kayit olan bir ogrencinin yasini tutmak icin bir variable olusturunuz

Integer ogrenciYasi = 17;
System.debug('Ogrencinin yasi  :' + ogrenciYasi);

Integer yas = 13;
System.debug(yas);

//Ornek 2: Iki tane integer variable olusturun ve toplamlarini console a yazdiriniz
Integer a = 12, b = 13;
System.debug(a+b);

//2) String : String data tipi cumleler, kelimeler, semboller, rakamlar icerebilir
// Ornek 1: iki tane String variable olusturun ve o variable lari birlestirerek console a yazdirin
String s = 'Ali', t = 'Can'; 
System.debug(s+t);//AliCan
System.debug(s+' '+t);//Ali Can

//Stringle beraber '+' isareti kullanirsaniz o isaret 'concatination' anlamina gelir.
//'concatination' demek stringleri birbirine yapistirmak demektir
//iki sayinin arasina + isareti koyarsaniz toplama islemi yapar.

// Ornek 2: Iki String variable olusturun. Stringleri birbirine yapistirin ve console a yazdirin

//Cozum 1:
String a = 'APEX';
String b = 'is easy';
System.debug(a+b);//APEXis easy

//Cozum 2:
String a = 'APEX ';
String b = 'is easy';
System.debug(a+b);//APEX is easy

//Cozum 3:
String a = 'APEX';
String b = ' is easy';
System.debug(a+b);//APEX is easy

//Cozum 4://tavsiye edilen
String a = 'APEX', b = 'is easy';
System.debug('tavsiye edilen ==> '+a+' '+b);//tavsiye edilen ==> APEX is easy

//Ornek 3: Bir string ve iki integer variable olusturun. 
//String degeri ile integer larin toplamini console yazdirin

String s = 'elma';
Integer a = 10, b = 11;

System.debug(s+a+b);//elma1011
System.debug(a+b+s);//21elma
System.debug(s+(a+b));//elma21
System.debug(s+a*b);//elma110

/*
Matematikte islem onceligi
1)Parantez ici islemler once yapilir
2)Carpma ve bolmeler
3)Toplama ve cikarmalar yapilir
4)Ayni oncelikli olanlarda soldan saga baslanir
*/

//3)Long : Tamsayilar icindir. Memory'de 64 bit yer kaplar
//Deger araligi Integer'lardan buyuktur.
//Integer'larin deger araligi yetmedigi durumlarda Long kullanilir

//Ornek 1: Iki tane Long variable olusturun ve toplamlarini bir etiket ile console a yazdirin
Long m =1234567898781l, n = 123456987454L;//Illegal integer
System.debug('Toplam : '+( m + n));

//Long olustururken eger deger Integer'larin maximum degerinden buyuk ise sonuna 'L' veya 'l' koymak zorundasiniz
//yoksa Illegal integer hatasi alirsiniz

//Ornek 2: Iki tane long variable olusturun ve toplamlarini bir etiketle console a yazdirin

Long a = 13, b = 12;
System.debug(a+b);//25

//4)Decimal : Ondalikli sayilar icin kullanilir
//ozellikle fiyat degerleri icin 'Decimal' kullanilir

//Ornek 1: 13.53 liralik bir gomlegi fiyat etiketi kullanarak console'a yazdiriniz
Decimal gomlekFiyati = 13.53;
System.debug('Fiyat :'+gomlekFiyati);//Fiyat :13.53

//Ornek 2: 3 tane Decimal data tipinde variable olusturunuz ve bunlarin toplamini console'a yazdiriniz
//1 yol
Decimal corapFiyati = 12.99;
Decimal gomlekFiyati = 23.99;
Decimal ayakkabiFiyati = 35.99;

System.debug('Toplam Fiyat : '+(corapFiyati+gomlekFiyati+ayakkabiFiyati ));//Toplam Fiyat : 72.97

//2 yol tavsiye edilen
Decimal corapFiyati = 12.99, gomlekFiyati = 23.99, ayakkabiFiyati = 35.99;
System.debug('Toplam Fiyat : '+(corapFiyati+gomlekFiyati+ayakkabiFiyati ));//Toplam Fiyat : 72.97
System.debug('Toplam Fiyat : '+(3*corapFiyati+2*gomlekFiyati+ayakkabiFiyati ));//Toplam Fiyat : 122.94

//Ornek 3: Bir tamsayi variable ile bir ondalik variable olusturun ve carpimlarini console a yazdirin

//Cozum
Integer a = 5;
Decimal b = 2.4;
System.debug('Carpimlari : '+ a*b);//Carpimlari : 12.0

