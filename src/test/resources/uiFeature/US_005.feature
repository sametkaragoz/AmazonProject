@US005
Feature: Kullanici urun listeleme isleminde filtrelemeleri ve siralamalari kullanabilmeli
  Scenario: Kullanici listelenen urunleri istedigi turde siralayabilmeli ve sonuclari filtreleyebilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Arama butonuna aranan kelime yazilir ve aranir.
   And  Acilan sayfanin solundaki filtreleme kategorilerinden secim yaparak arama filtrelenebilmeli.
   Then Acilan sayfanin sag ustunde siralama gorevi goren Sort by: butonuna basilarak dort turde siralama yapilabilmeli.