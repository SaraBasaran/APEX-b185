/*
	Regular Expressions (Regex) Bir grup datayi almak icin kullaniriz

		1) Pozitif Senaryolar:
			Tum buyuk harfler : [A-Z]
			Tum kucuk harfler : [a-z]
			Tum Harfler		  : [A-Za-z] 	
			Tum rakamlar	  : [0-9]	
			a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
			Tum harfler ve rakamlar	: [A-Za-z0-9]
			Tum a, x, y ler	  : [axy]

		2) Negatif senaryolar:^(==> haric isareti)
			Tum buyuk harfler haric : [^A-Z]
			Tum kucuk harfler haric : [^a-z]

		3) Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
			Sadece space karakteri	:\\s
			Space karakteri haric   :\\S  (==>space demek)
			Sadece rakamlar			:\\d  (==>digit ten geliyor)
			Rakamlar haric			:\\D

*/
//Ornek 18: Bir string deki tum buyuk harfleri siliniz
//replaceAll() hepsini degistir

String m = 'Ali Can Kahraman';
String noUpperCase = m.replaceAll('[A-Z]','');
System.debug(noUpperCase);//li an ahraman

//Ornek 19: Bir string deki tum a, x, y leri  * ceviriniz
String n = 'Extra calisiyorum ki Apex ogrenebileyim';
String noaxy = n.replaceAll('[axy]','*');
System.debug(noaxy);//E*tr* c*lisi*orum ki Ape* ogrenebile*im

//Ornek 20: Bir string deki buyuk harfler haric tum karakterleri '!' e ceviriniz
String p = 'APEX icin KOD yazmalisiniz';
String buyukHaric = p.replaceAll('[^A-Z]','!');
System.debug(buyukHaric);//APEX!!!!!!KOD!!!!!!!!!!!!!

//Ornek 21: Bir string deki tum harfler haric butun karakterleri '?' e ceviriniz
String r = 'APEX icin TEKRAR etmek sarttir 12345465';
String harfHaric = r.replaceAll('[^A-Za-z]','?');
System.debug(harfHaric);//APEX?icin?TEKRAR?etmek?sarttir?????????

//Ornek 22: Bir string deki space haric tum karakterleri  * a ceviriniz.
//1 yol
String s = '1234 5678 9012 3456';
String spaceHaric = s.replaceAll('[^ ]','*');
System.debug(spaceHaric);//**** **** **** ****

//2 yol
String s = '1234 5678 9012 3456';
String spaceHaric = s.replaceAll('\\S','*');
System.debug(spaceHaric);//**** **** **** ****

//3 yol
String s = '1234 5678 9012 3456';
String spaceHaric = s.replaceAll('\\d','*');
System.debug(spaceHaric);//**** **** **** ****

//Ornek 23 : Bir string deki tum a harflerini * ceviriniz

//1 yol
String t = 'Pazara elma almaya gitmis...';
String noa = t.replaceAll('[a]','*');
System.debug(noa);//P*z*r* elm* *lm*y* gitmis

//2 yol
String t = 'Pazara elma almaya gitmis...';
String noa = t.replaceAll('a','*');
System.debug(noa);//P*z*r* elm* *lm*y* gitmis

//extra bilgi
//replace() methodu sinirli sayida datayi degistirmek icin kullanilir
String t = 'Pazara elma almaya gitmis...';
String noa = t.replace('a','*');
System.debug(noa);//P*z*r* elm* *lm*y* gitmis

//Ornek 24 : Verilen bir string in ilk karakterini / karakterlerin kontrol eden kodu yaziniz.
//startsWith() methodu bir string in ilk karakterini / karakterlerin kontrol eder
//startsWith() methodu Boolean return eder

String u = 'Ali Can';
Boolean startsA = u.startsWith('A');
System.debug(startsA);

//2. ornek
String u = 'Ali Can';
Boolean startsA = u.startsWith('ali');
System.debug(startsA);//false

//Ornek 25 : Verilen bir string in son karakterini / karakterlerin kontrol eden kodu yaziniz.
//endsWith() methodu bir string in son karakterini / karakterlerin kontrol eder
//endsWith() methodu Boolean return eder

String v = 'Veli Han';
Boolean endsn = v.endsWith('n');
System.debug(endsn);//true

String v = 'Veli Han';
Boolean endsn = v.endsWith('Han');
System.debug(endsn);//true

//Ornek 26 : Verilen password'un asagidaki kurallara uyup uymadigini kontrol ediniz
// 1) En az 8 karakter icermeli
// 2) En az 1 buyuk harf icermeli
// 3) En az 1 kucuk harf icermeli
// 4) En az 1 rakam icermeli
// 5) En az 1 sembol icermeli
// 6) Space karakter icermemeli

String password = 'Ac?!9adM';

// 1) En az 8 karakter icermeli
Boolean lengthControl =  password.length()>=8;
System.debug('lengthControl '+lengthControl);

// 2) En az 1 buyuk harf icermeli
Boolean upperCaseControl = password.replaceAll('[^A-Z]','').length()>0;
System.debug('upperCaseControl'+upperCaseControl);

