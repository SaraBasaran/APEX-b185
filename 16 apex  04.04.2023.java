//--------------------------
//While loop
//--------------------------
//for loop'a cok benzer. Syntax(yazim) farklidir. Okunurlugu daha iyidir.

//kalibini olusturalim
//---------------------------------------
//for

for(baslangic degeri; loop calisma kurali; artirma / azaltma){
    calisacak kodlar
}
//---------------------------------------
//while
baslangic degeri
while(loop calisma kurali){
  calisacak kodlar  
 artirma / azaltma  
}    
//---------------------------------------
//Ornek 1: Console'a 5 defa 'Hi!' yazdirin

Integer i=1;
while(i<6){
 System.debug('Hi!');
 i++;
}   
//Ornek 2: 15 (dahil) den 8 (dahil)e kadar tum Integerlari console a yazdiriniz

Integer i=11;
	while(i>7){   
    System.debug(i);  
    i--;
   
}

//i-- yazmayi unutursak sonsuz donguye girer ve salesforce'un belirledigi komut calistirma suresi asilinca 
//"System.LimitException: Apex CPU time limit exceeded " hatasini verir

//Ornek 3: 3 den 20 ye kadar tum cift sayilari console'a yazdiriniz.(3 ve 20 dahil)

Integer i=3;

while(i<21){   
    if(Math.mod(i,2)==0){
        System.debug(i);
    }
    i++;
}

//Ornek 4: Verilen bir Integerin rakamlari toplamini conslole'a yazdiriniz
// 573 ==> 5 + 7 + 3 ==> output 15

//iki integer bolunurse sonuc her zaman integer olur, Apex yuvarlama islemi yapmaz
//ondalik kismi iptal ederek sayiyi integer yapar
//dolayisiyla bir sayiyi 10 a bolmek demek birler basamagini silmek demektir
//573 /10 ==> 57

Integer i =-573;
Integer toplam =0;
i=Math.abs(i);

while(i>0){
    toplam = toplam + Math.mod(i,10);                       
    i=i/10;   
}
System.debug(toplam);

//Ornek 5: Bir stringdeki tekrarsiz karakterleri console'a yazidiriniz
  012345678910	
//kertenkelle ==> rtn

//indexOf('r')		==> 2   ayni, tekrarsiz
//lastindexOf('r')	==> 2 
      
//indexOf('k')		==> 0   farkli, tekrarli
//lastindexOf('k')	==> 6      
      
//1 yol:

String s =  'kertenkelle';
String sonuc= '';

Integer i = 0;

while(i<s.length()){
    String harf = s.substring(i,i+1);
    if(s.indexOf(harf)==s.lastindexof(harf)){
       sonuc=sonuc+ harf;
    }
  i++;     
}
System.debug(sonuc);