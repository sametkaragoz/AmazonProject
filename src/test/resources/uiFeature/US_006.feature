Feature: Kullanici rastgele urunler secmeli ve sepete ekleyebilmeli. Eklenen urunlerin fiyat toplami ile sepetteki toplamin ayni oldugunu gormeli
  Scenario: Kullanici sectigi urunleri sepete ekleyebilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Arama butonuna aranan kelime yazilir ve aranir.
   And  Listeden aranan urun secilir ve tiklanir.
   Then Urun sayfasinda 'Add to Cart' butonuna basilarak urun sepete eklenir.

  Scenario: Kullanicinin sepete ekledigi urunlerin fiyatlari toplami sepetteki ara toplama esit olmali.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Arama butonuna aranan kelime yazilir ve aranir.
   And  Listeden aranan urun secilir ve tiklanir.
   And  Urun sayfasinda 'Add to Cart' butonuna basilarak urun sepete eklenir.
   Then Tum urunlerin toplam fiyatinin sepetteki ara toplama esit oldugu test edilir.