//Array'e eleman eklemek
//index mantigi ile eleman ekleniyor.   0      1    2
String[] isimler = new String[3];	//(null, null, null)
isimler[0] = 'Ali Can';
//System.debug(isimler);
isimler[2] = 'Ayse Han';
//System.debug(isimler);//(Ali Can, null, Ayse Han)
isimler[1] = 'Veli Can';
System.debug(isimler);//(Ali Can, Veli Can, Ayse Han)


//----------tavsiye edilen----------
String[] isimler = new String[]{'Ali Can','Veli Can','Ayse Han'};
System.debug(isimler);//(Ali Can, Veli Can, Ayse Han)

//Ornek: Decimal bir array olusturalim.

Decimal[] bmi = new Decimal[]{3.13,1.9,3.53};
 System.debug(bmi);   //(3.13, 1.9, 3.53)

//Ornek: Integer data tipinde ages isminde array olusturunuz ve icine 13,23 ve 7 datalarini koyunuz.

Integer[] ages = new Integer [3];

ages[0]=13;
ages[1]=23;
ages[2]=7;
ages[1]=313;
System.debug(ages);//(13, 313, 7)

//Recommended
Integer[] ages = new Integer[]{13,313,7}; 
System.debug(ages);//(13, 313, 7)

//Ornek: Integer data tipinde arr isminde bir array olusturunuz. Icine sirasiyla 5,9,6,10 ve 3
//datalarini koyunuz. Sonrada 3. ve 5. elemanlarini toplayip sonucu console a yazdiriniz.
						//    1 2 3 4  5
			   	// index      0 1 2 3  4             
Integer[] arr = new Integer[]{5,9,6,10,3};
System.debug(arr);   //(5, 9, 6, 10, 3)

//3. eleman 6 ==> indexi 2 yani arr[2]
//5. eleman 3 ==> indexi 4 yani arr[4]
System.debug(arr[2]+arr[4]);//9

//Ornek : String data tipinde arr isminde bir array olusturunuz. icine sirasiyla Ali, Mary,
//Tom, Brad datalarini koyunuz. Index'i 2 olan haric digerlerini ayri satirda console a yazdiriniz.
//size() methodu arrayin eleman sayisini verir. Bu ornekte 4 verir 
//continue keywordu (=anahtar sozcuk) bir dongudeki gecerli iteration'i sonlandirip sizi 
//artirma/azaltma bolumune goturur.

String[] arr = new String[]{'Ali','Mary','Tom','Brad'};

 //Tavsiye edilmez   
System.debug(arr); //(Ali, Mary, Tom, Brad)
System.debug(arr[0]); 
System.debug(arr[1]); 
System.debug(arr[2]); 
System.debug(arr[3]); 

//Tavsiye edilen
String[] arr = new String[]{'Ali','Mary','Tom','Brad'};   
    
    for(Integer i=0; i<arr.size();	 i++){
        
        if(i==2){        
            continue;           
        }        
        System.debug(arr[i]);       
    }    

//Ornek: Account Object data tipinde array olusturunuz. icine 4 tane Account object koyunuz.
//Account objectinde required field (zorunlu alan) name dir.
//Yani account objecti olustururken kesinlikle doldurmak zorundayiz.

//account olusturma syntax
Account acc1 = new Account(Name='First Account', Phone='123');
Account acc2 = new Account(Name='Second Account', Phone='234');
Account acc3 = new Account(Name='Third Account', Phone='345');
Account acc4 = new Account(Name='Fourth Account', Phone='456');

Account[] arr = new Account[]{acc1,acc2,acc3,acc4};
System.debug(arr);
//(Account:{Name=First Account, Phone=123}, 
//Account:{Name=Second Account, Phone=234}, 
//Account:{Name=Third Account, Phone=345}, 
//Account:{Name=Fourth Account, Phone=456})  

//insert arr; istersek Admin parta gondermek icin kullanilir

//Ornek :(5,0,2,0) array inde tum sifirlari sona yerlestiriniz
//(5,0,2,0) ==> (5,2,0,0)

Integer[] arr = new Integer[]{5,0,2,0}; 

Integer[] yeniArr = new Integer[arr.size()];  
System.debug(yeniArr);//|(null, null, null, null)

Integer ilkIndx=0;
Integer sonIndx=arr.size()-1;

for(Integer i=0; i<arr.size(); i++){
    
    if(arr[i]!=0){
        yeniArr[ilkIndx]=arr[i];
        ilkIndx++;
       
    }else{
       yeniArr[sonIndx]=0;
        sonIndx--;             
    }  
}
System.debug(yeniArr);
