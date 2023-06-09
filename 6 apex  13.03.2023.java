//Ornek 26 : Verilen password'un asagidaki kurallara uyup uymadigini kontrol ediniz
// 1) En az 8 karakter icermeli
// 2) En az 1 buyuk harf icermeli
// 3) En az 1 kucuk harf icermeli
// 4) En az 1 rakam icermeli
// 5) En az 1 sembol icermeli
// 6) Space karakter icermemeli

String password = 'Ac?!9fad';

// 1) En az 8 karakter icermeli
Boolean lengthControl =  password.length()>=8;
System.debug('lengthControl '+lengthControl);

// 2) En az 1 buyuk harf icermeli
Boolean upperCaseControl = password.replaceAll('[^A-Z]','').length()>0;
System.debug('upperCaseControl '+upperCaseControl);

// 3) En az 1 kucuk harf icermeli
Boolean lowerCaseControl = password.replaceAll('[^a-z]','').length()>0;
System.debug('lowerCaseControl '+lowerCaseControl);

// 4) En az 1 rakam icermeli
Boolean digitControl = password.replaceAll('[^0-9]','').length()>0;
System.debug('digitControle '+digitControl);

// 5) En az 1 sembol icermeli (==> sifirdan buyuk olmali )
Boolean symbolControl = password.replaceAll('[A-Za-z0-9]','').length()>0;
System.debug('symbolControl '+symbolControl);

// 6) Space karakter icermemeli (==> sifira esit olmali demek)
Boolean spaceControl = password.replaceAll('[^ ]','').length()==0;
System.debug('spaceControl '+spaceControl);


Boolean result = lengthControl && upperCaseControl && lowerCaseControl && digitControl && symbolControl && spaceControl;
System.debug('result ==>'+result);

//--------Date Class----------------------------------------------------------------------
//current ==> simdiki
//date ==> tarih

//today() methodu icinde bulundugunuz gunun tarihini verir
Date currentDate = Date.today();
System.debug(currentDate);//2023-03-13 00:00:00

//-------hata------
Integer cd = Date.today();
//===>Illegal assignment from Date to Integer

//Date.newInstance(year, month, day) methodu istediginiz tarih objectini olusturmaniza yarar
Date myDate = Date.newInstance(2002, 8, 2);
System.debug(myDate);//2002-08-02 00:00:00

//addDays() methodu ileriki tarihleri gun ekleyerek bulmak icin kullanilir
//Ornek 1: myDate'den  210 gün sonraki tarih nedir?
Date myDate = Date.newInstance(2003, 9, 3);
Date laterDate= myDate.addDays(210);
System.debug(laterDate);//2004-03-31 00:00:00

//addMonths() methodu ileriki tarihleri ay ekleyerek bulmak icin kullanilir
//Ornek 2: Bugünden 5 ay sonrasinin tarihi nedir?
Date currentDate = Date.today();
Date laterDate = currentDate.addMonths(5);//obje üzerinden kullanilan methodlar non-static methodlardir
System.debug(laterDate);//2023-08-13 00:00:00

//addYears() methodu ileriki tarihleri yıl ekleyerek bulmak icin kullanilir
//Ornek 3: Bugunden 2 yil 3 ay 170 gun sonrasinin tarihi nedir?
Date currentDate = Date.today();//static method tur cunku class ismi ile cagirabildim
Date laterDate =currentDate.addYears(2).addMonths(3).addDays(170);
System.debug(laterDate);//2025-11-30 00:00:00

//Ornek 4: Ali 04.05.2010 tarihinde dogmustur. Alinin dogum tarihinden 2 yil 3 ay 12 gun sonrasinin tarihi nedir?
Date birthDateOfAli = Date.newInstance(2010, 5, 4);
Date laterDate = birthDateOfAli.addYears(2).addMonths(3).addDays(12);
System.debug(laterDate);//2012-08-16 00:00:00


//----------------Hatali--------------------------------
//Method does not exist or incorrect signature: void minusDays(Integer) from the type Date
//Method mevcut degil yada yazim hatasi var
Date currentDate =Date.today();
Date oncekiTarih = currentDate.minusDays(210);
System.debug(oncekiTarih);
//Date class ta gecmise gitmek icin specific bir method yok


//Ornek 5:Ali 04.05.2010 tarihinde dogmustur.Alinin dogum tarihinden 3 yil 6 ay 18 gun oncesinin tarihi nedir?
Date birthDateOfAli = Date.newInstance(2010, 5, 4);
Date oncekiTarih =  birthDateOfAli.addYears(-3).addMonths(-6).addDays(-18);
System.debug(oncekiTarih);//2006-10-17 00:00:00

//Ornek 6: Verilen tarih objectinden sadece yili ekrana yazdirinz
//year() methodu tarih objectinden yil kismini Integer olarak bize verir. Cunku yili aldigimiz zaman sadece sayi olarak aliriz
//aksi takdirde Illegal assignment from Integer to Date hatasini alirsiniz

Date myBirthDate = Date.newInstance(1990, 7, 13);
Integer justYear = myBirthDate.year();
System.debug(justYear);//1990

//Ornek 7: Sizin ve cocugunuzun dogum tarihlerin aylarinin toplami nedir?
Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);
Integer justMonthFather = fatherBirthDate.month();
Integer justMonthSon = sonBirthDate.month();
System.debug(justMonthFather+justMonthSon);

//Ornek 8: Sizin ve cocugunuzun dogum tarihleri arasindaki gun sayisi nedir?
//daysBetween(other) methodu tarihler arasindaki gun sayisini verir
//daysBetween(other) methodu kullanirken buyuk tarih methoddan once kucuk tarih ise method parantezi icine yazilmalidir.
//aksi takdirde sonuc negatif cikar
Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);
Integer daysNumber = fatherBirthDate.daysBetween(sonBirthDate);
System.debug(daysNumber);//9397

//-----------negatif sonuc icin-------------
Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);
Integer daysNumber = sonBirthDate.daysBetween(fatherBirthDate);
System.debug(daysNumber);//-9397
//-----------------------------------------------

//Ornek 9: Sizin ve cocugunuzun dogum tarihlri arasindaki ay sayisi nedir?
//monthsBetween(other) methodu tarihler arasindaki ay sayisini verir
//monthsBetween(other) methodu kullanirken buyuk tarih methoddan once kucuk tarih ise method parantezi icine yazilmalidir.
//aksi takdirde sonuc negatif cikar
Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);
Integer ayFarki =fatherBirthDate.monthsBetween(sonBirthDate);
System.debug(ayFarki);//309

//Ornek 10 :Size verilen yilin leap year (artik yi) olup olmadigini kontrol ediniz
// Leap year :  a) 100'e bolunen yil 400'e de bolunuyorsa artik yildir. 2000+  1800-
//				b) 100'e bolunemeyen yil 4'e bolunuyorsa artik yildir.  2004+  2007-

