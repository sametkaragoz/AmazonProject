Feature: Kullanici ALL menusunden herhangi bir kategori secebilmeli ve alt kategorilerin listelendigini gorebilmeli.
  Scenario: Kullanici All menusunde Shop By Department sekmesi altindaki Computers kategorisini secebilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Amazon logosu altindaki ALL menusune tiklar.
   And  Acilan menulerde Shop By Department sekmesi altindaki Computers kategorisine tiklar.
   Then Acilan menunun Computers kategorisine ait oldugunu kontrol eder.

  Scenario:  Secilen Computers kategorisi altinda 15 tane alt kategori oldugu gozukmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Amazon logosu altindaki ALL menusune tiklar.
   And  Acilan menulerde Shop By Department sekmesi altindaki Computers kategorisine tiklar.
   Then Computers kategorisi altinda 15 adet alt kategorinin isimleriyle beraber listelendigini kontrol eder.