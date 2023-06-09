//5) Double : 64 bitlik ondalik sayilar icin kullanilir.
Double piSayisi=3.6546546546544444444444444444444545454545454545454545454D;
System.debug(piSayisi);//Illegal decimal

Double a = 3.13d;

//6 Boolean : Dogru/yanlis cevaplari icin Boolean data tipini kullaniriz
//true, false, null seklinde 3 farkli degere sahiptir

//Ornek 1: Emekli mi? etiketini true olarak cevaplayan kodu yaziniz.
Boolean isRetired = true;
System.debug('Emekli mi?  '+isRetired);

/*
	1)Apex te 'logical operator' lar vardir
		AND ve OR islemleri logical operatorlardir

		a)AND (&&) isleminden true alabilmek icin her sey true olmalidir
		AND islemi "perfectionist" tir, bir tane false sonucu false yapar

//Ornek 1
*/
Boolean b1 =true;
Boolean b2 =true;
Boolean b3 =false;
Boolean b4 =false;

System.debug(b1 && b2 ); //true && true = true
System.debug(b2 && b3 ); //true && false = false
System.debug(b3 && b2 ); //false && true = false
System.debug(b3 && b4 ); //false && false = false

/*
	b) OR (||) isleminde bir tane true sonucu true yapmaya yeter
      || operatoru veya anlamina gelir, arasina konuldugu degerlerden herhangi biri true ise
	  sonuc true olmasina yeterlidir
	 OR islemi polyanna gibidir	
*/

Boolean b1 =true;
Boolean b2 =true;
Boolean b3 =false;
Boolean b4 =false;

System.debug(b1 || b2 ); //true || true = true
System.debug(b2 || b3 ); //true || false = true
System.debug(b3 || b2 ); //false || true = true
System.debug(b3 || b4 ); //false || false = false

// NOT operator (!) true olani false, false olani true yapar
// !true ===> false
// !false===> true
// !!true ==> true

// 2) Comparison (Karsilastirma) Operators
// kücüktür büyüktür  kücük esittir buyük esittir  esit degil  esittir
//  <,        >,          <=,             >=,           !=,      ==
//Karsilastirma operatorlerini kullandiginizda sonucu kesinlikle Boolean alirsiniz.
//Ornek 3
Boolean b1 = 3 < 5; //==> true
Boolean b2 = 2+3!=5; //==> false
Boolean b3 = !false; //==> true

System.debug(b1+' '+b2+' '+b3);
System.debug(b1 && b2); //false
System.debug(b1 || b3); //true
System.debug(b2 || b3); //true

//--------------------------------------------------------------------
// String Data Tipi
//Cumleler, kelimeler, semboller, rakamlar ............ icerebilir
//ORNEK 1: "s" string'ine'Ali Can' yukleyiniz.

String s = 'Ali Can';
System.debug(s);//Ali Can

//Ornek 2: s String'inin degerini buyuk harflerle yazdiriniz.
//toUpperCase() methodu tum harfleri buyuk harfe donusturur.

String s = 'ali CaN';
String buyukHarf = s.toUpperCase();//ALI CAN
System.debug(buyukHarf);


//Ornek 3: s String degerini kucuk harflerle yazdiriniz.
//toLowerCase() methodu tum harfleri kucuk harfe donusturur.

String s = 'Ali Can';
String kucukHarf = s.toLowerCase();//ali can
System.debug(kucukHarf);

//Ornek 4: Size verilen tum isimleri ilk harfleri buyuk diger harfleri kucuk olacak sekle ceviriniz
//Kullanici hatalarini kod yazarken tamir etmeliyiz
//capitalize() method'u String'in ilk harfini buyuk yapar
//Bir satirda birden fazla method'u yanyana kullanirsaniz buna "method chain (zincir)" denir 
//index her zaman 0 dan baslar

//-------tam cevabi bu deegil-----
String t = 'ali cAN'; //===> Ali Can olmasi isteniyor
String tNew = t.toLowerCase().capitalize();
System.debug(tNew);//Ali can
//--------------------------------------

//split() methodu bir string i istedigimiz karakterden bolmeye yarar

String t = 'vELi han'; 

String firstName = t.split(' ')[0].toLowerCase().capitalize();//Ali
String lastName = t.split(' ')[1].toLowerCase().capitalize();//Can

System.debug(firstName);
System.debug(lastName);
System.debug(firstName+' '+lastName);// Veli Han

//Ornek 5: Kullanici ismini girerken basta ve sonda bosluk birakabilir
//ama isimler boslukla baslamaz ve boslukla bitmez. Bu hatayi tamir eden kodu yaziniz
//trim() bir string deki bastaki ve sondaki bosluklari siler

String u = '           Ali  Can          ';
System.debug(u);//           Ali  Can          
String trimmed = u.trim();
System.debug(trimmed);//Ali  Can

//Ornek 6: Kullanicin isminde bosluklari sildikten sonra kac harf olduğunu bulan kodu yaziniz
//'       Ali   Can     '  ==>6
//deleteWhiteSpace() String deki tum bosluklari siler
//length() Stringde karakter sayisini bize verir

String v = '       Ali   Can     ';
String bosluksuz = v.deleteWhiteSpace();
System.debug(bosluksuz);//AliCan
Integer bosluksuzSayi = bosluksuz.length();//Illegal assignment from Integer to String
System.debug(bosluksuzSayi);
