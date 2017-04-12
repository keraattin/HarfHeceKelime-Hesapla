## Recursive olarak girilen bir cumledeki harf , hece ve kelime sayisini hesaplayan program 

## Problem Nedir ? 
Kullanıcıdan alınan bir cumlenin veya herhangi bir verinin girilen bilgiler doğrultusunda kelime , harf ve hece sayisinin recursive olarak bulunması istenmektedir. 

## Veriler girilrken neler yapılmalıdır ve nelere dikkat edilmelidir ?
Veriler alınırken dikkat edilmesi gereken hususlar , girilen veride ne isteniyorsa X(Kelime) , Y(Hece) veya Z(Harf) ile temsil edilmelidir.Bunlardan herhangi biri veya birkacı istenildiği gibi verilebilir. 

## Her girdi her koşulda çalışır mı ?
Hayır. Her girdi her koşulda çalışmaz. Bazı girdiler sonsuz döngü oluşturur.

## Problemin çözümü 
**"Bu cümlede X tane kelime ve Y tane hece var." cümlesi için problemin çözümünü ele alalım.**

- 1) Hangi verilerin istendiği girdi üzerinden elde edilir. Bu cümlede bizden kelime sayisi (X) ve hece sayısı (Y) isteniyor.
- 2) Eğer girilen cümlede X(Kelime) isteniyor ise bu adıma başlanır. Aksi takdirde Y(Hece) ve Z(Harf) kontorlü yapılan diğer adımlara gecilir.
(i)Girilen cumlede kac tane kelime olduğu hesaplanır.Hesaplanan değer, yazı dilindeki karşılığına çevirilir.Yazı diline çevirilen değer cümledeki X alanı ile yer değiştirir.
- 3) Iceriği değiştirilen cümlenin kac kelime icerdiği tekrar hesaplanır. Hesaplanan değer, yazı dilindeki karşılığına çevirilir.Yazı diline çevirilen değer bir önceki değer ile eşit değilse yer değiştirir.
- 4) Bir önceki değer ile yeni hesaplanan değer birbirine eşit olana kadar 3 adımı tekrarlanır.Cumle dengeye ulaştığında yani önceki hesaplanan değer ile yeni hesaplanan değer eşit olduğunda bir sonraki adıma geçilir.
- 5) Eğer girilen cümlede Y(Hece) isteniyor ise bu adıma başlanır. Aksi takdirde Z(Harf) kontrolü yapılan diğer adımlara geçilir.
(i) Girilen cumlede kac tane hece olduğu hesaplanır.Hesaplanan değer yazı dilindeki karşılığına çevirilir. Yazı diline çevirilen değer cümledeki Y alanı ile yer değiştirir.
- 6) Iceriği değiştirilen cümlenin kac tane hece icerdiği tekrar hesaplanır. Hesaplanan değer, yazı dilindeki karşılığına çevirilir.Yazı diline çevirilen değer bir önceki değer ile eşit değilse yer değiştirir.
- 7) Iceriği değiştirilen cümle için her seferinde 3 adımına geri dönülür. Bu adıma geri dönüldüğünde bir önceki hesaplanan hece sayısının değeri yeni hesaplanan hece sayısının değeri ile aynı ise bir sonraki adıma geçilir aksi takdirde tekrar 3 adımına dönülür.
- 8) Eğer girilen cümlede Z(Harf) isteniyorsa bu adıma başlanır. Aksi takdirde program sonlandırılır.
(i) Girilen cumlede kac tane harf olduğu hesaplanır. Hesaplanan değer yazı dilindeki karşılığına çevirilir. Yazı diline çevirilen değer cümledeki Z alanı ile yer değiştirir.
- 9) Iceriği değiştirilen cümlenin kac tane harf icerdiği tekrar hesaplanır. Hesaplanan değer, yazı dilindeki karşılığına çevirilir.Yazı diline çevirilen değer bir önceki değer ile eşit değilse yer değiştirir.
- 10) Içeriği güncellenen cümle için her seferinde 3 adımına geri dönülür. Bu adıma geri dönüldüğünde bir önceki hesaplanan harf sayısının değeri ile yeni hesaplanan harf sayısının değeri aynı ise program sonlandırılır. Aksi takdirde tekrar 3 adımına dönülür.
