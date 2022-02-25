@US008
Feature: Kullanici shoppingList olusturabilmeli ve silebilmeli.
  Scenario: Kullanici bir Shopping List olusturabilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Account & Lists acilir sekmesinde Create a List linkine tiklar.
   And  Yeni Shopping List'e isim verir ve Create List butonuna tiklar.
   Then Your Lists sekmesi altinda yeni olusturulan listenin gorunurlugu test edilir.