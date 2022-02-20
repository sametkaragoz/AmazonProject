Feature: Kullanici bir urun aradiginda, listelenen tum urunler aranan kelimeyi icermeli.
  Scenario: Kullanicin aradigi urunlerde, aranan kelime bulunmali.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Arama butonuna aranan kelime yazilir ve aranir.
   Then Listelenen urunlerin basliginin aranan kelimeyi icerdigi test edilir.