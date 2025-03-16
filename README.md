# CRM Optimizasyonu

Bu proje, dinamik programlama tekniklerini kullanarak müşteri destek temsilcisi yönlendirme ve pazarlama kampanyası seçimi problemlerini optimize eden bir CRM sistemini içermektedir.

## İçerik

- **Müşteri Destek Temsilcisi Yönlendirme**: Müşteri taleplerine ve temsilcilerin uygunluğuna göre yönlendirme yapan bir algoritma.
- **Pazarlama Kampanyası Seçimi**: Belirli bir bütçe dahilinde en yüksek yatırım getirisini (ROI) sağlayacak kampanyaları seçen bir algoritma.

## Kullanılan Algoritmalar

1. **Müşteri Destek Temsilcisi Yönlendirme**
   - Dinamik Programlama ve Bitmasking kullanılarak optimize edilmiştir.
   - Temsilci atama işlemi, minimum maliyetle yapılacak şekilde tasarlanmıştır.
   
2. **Pazarlama Kampanyası Seçimi**
   - Knapsack (Sırt Çantası) Problemi yaklaşımı kullanılmıştır.
   - En yüksek ROI sağlayan kampanyalar bütçe sınırları dahilinde seçilmiştir.

## Dosya Yapısı

- **src/**: Proje kodlarının bulunduğu klasör.
- **README.md**: Proje açıklamalarını içeren bu dosya.
- **video.mp4**: Algoritmaların açıklamalarını içeren sunum videosu.
- **docs/**: Detaylı dokümantasyon.

## Çalıştırma Talimatları

1. Proje dizinine gidin:
   ```bash
   cd CRM_Optimization
   ```
2. Java dosyasını derleyin ve çalıştırın:
   ```bash
   javac Main.java
   java Main
   ```

## Çıktı Örneği

```
Minimum temsilci yönlendirme maliyeti: XX
Maksimum pazarlama getirisi: YY
```

## Neden Dinamik Programlama?

- Alt problemleri çözerek büyük problemi optimize eder.
- Tekrar eden hesaplamaları önler ve verimliliği artırır.
- Alternatif yaklaşımlara kıyasla daha düşük zaman karmaşıklığı sunar.

## Kaynaklar ve Kullanılan Kütüphaneler

- **Java Collections Framework**
- **Matematiksel optimizasyon prensipleri**

Bu proje, müşteri destek süreçlerini ve pazarlama yatırımlarını optimize etmek için tasarlanmıştır. Daha fazla bilgi için kaynak kodlara ve video anlatımına göz atabilirsiniz.

