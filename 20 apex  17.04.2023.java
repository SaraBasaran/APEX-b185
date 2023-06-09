//Ornek : Bir string array'de kullanilan toplam karakter sayisini ekrana yazdiriniz

String[] arr = new String[]{'Ali','Canan','Veli','Han'};      
Integer sum =0;

for(String  w : arr){   
   sum =sum + w.length();    
}
System.debug(sum);//15

//Ornek :Harflerden olusan string bir array de specific bir elemanin kac tane oldugunu bulan kodu yaziniz.
//'A','P','E','X', ' ', 'I','S', ' ','E', 'A','S','Y' 
//Output==> A Array de 2 defa kullanilmistir

String[] harfler = new String[]{'A','P','E','X', ' ', 'I','S', ' ','E', 'A','S','Y'}; 
String el = 'E';
Integer counter=0;

for(String w : harfler){
    
    if(w.equals(el)){
         counter++;            
    }
}
System.debug(el+' harfi Array de' + counter + ' defa kullanilmistir');

//Ornek : Bir Integer Arrayin icinde kac tane cift sayi kac tane tek sayi oldugunu gosteren
//ve console'a uygun mesaji veren kodu yaziniz

Integer[] arr = new Integer[]{19,313,2};
Integer sayac=0;

for(Integer w : arr){   
    if(Math.mod(w, 2)==0){
        sayac++;   //==> sayac = sayac + 1;  
    }   
}
String result = 'Array de '+sayac+' adet cift sayi '+ (arr.size()-sayac) + ' adet tek sayi kullanilmistir';
System.debug(result);
//Array de 3 adet cift sayi 3 adet tek sayi kullanilmistir

//-------------------------------------------------------
//List :
//Kac eleman koyulacagini soylemek zorunda degiliz
//Bu yuzden daha esnektir ama bu list'i yavaslatir
//Listler bir cok datayi icine alabilir ama tek tip data olmalidir.

//Kalibini olusturalim

List <DataType> variableName = new List<DataType>();
//--------------------------------------------------------------

//List olusturmak ve eleman eklemek

List<String> myList = new List<String>();
System.debug(myList);

//1. yol add() methodu kullanilir
myList.add('Ali');
myList.add('Veli');
myList.add('Selami');
System.debug(myList);//(Ali, Veli, Selami)

//2. yol: En sondaki parantezi silip, yerine suslu parantez koyulur ve icine data lar yazilir

List<String> myList = new List<String>{'Ali','Veli','Selami'};
    				//	0	  1	     2
System.debug(myList);//(Ali, Veli, Selami)

myList.add(1,'Hatice');//0     1      2       3
System.debug(myList);//(Ali, Hatice, Veli, Selami)

myList.add(3,'mehmet');
System.debug(myList);//(Ali, Hatice, Veli, mehmet, Selami)

