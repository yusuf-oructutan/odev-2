# odev-2
En Yakın Komşu Algoritması
En Yakın Komşu (EK) algoritması, sınıflandırma ve kümeleme gibi makine öğrenmesi problemlerinde kullanılan bir algoritmadır. Bu algoritma, bir veri noktasını çevresindeki diğer veri noktalarına göre sınıflandırmaya veya kümelemeye yardımcı olur.
EK algoritması, veriler arasındaki benzerlikleri ölçmek için kullanılan bir mesafe metriği (örneğin, Euclidean mesafesi) kullanarak çalışır. Algoritmanın temel fikri, sınıflandırılacak veya kümeleme yapılacak bir veri noktasının en yakın komşularının sınıf veya küme etiketlerini kullanarak veri noktasını sınıflandırmak veya kümelemektir.
EK algoritmasının çalışma şekli şu adımlardan oluşur:
1-Öncelikle, verilerin bir özellik uzayında temsil edildiği bir veri kümesi alınır.
2-EK algoritması, yeni bir veri noktasını alır ve çevresindeki veri noktalarının mesafelerini hesaplar.
3-En yakın k komşuyu (k bir kullanıcı tarafından belirlenir) seçer ve bu komşuların sınıf veya küme etiketlerini analiz eder.
4-Veri noktası, en çok rastlanan sınıf etiketine veya en yaygın kümeye göre sınıflandırılır veya kümeleme yapılır.
5-Son olarak, modelin performansı doğrulama verileri kullanılarak değerlendirilir ve modelin doğruluğunu artırmak için hiperparametreler ayarlanabilir.
EK algoritması, sınıflandırma ve kümeleme problemlerinde oldukça etkilidir. Özellikle, verilerin boyutu küçük olduğunda veya veriler arasındaki benzerlik yapısı iyi tanımlandığında iyi sonuçlar verir. Ayrıca, EK algoritması, yeni verilerin sınıflandırılması veya kümeleme yapılması gerektiği durumlarda da kullanılabilir.
En Yakın Komşu (EK) algoritmasının çalışma zamanı analizi, veri kümesinin boyutuna, özellik sayısına ve seçilen en yakın komşu sayısına bağlıdır. Veri kümesindeki her veri noktası için, tüm diğer veri noktalarının mesafeleri hesaplanmalıdır. Bu nedenle, algoritmanın çalışma zamanı büyük veri kümelerinde hızlı bir şekilde artar.
En iyi durumda, EK algoritması bir veri noktasını sınıflandırmak veya kümelemek için yalnızca birkaç en yakın komşuyu hesaplamak zorunda kalır. Bu durumda, EK algoritmasının çalışma zamanı O(k), k seçilen en yakın komşu sayısına bağlıdır.
En kötü durumda, EK algoritması tüm veri noktaları arasındaki mesafeleri hesaplamak zorunda kalır. Bu durumda, EK algoritmasının çalışma zamanı O(n^2), n veri noktalarının sayısına bağlıdır.
Ortalama durumda, EK algoritması, veri kümesinin yoğunluğuna ve veriler arasındaki benzerlik yapısına bağlı olarak çalışma zamanı değişebilir. Eğer veriler birbirine benzerse, daha az sayıda en yakın komşu hesaplanabilir ve algoritmanın çalışma zamanı daha düşük olabilir. Ancak, veriler arasındaki benzerlik yapıları farklıysa, algoritmanın çalışma zamanı daha yüksek olabilir.
EK algoritmasının çalışma zamanı analizi, özellikle büyük veri kümeleri üzerinde yüksek hesaplama maliyeti nedeniyle dezavantajlı olabilir. Bununla birlikte, algoritmanın sınıflandırma ve kümeleme performansı genellikle yüksek olduğundan, uygun hiperparametreler seçildiğinde etkili bir makine öğrenmesi aracı olarak kullanılabilir.

Shift Or algorithm
Shift Or algoritması, bir bit dizisinde belirli bir değere eşit veya daha büyük olan en küçük sayıyı bulmak için kullanılan bir algoritmadır.
Bu algoritma, veri yapıları, sıralama algoritmaları ve veri sıkıştırma gibi birçok alanda kullanılabilir. Özellikle, bellek yönetimi ve ağ protokollerinde de kullanılabilir.
Shift Or algoritmasının çalışma şekli, öncelikle bir bit dizisi içinde belirli bir değere eşit veya daha büyük olan en küçük sayıyı bulmak için tasarlanmıştır. Algoritmanın çalışması, bit düzeyinde yapılan işlemlere dayanır.
Algoritma, öncelikle, verilen bit dizisindeki tüm bitleri sağa doğru kaydırır. Daha sonra, belirli bir değere eşit veya daha büyük olan en küçük sayıyı bulmak için, belirli bir değerle bitlerin OR işlemi yapar. Eğer OR işlemi sonucunda hedef değere ulaşılırsa, algoritma işlemini durdurur ve bu değeri döndürür. Aksi takdirde, bit dizisi sağa doğru kaydırılmaya devam eder ve işlem tekrarlanır.
Shift Or algoritması, özellikle büyük boyutlu bit dizilerinde bile oldukça hızlı ve verimlidir. Bununla birlikte, bazı durumlarda hedef değere eşit veya daha büyük olan en küçük sayı bulunamayabilir, bu durumda algoritma sonlandırılır ve uygun bir mesaj verilir.
Shift Or algoritmasının en iyi, en kötü ve ortalama durum analizleri aşağıdaki gibi açıklanabilir:
En iyi durumda, Shift Or algoritması, bit dizisi içinde hedef değere eşit veya daha büyük olan en küçük sayıyı hemen bulabilir. Bu durumda, algoritmanın çalışma zamanı O(1) olacaktır.
En kötü durumda, Shift Or algoritması, bit dizisi içinde hedef değere eşit veya daha büyük olan en küçük sayıyı bulmak için bit dizisi boyutuna bağlı olarak en fazla log2(n) kez kaydırma işlemi yapmak zorunda kalacaktır. Bu durumda, algoritmanın çalışma zamanı O(log n) olacaktır.
Ortalama durumda, Shift Or algoritması, bit dizisi içinde hedef değere eşit veya daha büyük olan en küçük sayıyı bulmak için log2(n)/2 kez kaydırma işlemi yapacaktır. Bu durumda, algoritmanın çalışma zamanı O(log n) olarak hesaplanır.
Algoritmanın çalışma zamanı, özellikle büyük bit dizileri için oldukça hızlıdır. Ancak, hedef değere eşit veya daha büyük olan en küçük sayı bulunamazsa, algoritmanın çalışma zamanı daha uzun olabilir. Bu nedenle, Shift Or algoritması, özellikle bellek yönetimi ve ağ protokollerinde kullanıldığında, yeterli hata işleme yöntemleriyle birlikte kullanılmalıdır.
