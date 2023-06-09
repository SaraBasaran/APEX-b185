//---------------------Hatali kod boyle bir method yok-------------
Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);
Integer yilFarki=fatherBirthDate.yearsBetween(sonBirthDate);
System.debug(yilFarki);
//-----------------------------------------------------------------

//Ornek 10 :Size verilen yilin leap year (artik yi) olup olmadigini kontrol ediniz
// Leap year :  a) 100'e bolunen yil 400'e de bolunuyorsa artik yildir. 2000+  1800-
//				b) 100'e bolunemeyen yil 4'e bolunuyorsa artik yildir.  2004+  2007-

//isLeapYear(year) methodu static bir methoddur. Yani classi ismi ile cagrilmalidir
//isLeapYear(year) methodu verilen bir yilin artik yil olup olmadigini kontrol ediyor
//isLeapYear(year) methodu Boolen return eder

//--------------Hatali------------------------------
//Static method cannot be referenced from a non static context: Boolean Date.isLeapYear(Integer)
//Static methodlar object uzerinden cagrilamazlar. class uzerinden cagrilabilirler
Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Boolean isFatherLeap = fatherBirthDate.isLeapYear(1990);
System.debug(isFatherLeap);
//----------------------------------------------------------

Date fatherBirthDate = Date.newInstance(2000, 7, 21);
Boolean isFatherLeap = Date.isLeapYear(fatherBirthDate.year());

System.debug(isFatherLeap);//FALSE

//Ornek 11 :Size verilen tarihi
//			a) String'e cevirmeden yilin son iki rakamini ekrana yazdiriniz
//			b) String'e cevirip yilin son iki rakamini ekrana yazdiriniz

//______________Math_______________
//Math.mod(bolunen, bolen)==> kalan 
//Math.mod(bolunen, bolen) methodu math class icerisindedir. Matematikle ilgili islemler bu class icerisindedir
//Math.mod(bolunen, bolen) methodu bolme isleminin kalanini verir
//Bir sayinin birler basamagini almak istersek o sayinin 10 ile bolumunden kalani aliriz


Integer kalan = Math.mod(25, 4);
System.debug(kalan);//1

Integer kalan = Math.mod(1990, 100) ;
System.debug(kalan);//90
//_______________________________________________________

Date fatherBirthDate = Date.newInstance(1999, 7, 21);
Integer justYear = fatherBirthDate.year();
Integer sonIkiRakam =Math.mod(justYear,100);

System.debug(sonIkiRakam);//99

//b) String'e cevirip yilin son iki rakamini ekrana yazdiriniz
//format() methodu verilen tarihi string'e cevirir.

Date fatherBirthDate = Date.newInstance(1999, 7, 21);
String dayString = fatherBirthDate.format().substring(8);

System.debug(dayString);//21/07/1999 ====>99


//---2 yol ----
Date fatherBirthDate = Date.newInstance(1999, 7, 21);
String dayString = fatherBirthDate.format();
System.debug(dayString.substring(dayString.length()-2));//99