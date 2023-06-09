//DateTime Class
//now() methodu GMT "Greenwich Mean Time" deki zamani verir.
//Turkiye +3 saat dilimindedir.


//Ornek 1:
DateTime myDT = DateTime.now();
System.debug(myDT);//2023-03-15 17:54:28

//Ornek 2: 
//hour() methodu DateTime dan sadece saat kismini almak icin kullanilir
//hour() methodu Integer return eder ve saati bulundugunuz timezone a gore otomatik olarak ayarlar
DateTime myDT =DateTime.now();
Integer justHour = myDT.hour();
System.debug(justHour);//20

//Ornek 3:
//addHours() methodu DateTime a saat eklemek veya cikarmak (negatif sayi kullanarak) icin kullanilir
//Kendi saatimizi gormek istersek, bulundugumuz saat diliminin GMT ye durumuna gore saat ekler veya cikaririz
DateTime myDT = DateTime.now();
System.debug(myDT);//2023-03-15 18:07:52
DateTime newDT = myDT.addHours(3);
System.debug(newDT);//2023-03-15 21:07:52

//Ornek 4:
//addDays() methodu DateTime a gun eklemek veya cikarmak icin kullanilir

DateTime myDT = DateTime.now();
System.debug(myDT);//2023-03-15 18:18:14
DateTime newDT = myDT.addDays(5);
System.debug(newDT);//2023-03-20 18:18:14

//Ornek 5:
//addMinutes(minutes) methodu DateTime a dakika eklemek yada cikarmak icin kullanilir
DateTime myDT = DateTime.now();
System.debug(myDT);//2023-03-15 18:29:07
DateTime newDT = myDT.addMinutes(20).addDays(5);
System.debug(newDT);//2023-03-20 18:49:07

//Ornek 6: 
//date() methodu DateTime dan sadece date'i almak icin kullanilir
DateTime myDT = DateTime.now();
Date newDate = myDT.date();
System.debug(newDate);//2023-03-15 00:00:00

//Ornek 7:
//format() methodu DateTime i stringe cevirir
DateTime myDateTime = DateTime.newInstance(2002, 8, 5, 10, 12, 13);
String newDT = myDateTime.format();
System.debug(newDT);//05/08/2002 10:12
System.debug(newDT.substring(0,2));//05

/*DateTime Class ta kullanilan saat formatlari

	HH : mm ==> 24'lu saat sistemi
	hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
	hh : mm a ==> 12'li saat sistemi AM, PM 
	HH : mm : ss==> saniyeyi gosterir
	HH : MM ==> yanlis format cunku MM aylar icin kullanilir

DateTime Class ta kullanilan tarih formatlari
	dd-MM-yyyy ==> gun - ay - yil
	MMM ==> Aug
	MMMM ==> August
*/
//Ornek 8:
//format(dateformat) method'u DateTime i string'e istedigimiz formatta cevirir
DateTime myDateTime =DateTime.newInstance(2002, 8, 13, 15, 13, 53);
String myStringFormat =  myDateTime.format('dd*MM*yyyy HH:mm');
System.debug(myStringFormat);//13*08*2002 15:13

//Ornek 9:
//format(dateformat, timezone) methodu istenen timezonedaki Datetime i stringe istedigimiz formatta cevirir

DateTime myDateTime =DateTime.newInstance(2002, 8, 13, 15, 13, 53);
String myStringFormat =  myDateTime.format('dd*MM*yyyy HH:mm','JST');
System.debug(myStringFormat);//13*08*2002 21:13

//UserInfo kullanici bilgilerini depolar
TimeZone tz = UserInfo.getTimeZone();
System.debug(tz.getDisplayName());//(GMT+03:00) Eastern European Standard Time (Europe/Istanbul)

TimeZone tz =TimeZone.getTimeZone('America/New_York');
System.debug(tz.getDisplayName());//(GMT-04:00) Eastern Daylight Time (America/New_York)
//-------------------------------------------------------------------------------------
//if statements
//bazi kodlari belli amaclara yada sartlara gore aktive edebilmek icin if statements kullanilir

//if you study hard, you will learn Apex  ===>english

/* if kalibini olusturalim

if(){

}

if(you study hard){you will learn Apex}   ===>Apex
if(eger burasi true ise){buradaki kodlar calisacak}   ===>Apex
if(eger burasi false ise){buradaki kodlar calismayacak}   ===>Apex

*/


if(13<5){
	System.debug('condition dogru if calisti');//condition dogru if calisti  
}

if(7==4+3){
    System.debug('condition dogru if calisti');//condition dogru if calisti
}

//Ornek 1 : Sayi 10 dan kucuk ise console'a 'kucuk' yazdirin 10 dan buyuk ise 'Buyuk' yazdirin

Integer num = 10;

if(num<10){   
    System.debug('kucuk');
}

if(num >10){   
    System.debug('buyuk');
}

