@US007
Feature: Kullanici ana sayfanin alt kismindaki linklerden herhangi bir satir ya da sutundaki linklerin dogru sayfaya yonlendirdiginden emin olmali
  Scenario: Kullanici amazon.com sayfasinda en altta bulunan linklerden birine tikladiginda dogru sayfaya yonlendirilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Sayfanin en altinda bulunan bir linke tiklar.
   Then Acilan sayfanin tikladigi link ile eslestigini kontrol eder.