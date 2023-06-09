//substring() methodu
//substring() methodu iki turlu kullanilir
//1) substring(startinIndex) ==> starting index ten baslayarak sona kadar tum karakterleri alir
//method parantezi icine yazmis olduğumuz index dahil olmak uzere alir

String y = 'Tom Hanks';
String sonuc = y.substring(3);//om Hanks
System.debug(sonuc);

//2) substring(startingIndex, endingIndex) starting indexten (dahil) baslar ending indexe kadar
//ending index(HARIC) olmak üzere tum karakterleri alir

String y = 'Tom Hanks';
String sonuc = y.substring(0,2);//To
String sonuc2 = y.substring(4,7);//Han
System.debug(sonuc);
System.debug(sonuc2);

//Ornek 7: Kullanici isminin ilk harflerini alarak console'a yazdriniz
// '   Ali Can    ' ====> AC

String y = '   Aliye Han    ';

String yTrimmed = y.trim();//Ali Can
String first = yTrimmed.split(' ')[0].substring(0,1);//A
String last = yTrimmed.split(' ')[1].substring(0,1);//C
System.debug(first+last);

//-----tavsiye edilmez hard coding--
String y = 'mehmet Han';
String first = y.substring(0,1);
String last = y.substring(4,5);
System.debug(first+last);//AC
//----------------------------------


//indexOf() methodu specific bir karakterin ilk gorunumunun index ini verir.

String b = 'Ali Can, Canan, a selam soyle';
Integer idx= b.indexOf(',');
System.debug(idx);//7

//girilen index de dahil olmak uzere bakar ve bu indexten sonrasi icin aranan karakterin indexini verir
String b = 'Ali Can, Canan a selam soyle';
Integer idx= b.indexOf('a',6);
System.debug(idx);//10

//indexOf() methodu olmayan karakterler icin -1 verir
String b = 'Ali Can, Canan a selam soyle';
Integer idx= b.indexOf('u');
System.debug(idx);//-1

//Ornek 8: Asagidaki verilen string de "Can" kelimesinin ilk kullaniminin baslangic indexini bulunuz
//intexOf() methodunu coklu karakterler icin kullanirsaniz, ilk karakterin index ini verir.

String b = 'Ali Can, Canan a selam soyle';

Integer idx= b.indexOf('Can');
System.debug(idx);//4

//Ornek 9 : Bir stringin belirli bir karakterinden baslayarak sona kadar tum karakterlerini aliniz
// abc@gmail.com	==> gmail.com 
// dynamic
String z = 'abc@gmail.com';
Integer index = z.indexOf('@')+1;
String zNew = z.substring(index);//yada (index+1) yazabilirdik

System.debug(zNew);//@gmail.com

//Ornek10: Bir stringin belirli bir karakterinden baslayarak belli bir karakter kadar tum karakterlerini aliniz
// abc@gmail.com	==> gmail 

String a = 'abc@gmail.com';

Integer startingIndex = a.indexOf('@')+1;
Integer endingIndex = a.indexOf('.');
String companyName = a.substring(startingIndex,endingIndex);

System.debug(companyName);

//Ornek 11: Verilen string deki Can kelimesinn son kullaniminin baslangic indexini bulunuz
//'Canim Can, Canan a selam soyle'
//lastIndexOf() methodu specific bir karakterin son kullaniminin baslangic indexini verir

String c = 'Canim Can, Canan a selam soyle';
Integer idx= c.lastIndexOf('Can');
System.debug(idx);//11

//Ornek 12 : Size verilen bir String'in ilk ve son karakterlerinin ASCII degerlerini console'a yazdiriniz.
//charAt() index numarasi yazilarak ASCII deger elde edilir
//charAt() methodu parantezi icine yazmis olduğunuz indexte bulunan karakterin ASCII degerlerini bize verir
//Stringlerde herzaman ilk karakterin indexi '0' dir
//Stringlerde herzaman son karakterin indexi "toplam karakter sayisi" -1 dir
//yani length()-1 dir

String d = 'Ali Can';

Integer ilkASCII = d.charAt(0);
System.debug(ilkASCII);//65
Integer sonASCII = d.charAt(d.length()-1);

System.debug(sonASCII);//110

//Ornek 13 : Verilen bir stringde "a" karakterinin olup olmadigini kontrol eden kodu yaziniz
//contains() methodu herhangi bir karakterin yada karakterlerin stringde var olup olmadigini kontrol eder
//contains() methodu true veya false return eder (Boolean)

String e = 'Ali Can';
Boolean result = e.contains('a');
System.debug(result);//true

//Ornek 14 : Verilen bir stringde "an" karakterinin olup olmadigini kontrol eden kodu yaziniz

String e = 'Ali Can';
Boolean result = e.contains('an');
System.debug(result);//true

//Ornek 15 : Verilen bir stringde "an" karakterinin olup olmadigini BUYUK HARF KUCUK HARF 
// dikkat etmeden kontrol eden kodu yaziniz
//"an" ==>true  "An" ==>true  "aN" ==>true "AN"==TRUE
//containsIgnoreCase() methodu herhangi bir  karakterinin olup olmadigini BUYUK HARF KUCUK HARF 
// dikkat etmeden kontrol eder
//containsIgnoreCase() methodu true veya false return eder (Boolean)

String e = 'Ali Can';
Boolean result = e.containsIgnoreCase('AN');
System.debug(result);//true

//Ornek 16 : Verilen iki string in birbirinin aynisi olup olmadigin kontrol eden kodu yaziniz
//equals() methodu iki string in birbirinin aynisi olup olmadigin kontrol eder

String h = 'Ali Can';
String i = 'Ali can';
Boolean result = h.equals(i);
System.debug(result);//false

//Ornek 17: Verilen iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate
//almadan kontrol eden kodu yaziniz
//equalsIgnoreCase() methodu iki string in birbirinin aynisi olup olmadigin buyuk harf kucuk harf dikkate almadan kontrol eder
//equalsIgnoreCase() methodu true veya false return eder (Boolean)

String j = 'Ali Can';
String k = 'aLi caN';
Boolean result = k.equalsIgnoreCase(j);
System.debug(result);//true
