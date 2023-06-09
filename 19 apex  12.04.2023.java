//Ornek :(5,0,2,0) array inde tum sifirlari sona yerlestiriniz
//(5,0,2,0) ==> (5,2,0,0)

Integer[] arr = new Integer[]{5,0,2,0}; 
Integer[] yeniArr = new Integer[arr.size()];  
System.debug(yeniArr);//|(null, null, null, null)
Integer ilkIndx=0;
Integer sonIndx=arr.size()-1;

for(Integer i=0; i<arr.size();						 i++){       
    if(arr[i]!=0){
        yeniArr[ilkIndx]=arr[i];      
        ilkIndx++;       
    }else{
       yeniArr[sonIndx]=0;
        sonIndx--;             
    }  
}
System.debug(yeniArr);

//for each loop:
//for each loop array, list, set ve map lerde kullanilir.
//diger looplarda ki gibi baslangic, bitis, artirma/azaltma durumlarini dusunmek zorunda kalmayiz
//variable name olarak genel kabul w dur.
//Index kullanmamiz gerektiginde diger looplari kullanabiliriz

//kalibini olusturalim------------------
for(DataType w : array/list/set/map lerden biri){
    //calisacak kodlar
}
//-----------------------------------------
// Ornek: String data tipinde myArr isminde bir array olusturunuz. Icine sirasiyla Ali, Veli, Ayse, Fatma datalarini
//koyunuz. Isimlerin ilk harflerini console a yazdiriniz.

String[] myArr = new String[]{'Ali','Veli','Ayse','Fatma'}; 
    
    for(String w : myArr){
        String ilkHarf = w.substring(0,1);       
        System.debug(ilkHarf);
    }

// Ornek :Bir Integer array deki en buyuk ve en kucuk elemanin farkini bulunuz.
//Math.max() ve Math.min() methodlarini kullanacagiz

Integer[] arr = new Integer[]{5,12,200,8,23};   
Integer maksimum=arr[0];

for(Integer w : arr){      
   maksimum = Math.max(maksimum, w);    
}
System.debug(maksimum);//200
    
Integer minimum= arr[0];
for(Integer w : arr){      
   minimum = Math.min(minimum, w);    
}
System.debug(minimum);//5
System.debug(maksimum-minimum);//195

//---tavsiye edilen-----------
Integer[] arr = new Integer[]{5,12,200,8,23};   
Integer maksimum=arr[0];
Integer minimum= arr[0];

for(Integer w : arr){ 
   maksimum = Math.max(maksimum, w);    
   minimum = Math.min(minimum, w);    
}
System.debug(maksimum);//200
System.debug(minimum);//5
System.debug(maksimum-minimum);//195
//----------------------------------------
